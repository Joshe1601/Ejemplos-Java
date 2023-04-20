import java.util.ArrayList;

public class NetworkManager {
    private String nombreRed;
    private ArrayList<Equipo> listaequiposDisponibles = new ArrayList<>();
    private ArrayList<Equipo> listaEquiposEnUso = new ArrayList<>();
    private ArrayList<Vlan> listaVlan = new ArrayList<>();

    public String getNombreRed() {
        return nombreRed;
    }

    public void setNombreRed(String nombreRed) {
        this.nombreRed = nombreRed;
    }

    public ArrayList<Equipo> getListaequiposDisponibles() {
        return listaequiposDisponibles;
    }

    public void setListaequiposDisponibles(ArrayList<Equipo> listaequiposDisponibles) {
        this.listaequiposDisponibles = listaequiposDisponibles;
    }

    public ArrayList<Equipo> getListaEquiposEnUso() {
        return listaEquiposEnUso;
    }

    public void setListaEquiposEnUso(ArrayList<Equipo> listaEquiposEnUso) {
        this.listaEquiposEnUso = listaEquiposEnUso;
    }

    public ArrayList<Vlan> getListaVlan() {
        return listaVlan;
    }

    public void setListaVlan(ArrayList<Vlan> listaVlan) {
        this.listaVlan = listaVlan;
    }
}
