package cat.proven.categprods.model.persist;

import cat.proven.categprods.model.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for category table
 *
 * @author ProvenSoft
 */
public class CategoryDao {

    private final DbConnect dbConnect;

    public CategoryDao(DbConnect connect) {
        this.dbConnect = connect;
    }

    private Category fromResultSet(ResultSet rs) throws SQLException {
        Category cat;
        long id = rs.getLong("id");
        String code = rs.getString("code");
        String name = rs.getString("name");
        cat = new Category(id, code, name);
        return cat;
    }

    public int insert(Category category) throws SQLException {
        int result = 0;
        //get a connection and perform query
        try ( Connection conn = dbConnect.getConnection()) {
            String query = "insert into categories values (null, ?, ?)";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, category.getCode());
            st.setString(2, category.getName());
            result = st.executeUpdate();
        }        
        return result;
    }

    public int update(Category currentCategory, Category updatedCategory) throws SQLException {
        int result = 0;
        //get a connection and perform query
        try ( Connection conn = dbConnect.getConnection()) {
            String query = "update categories set" + 
                           "code=?, name=?" +   
                           "where id=?";
                           
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, updatedCategory.getCode());
            st.setString(2, updatedCategory.getName());
            st.setLong(3, currentCategory.getId());
            result = st.executeUpdate();
        }       
        return result;        
    }
    
    public Category select(Category category) throws SQLException {
        Category cat = null;
        //get a connection and perform query
        try ( Connection conn = dbConnect.getConnection()) {
            String query = "select * from categories where id=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setLong(1, category.getId());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                cat = fromResultSet(rs);

            } else {
                cat = null;
            }
        } 
        return cat;
    }
    
    public Category selectWhereCode(String code) throws SQLException {
        Category cat = null;
        //get a connection and perform query
        try ( Connection conn = dbConnect.getConnection()) {
            String query = "select * from categories where code=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, code);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                cat = fromResultSet(rs);
 
            } else {
                cat = null;
            }
        } 
        return cat;
    }
    
    public Category selectWhereName(String name) throws SQLException {
        Category cat = null;
        //get a connection and perform query
        try ( Connection conn = dbConnect.getConnection()) {
            String query = "select * from categories where name=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                cat = fromResultSet(rs);

            } else {
                cat = null;
            }
        } 
        return cat;
    }

    public List<Category> selectAll() throws SQLException {
        List<Category> result = new ArrayList<>();
        //get a connection and perform query
        try ( Connection conn = dbConnect.getConnection()) {
            String query = "select * from categories";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Category cat = fromResultSet(rs);
                if (cat != null) {
                    result.add(cat);
                }
            }
        } 
        return result;
    }

}
