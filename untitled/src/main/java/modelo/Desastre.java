package modelo;

public class Desastre {
    private boolean climatologico;
    private boolean biologico;
    private boolean hidrologico;
    private boolean metereologico;
    private boolean geofisico;

    public Desastre(boolean climatologico, boolean biologico, boolean hidrologico, boolean metereologico, boolean geofisico) {
        this.climatologico = climatologico;
        this.biologico = biologico;
        this.hidrologico = hidrologico;
        this.metereologico = metereologico;
        this.geofisico = geofisico;
    }

    @Override
    public String toString() {
        return "Desastre{" +
                "climatologico=" + climatologico +
                ", biologico=" + biologico +
                ", hidrologico=" + hidrologico +
                ", metereologico=" + metereologico +
                ", geofisico=" + geofisico +
                '}';
    }
}
