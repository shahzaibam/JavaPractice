package cat.proven.pokedex;

import cat.proven.menu.Menu;
import cat.proven.pokedex.model.Genre;
import cat.proven.pokedex.model.HeightException;
import cat.proven.pokedex.model.PesoException;
import cat.proven.pokedex.model.Pokemon;
import cat.proven.pokedex.model.PokemonModel;
import cat.proven.pokedex.model.PokemonType;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ProvenSoft
 */
public class PokedexUI {

    private final Menu mainMenu;
    private final Scanner uiReader;

    private final PokemonModel model;

    public PokedexUI() throws ClassNotFoundException {
        this.model = new PokemonModel();
        mainMenu = new MainMenu();
        uiReader = new Scanner(System.in);
        uiReader.useDelimiter("\n");
    }

    /**
     * Main method
     *
     * @param args argument for command line invocation (not necessari here)
     */
    public static void main(String[] args) {
        //instantiate presentation class
        PokedexUI ap;
        try {
            ap = new PokedexUI();
            //start interacting with user
            ap.start();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found: " + ex.getMessage());
        }

    }

    /**
     * application logic entry point
     */
    public void start() {
        boolean exit = false;  //set exit flag to false
        //control loop
        do {
            //display menu and read user's choice
            mainMenu.show();
            int action = mainMenu.getSelectedOptionActionCommand();

            //process user's choice: one control method for each functionality
            switch (action) {
                case 0:  //exit application
                    exit = doExit();
                    break;
                case 1:  //Add new pokemon
                    //TODO
                    doAddPokemon();
                    break;
                case 2:  //Add Pokemon Type
                    //TODO
                    doAddPokemonType();
                    break;
                case 3:  //List all pokemons
                    //TODO
                    doListAllPokemons();
                    break;
                case 4:  //List pokemons by type
                    //TODO
                    listByType();
                    break;
                case 5:  //[5] Remove a pokemon
                    deleteById();
                    break;
                case 6:  //[6] Change type attack name
                    //TODO
                    updateByName();
                    break;
                case 7:  //[7] Delete types and all associated pokemons
                    //TODO
                    deletedByIDPokemonType();
                    break;
                case 8:  //[8] Show pokemon which evolutions to
                    //TODO

                    break;
                case 9:  //[10] Show Full Data Pokemon
                    //TODO
                    showPokemonByName();
                    break;
                default:  //default option
                    doDefault();
                    break;
            }
        } while (!exit);
    }

    /* ============ CONTROL METHODS ============ */
    /**
     * asks for confirmation and exits application
     */
    public boolean doExit() {
        boolean confirm = doConfirm("Sure to exit? ");
        return confirm;
    }

    /**
     * process default action
     */
    public void doDefault() {
        //System.out.println("Unknown option!");
        System.out.println("Not implemented yet!");  //TODO replace when all options implemented
    }

    /* ============ VIEW METHODS ============ */
    /**
     * displays a message to user
     *
     * @param message the message to display
     */
    public void doAlert(String message) {
        System.out.println(message);
    }

    /**
     * displays a message and gets ans answer from user
     *
     * @param message the message to display
     * @return user's answer
     */
    public String doInput(String message) {
        System.out.print(message);
        return uiReader.next();
    }

    /**
     * displays a message to user and asks for confirmation
     *
     * @param message the message to display
     * @return true is user confirms action, false otherwiser
     */
    public boolean doConfirm(String message) {
        final char yesAnswer = 'y';
        System.out.print(message);
        char answer = uiReader.next().toLowerCase().charAt(0);
        return (answer == yesAnswer);
    }

    /**
     * este metodo pide los datos del Pokemon para insertar y crea un Pokemon
     * con esos datos para almacenarlo
     *
     * @return Pokemon
     */
    public Pokemon doInputPokemon() {
        Pokemon add = null;

        //TODO
        try {
            String id = doInput("Id pokemon?: ");
            int id_2 = Integer.parseInt(id);
            String name = doInput("Name pokemon?: ").toLowerCase();

            if (name.trim().isEmpty()) {
                throw new NullPointerException("Nombre no puede ser nulo o vacío");
            }

            String height = doInput("Height pokemon?: ");
            double height_2 = Double.parseDouble(height);

            if (height_2 < 0) {
                throw new HeightException();
            }

            String weight = doInput("Weight pokemon?: ");

            double weight_2 = Double.parseDouble(weight);

            if (weight_2 < 0) {
                throw new PesoException();
            }

            String genre = doInput("Genre pokemon?: ").toLowerCase();
            Genre genre_2 = Genre.valueOf(genre);
            String poktype = doInput("Pokemon Type: ");
            int poktype_2 = Integer.parseInt(poktype);
            add = new Pokemon(id_2, name, height_2, weight_2, genre_2, new PokemonType(poktype_2));
        } catch (PesoException ex) {
            System.out.println("Peso es incorrecto " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Porfavor introduce un numero " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Argumento esta mal " + ex.getMessage());
        } catch (HeightException ex) {
            System.out.println("Altura es incorrecta " + ex.getMessage());
        }

        return add;
    }

    /**
     * llamamos al metodo insertar Pokemon desde el modelo este metodo
     * interactua directamente con el usuario
     */
    private void doAddPokemon() {
        Pokemon pok = doInputPokemon();

        if (pok != null) {
            int result;
            try {
                result = model.addPokemon(pok);
                if (result > 0) {
                    System.out.println("Pokemon added ...");
                    System.out.println("se han insertado " + result + " pokemons");
                } else {
                    System.out.println("Pokemon not added ...");
                }

            } catch (SQLException ex) {
                System.out.println("Error sql " + ex.getMessage());
            } catch (PesoException ex) {
                System.out.println("Peso introducido incorrecto " + ex.getMessage());
            } catch (HeightException ex) {
                System.out.println("Altura introducida incorrecta " + ex.getMessage());
            }
        }

    }

