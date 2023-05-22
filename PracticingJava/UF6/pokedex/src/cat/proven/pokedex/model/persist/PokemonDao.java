package cat.proven.pokedex.model.persist;

import cat.proven.pokedex.model.Genre;
import cat.proven.pokedex.model.HeightException;
import cat.proven.pokedex.model.PesoException;
import cat.proven.pokedex.model.Pokemon;
import cat.proven.pokedex.model.PokemonType;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class PokemonDao {

    private final DbConnect dbConnect;

    public PokemonDao(DbConnect connect) {
        this.dbConnect = connect;
    }

    //TODO
    /**
     * metodo que servira para seleccionar segun el id
     *
     * @param id le vamos a pasar
     * @return el Pokemon encontrado
     * @throws SQLException
     * @throws PesoException
     */
    public Pokemon selectWhereId(int id) throws SQLException, PesoException, HeightException {
        Pokemon pok;
        Connection conn = dbConnect.getConnection();

        if (conn != null) {
            String query = "select * from pokemons where id=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, id);

            ResultSet cursor_rs = st.executeQuery();

            if (cursor_rs.next()) {
                pok = pokemonFromResultSet(cursor_rs);
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
     * esta funcion inserta un pokemon en la bbdd
     *
     * @param add la info que le pasamos del Pokemon, la escribirá
     * @return el numero de Pokemons insertados.
     * @throws SQLException
     * @throws PesoException
     * @throws cat.proven.pokedex.model.HeightException
     */
    public int insertPokemon(Pokemon add) throws SQLException, PesoException, HeightException {
        int result = 0;
        //get a connection and perform query

        Connection conn = dbConnect.getConnection();
        String query = "insert into pokemons values (?, ?, ?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, add.getId());
        st.setString(2, add.getName());

        st.setDouble(3, add.getHeight());

        st.setDouble(4, add.getWeight());

        st.setString(5, add.getGenre().toString());
        st.setInt(6, add.getTipo().getId());

        result = st.executeUpdate();

        return result;
    }

    /**
     * metodo que selecciona todos los pokemons que existen y los muestra
     *
     * @return lista de pokemons que existen
     * @throws SQLException
     * @throws PesoException
     */
    public List<Pokemon> selectPokemon() throws SQLException, PesoException, HeightException {
        List<Pokemon> result = new ArrayList<>();

        //get a connection and perform query
        Connection conn = dbConnect.getConnection();

        if (conn != null) {
            Statement st = conn.createStatement();
            String query = "select * from pokemons;";
            ResultSet cursor_rs = st.executeQuery(query);

            while (cursor_rs.next()) {
                //crear pokemon
                Pokemon pok = pokemonFromResultSet(cursor_rs);

                result.add(pok);
            }

            cursor_rs.close();
            st.close();
            conn.close();

            return result;

        } else {

            return null;
        }
    }

    /**
     * este metodo selecciona un Pokemon segun el nombre del PokemonType
     *
     * @param name es el nombre que le pasamos
     * @return retorna la lista de los que encuentra
     * @throws SQLException
     * @throws PesoException
     */
    public List<Pokemon> selectPokemonByType(String name) throws SQLException, PesoException, HeightException {
        List<Pokemon> result = new ArrayList<>();

        Connection conn = dbConnect.getConnection();

        if (conn != null) {
            Statement st = conn.createStatement();
            String query = "select pokemons.id, pokemons.name, pokemons.height, pokemons.weight, pokemons.genre, pokemons.type_id from pokemons "
                    + "INNER JOIN pokemontypes ON pokemons.type_id=pokemontypes.id where pokemontypes.name = " + "'" + name + "'";

            ResultSet cursor_rs = st.executeQuery(query);

            while (cursor_rs.next()) {
                Pokemon pok = pokemonFromResultSet(cursor_rs);

                result.add(pok);
            }

            cursor_rs.close();
            st.close();
            conn.close();

            return result;
        } else {
            return null;
        }
    }

    /**
     * este metodo elimina un pokemon según el id que le pasemos.
     *
     * @param pokemonId id que queremos eliminar
     * @return numero de Pokemons eliminados
     * @throws SQLException
     */
    public int deletePokemonByID(int pokemonId) throws SQLException {
        int deleted = 0;

        Connection conn = dbConnect.getConnection();

        if (conn != null) {
            Statement st = conn.createStatement();
            String query = "DELETE FROM pokemons WHERE id =" + pokemonId;

            deleted = st.executeUpdate(query);

        } else {
            deleted = -1;
        }

        return deleted;
    }

    /**
     * este metodo selecciona toda la informacion del pokemon segun su nombre
     *
     * @param name el nombre del pokemon que queremos ver
     * @return Lista de los pokemons que encontramos
     * @throws SQLException
     * @throws PesoException
     */
    public List<Pokemon> selectByPokemonName(String name) throws SQLException, PesoException, HeightException {

        List<Pokemon> result = new ArrayList<>();

        Connection conn = dbConnect.getConnection();

        if (conn != null) {
            String query2 = "select pokemons.id, pokemons.name, pokemons.height, pokemons.weight, "
                    + "pokemons.genre, pokemons.type_id from pokemons "
                    + "where pokemons.name =" + "'" + name + "'";

            PreparedStatement ps = conn.prepareStatement(query2);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pokemon pok = pokemonFromResultSet(rs);

                result.add(pok);
            }

            rs.close();
            ps.close();
            conn.close();
        } else {
            return null;
        }

        return result;
    }

    private Pokemon pokemonFromResultSet(ResultSet cursor_rs) throws SQLException, PesoException, HeightException {
        int id = cursor_rs.getInt("id");
        String name = cursor_rs.getString("name");
        Double height = cursor_rs.getDouble("height");
        Double weight = cursor_rs.getDouble("weight");
        String genre = cursor_rs.getString("genre");
        Genre genereType = Genre.valueOf(genre);
        int poktype = cursor_rs.getInt("type_id");

        Pokemon pok = new Pokemon(id, name, height, weight, genereType, new PokemonType(poktype));

        return pok;
    }

}
