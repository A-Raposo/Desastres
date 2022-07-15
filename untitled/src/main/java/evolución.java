import java.util.ArrayList;

public class evolución {
    private int anioI;
    private int anioF;
    private String pais;
    private ArrayList<Desaparecidos> desaparecidos;
    private ArrayList<Desastre> desastres;

    public evolución(int anioI, int anioF, String pais) {
        this.anioI = anioI;
        this.anioF = anioF;
        this.pais = pais;
    }
    public void detalleDesastre(){
        desastres = new ArrayList<>();

    }
    public Desaparecidos listaDesaparecidos(){
        desaparecidos = new ArrayList<>();

        return null;
    }
}