    /**
     * este metodo pide datos para crear un PokemonType
     *
     * @return PokemonType
     */
    public PokemonType doInputTypePokemon() {
        PokemonType type_add = null;

        //TODO
        int id = 0;
        String name = doInput("Name pokemonType?: ").toLowerCase();
        String attack = doInput("Attack pokemon?: ").toLowerCase();
        type_add = new PokemonType(id, name, attack);

        return type_add;
    }

    /**
     * este metodo hace un get a los datos que se han pedido en el metodo
     * doInputTypePokemon(), y inserta el PokemonType
     */
    private void doAddPokemonType() {
        PokemonType pok = doInputTypePokemon();

        if (pok != null) {
            int result;
            try {
                result = model.addPokemon_Type(pok);
                if (result == 1) {
                    System.out.println("PokemonType added ...");
                } else {
                    System.out.println("PokemonType not added ...");
                }

            } catch (SQLException ex) {
                System.out.println("Error sql " + ex.getMessage());
            } catch (PesoException ex) {
                System.out.println("Peso introducido incorrecto " + ex.getMessage());
            }
        }

    }

    /**
     * este metodo selecciona todos los Pokemons y los muestra
     */
    private void doListAllPokemons() {
        List<Pokemon> pokemons;
        try {
            pokemons = model.findAllPokemons();

            for (Object pokemon : pokemons) {
                System.out.println(pokemon);
            }

            System.out.println("se han mostrado " + pokemons.size() + " pokemons");

        } catch (SQLException ex) {
            System.out.println("Error sql " + ex.getMessage());
        } catch (PesoException ex) {
            System.out.println("Peso introducido incorrecto " + ex.getMessage());
        } catch (HeightException ex) {
            System.out.println("Altura introducida incorrecta " + ex.getMessage());
        }

    }

    /**
     * este metodo selecciona el Pokemon según el nombre del PokemonType que le
     * pasemos
     */
    private void listByType() {
        List<Pokemon> pokemons;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre del tipo de pokemon");

        String name = sc.nextLine().toLowerCase();

        try {
            pokemons = model.findPokemonPerType(name);

            if (pokemons.isEmpty()) {
                System.out.println("No existen pokemons de este tipo");
            } else {
                for (Pokemon pokemon : pokemons) {
                    System.out.println(pokemon);
                }

                System.out.println("Se han mostrado " + pokemons.size() + " pokemons");
            }

        } catch (SQLException ex) {
            System.out.println("Error sql " + ex.getMessage());
        } catch (PesoException ex) {
            System.out.println("Peso introducido incorrecto " + ex.getMessage());
        } catch (HeightException ex) {
            System.out.println("Altura introducida incorrecta " + ex.getMessage());
        }

    }

    /**
     * Este metodo elimina un Pokemon según el id que le pasemos
     */
    private void deleteById() {
        Scanner sc = new Scanner(System.in);

        int pokemonsEliminados = 0;

        try {

            System.out.println("Escribe el id del pokemon para eliminarlo");
            int id = sc.nextInt();
            pokemonsEliminados = model.deleteById(id);

        } catch (SQLException ex) {
            System.out.println("Error sql " + ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Escribe un numero porfavor");
        }

        System.out.println("Se han eliminado " + pokemonsEliminados + " pokemons");

    }

    /**
     * Este metodo pregunta el nombre del PokemonType que quieres cambiar, y lo
     * cambia por el nuevo
     */
    private void updateByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre del pokemon type que quieres cambiar");
        String oldName = sc.nextLine().toLowerCase();

        System.out.println("Escribe el nuevo nombre del attack");
        String newName = sc.nextLine().toLowerCase();

        int pokemonTypeUpdated;

        try {
            pokemonTypeUpdated = model.updateAtackName(oldName, newName);

            if (pokemonTypeUpdated == -1) {
                System.out.println("Se han actualizado 0 pokemons");
            } else {
                System.out.println("Se han actualizado " + pokemonTypeUpdated + " pokemons");
            }
        } catch (SQLException ex) {
            System.out.println("Error sql " + ex.getMessage());
        }

    }

    /**
     * Este metodo pide el id del PokemonType, y lo elimina también eliminará
     * todos aquellos Pokemon que sean de ese tipo
     */
    private void deletedByIDPokemonType() {
        Scanner sc = new Scanner(System.in);
        int pokemonDeleted = 0;

        try {
            System.out.println("Escribe el id del PokemoType--");
            int id = sc.nextInt();

            pokemonDeleted = model.deletedPokemonTypes(id);

        } catch (SQLException ex) {
            System.out.println("Error sql " + ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Escribe un numero profavor " + ex.getMessage());
        }

        System.out.println("Se han actualizado " + pokemonDeleted + " pokemons");

    }

    /**
     * Este metodo pide el nombre de un Pokemon, y muestra toda la informacion
     */
    private void showPokemonByName() {
        List<Pokemon> pokemons;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre del pokemon");

        String name = sc.nextLine().toLowerCase();

        try {
            pokemons = model.findPokemonByName(name);

            for (Pokemon pokemon : pokemons) {
                System.out.println(pokemon);
            }

            System.out.println("Se han mostrado " + pokemons.size() + " pokemons");

        } catch (SQLException ex) {
            System.out.println("Error sql " + ex.getMessage());
        } catch (PesoException ex) {
            System.out.println("Peso introducido incorrecto " + ex.getMessage());
        } catch (HeightException ex) {
            System.out.println("Altura introducida incorrecta " + ex.getMessage());
        }

    }

}
