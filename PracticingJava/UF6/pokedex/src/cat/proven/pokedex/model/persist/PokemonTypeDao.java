package cat.proven.pokedex.model.persist;

import cat.proven.pokedex.model.PesoException;
import cat.proven.pokedex.model.PokemonType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ProvenSoft
 */
public class PokemonTypeDao {

    private final DbConnect dbConnect;

    public PokemonTypeDao(DbConnect connect) {
        this.dbConnect = connect;
    }

    //TODO
    
    /**
     * este metodo selecciona el PokemonType segun el nombre que le pasemos
     * @param name nombre del PokemonType
     * @return PokemonType
     * @throws SQLException
     * @throws PesoException 
     */
    public PokemonType selectWhereName(String name) throws SQLException, PesoException {
        PokemonType pok;
        Connection conn = dbConnect.getConnection();

        if (conn != null) {
            String query = "select * from pokemontypes where name=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, name);

            ResultSet cursor_rs = st.executeQuery();

            if (cursor_rs.next()) {
                pok = pokemonTypeFromResultSet(cursor_rs);
            } else {
                pok = null;
            }

            cursor_rs.close();
            st.close();
            conn.close();

            return pok;

        } else {
            return null;
        }

    }

    /**
     * este metodo inserta los tipos de pokemon
     * @param add es el pokemonType que le pasamos con su informacion, el nombre y el ataque
     * @return el numero de pokemons añadidos
     * @throws SQLException 
     */
    public int insertPokemonType(PokemonType add) throws SQLException {
        int result = 0;
        //get a connection and perform query

        Connection conn = dbConnect.getConnection();
        String query = "insert into pokemontypes values (null, ?, ?)";
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, add.getName());
        st.setString(2, add.getAttack());

        result = st.executeUpdate();

        return result;
    }

    
    /**
     * este metodo pregunta por el nombre actual del pokemon type, si existe, lo cambia por el nuevo nombre
     * que le ha pasado el usuario
     * @param actualNombreTipo --> nombre actual
     * @param nuevoNombreAtac --> nombre nuevo
     * @return el numero de filas afectadas
     * @throws SQLException 
     */
    public int cambiarNomAtac(String actualNombreTipo, String nuevoNombreAtac) throws SQLException {
        int resultNomActual = 0;
        int resultNomNew = 0;

        Connection conn = dbConnect.getConnection();

        if (conn != null) {
            Statement st = conn.createStatement();
            String query = "SELECT * FROM pokemontypes WHERE name ='" + actualNombreTipo + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                String query2 = "UPDATE pokemontypes SET attack ='" + nuevoNombreAtac + "' WHERE name ='" + actualNombreTipo + "'";
                resultNomNew = st.executeUpdate(query2);
            } else {
                resultNomNew = -1;
            }
        } else {
            resultNomActual = -2;
        }

        return resultNomNew;
    }

    
    /**
     * este metodo elimina el tipo de pokemon segun el id que le pasemos, 
     * y todos aquellos pokemons que esten asociados a ese tipo
     * @param idTipo es el id que le pasamos para eliminar el PokemonType
     * @return el numero de filas afectadas
     * @throws SQLException 
     */
    public int deleteTypesAndPokemons(int idTipo) throws SQLException {
        int resultTypes = 0;
        int resultPok = 0;

        int eliminadosTotal = 0;

        Connection conn = dbConnect.getConnection();

        if (conn != null) {
            Statement st = conn.createStatement();
            String query = "SELECT * FROM pokemontypes WHERE id ='" + idTipo + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {

                String query2 = "DELETE FROM pokemons WHERE type_id ='" + idTipo + "'";
                resultPok = st.executeUpdate(query2);
                
                
                String query3 = "DELETE FROM pokemontypes" + " WHERE id ='" + idTipo + "'";
                resultTypes = st.executeUpdate(query3);

            } else {
                resultTypes = -1;
                resultPok = -1;
            }

        } else {
            resultTypes = -2;
            resultPok = -2;
        }

        eliminadosTotal = resultTypes + resultPok;

        return eliminadosTotal;
    }

    private PokemonType pokemonTypeFromResultSet(ResultSet cursor_rs) throws SQLException, PesoException {
        int id = cursor_rs.getInt("id");
        String name = cursor_rs.getString("name");
        String attack = cursor_rs.getString("attack");

        PokemonType pok = new PokemonType(id, name, attack);

        return pok;
    }

}
