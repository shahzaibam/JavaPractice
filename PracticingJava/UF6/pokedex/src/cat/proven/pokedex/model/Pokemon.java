package cat.proven.pokedex.model;

import java.util.Objects;

/**
 *
 * @author ProvenSoft
 */
public class Pokemon {

    private int id;
    private String name;
    private double height;
    private double weight;
    private Genre genre;
    private PokemonType tipo;

    /* faltaria si lo implementais atributo para la evolution;*/

    public Pokemon(int id, String name, double height, double weight, Genre genre, PokemonType type) throws PesoException, HeightException {
        this.id = id;
        this.name = name;
        
        if (this.height < 0) {
            throw new HeightException();
        } else {
            this.height = height;
        }
        
        if (this.weight < 0) {
            throw new PesoException();
        } else {
            this.weight = weight;
        }
        this.genre = genre;
        this.tipo = type;
    }


    /*podeis añadir constructores que necesiteis*/
 /*getters y seeter necesario*/
 /*toString tambien*/
 /*pokemon es igual a otro por su nombre*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public PokemonType getTipo() {
        return tipo;
    }

    public void setTipo(PokemonType tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokemon{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", genre=").append(genre);
        sb.append(", tipo_id=").append(tipo.getId());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pokemon)) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (Objects.equals(this.name, other.name)) 
        {
            return true;
        } 
        else 
        {
            return this.id == other.id;
        }
    }

}
