package cat.proven.pokedex.model;

import java.util.Objects;

/**
 *
 * @author ProvenSoft
 */
public class PokemonType {

    private int id;
    private String name;
    private String attack;

    public PokemonType(int id, String name, String attack) {
        this.id = id;
        this.name = name;
        this.attack = attack;
    }
    
    public PokemonType(String name, String attack) {
        this.name = name;
        this.attack = attack;
    }
    public PokemonType(int id) {
        this.id = id;
    }

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

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PokemonType other = (PokemonType) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PokemonType{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", attack=").append(attack);
        sb.append('}');
        return sb.toString();
    }

}
