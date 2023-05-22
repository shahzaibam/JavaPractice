package cat.proven.pokedex.model;

import cat.proven.pokedex.model.persist.DbConnect;
import cat.proven.pokedex.model.persist.PokemonDao;
import cat.proven.pokedex.model.persist.PokemonTypeDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class PokemonModel {

    private DbConnect dbConnect = null;
    private final PokemonDao pokemonDao;
    private final PokemonTypeDao pokemon_T_Dao;

    public PokemonModel() throws ClassNotFoundException {
        dbConnect = new DbConnect();
        DbConnect.loadDriver();

        this.pokemonDao = new PokemonDao(dbConnect);
        this.pokemon_T_Dao = new PokemonTypeDao(dbConnect);
    }

    //TODO
    
    
    /**
     * se esta llamando el metodo insertar desde el dao
     * @param add
     * @return
     * @throws SQLException
     * @throws PesoException 
     * @throws cat.proven.pokedex.model.HeightException 
     */
    public int addPokemon(Pokemon add) throws SQLException, PesoException, HeightException {
        int result = 0;

        boolean data_valid = true;

        if (add != null) {
            int id = add.getId();

            if (id < 0) {
                data_valid = false;
            } else {
                Pokemon p = pokemonDao.selectWhereId(id);

                if (p != null) {
                    data_valid = false;
                }
            }

        } else {
            data_valid = false;
        }

        if (data_valid) {
            result = pokemonDao.insertPokemon(add);
        } else {
            result = 0;
        }

        return result;
    }

    /**
     * metodo anyadir Pokemon Type desde el metodo DAO
     * @param add
     * @return
     * @throws SQLException
     * @throws PesoException 
     */
    public int addPokemon_Type(PokemonType add) throws SQLException, PesoException {
        int result = 0;

        boolean data_valid = true;

        if (add != null) {
            String name = add.getName();

            if (name == null) {
                data_valid = false;
            } else {
                PokemonType p = pokemon_T_Dao.selectWhereName(name);

                if (p != null) {
                    data_valid = false;
                }
            }

        } else {
            data_valid = false;
        }

        if (data_valid) {
            result = pokemon_T_Dao.insertPokemonType(add);
        } else {
            result = 0;
        }

        return result;
    }
    
    
    //select all pokemons
    public List<Pokemon> findAllPokemons() throws SQLException, PesoException, HeightException {
        return pokemonDao.selectPokemon();
    }
    
    
    //select pokemon by type
    public List<Pokemon> findPokemonPerType(String name) throws SQLException, PesoException, HeightException {
        
        List<Pokemon> pokemons;
        
        pokemons = pokemonDao.selectPokemonByType(name);
    
        return pokemons;
    }
    
    
    //delete by id
    public int deleteById(int id) throws SQLException {
        
        int deleted = 0;
        
        if(!(id<=0)) {
            deleted = pokemonDao.deletePokemonByID(id);
        }else {
            deleted = -2;
        } 
        
        return deleted; 
    }
    
    //update name pokemon types
    public int updateAtackName(String nameOld, String attackNewName) throws SQLException {
        int updated = 0;
        
        if(nameOld != null && attackNewName !=null) {
            updated = pokemon_T_Dao.cambiarNomAtac(nameOld, attackNewName);
        }else {
            updated = -2;
        }
        
        return updated;
 
    }
    
    
    //delete by pokemonTypes and pokemons
    public int deletedPokemonTypes(int id) throws SQLException {
        int deleted = 0;
        
        if(!(id<=0)) {
            deleted = pokemon_T_Dao.deleteTypesAndPokemons(id);
        }
        
        return deleted;
    }
   
    
    //select pokemons By name
    public List<Pokemon> findPokemonByName(String name) throws SQLException, PesoException, HeightException {
        
        List<Pokemon> pok = null;
        
        if(name!= null) {
            pok = pokemonDao.selectByPokemonName(name);
        }
        
        
        return pok;
    }
    

}
