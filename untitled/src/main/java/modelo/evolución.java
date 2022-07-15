package modelo;

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
        detalleDesastre();
    }
    public evolución(){

    }
    private void detalleDesastre(){
        desastres = new ArrayList<>();
        desastres.add(new Desastre(true,true,true,false,false));

    }
    public Desaparecidos listaDesaparecidos(){
        desaparecidos = new ArrayList<>();

        return null;
    }

    public int getAnioI() {
        return anioI;
    }

    public int getAnioF() {
        return anioF;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Desaparecidos> getDesaparecidos() {
        return desaparecidos;
    }

    public ArrayList<Desastre> getDesastres() {
        return desastres;
    }
}
