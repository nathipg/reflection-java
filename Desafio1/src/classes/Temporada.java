package classes;

/**
 *
 * @author nathipg e laionel lellis
 */
//@Root
public class Temporada {
    //@Attribute
    private int id;
    //@Element
    private String arco;
    //@Element
    private int numeroEpisodios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }
    
    
}
