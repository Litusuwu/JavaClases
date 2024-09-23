package pe.edu.pucp.papucplanet.cine.model;
import java.time.LocalTime;
import java.util.Date;
import java.util.ArrayList;
public class Funcion {
    private LocalTime horarioInicio;
    private LocalTime horarioFin;
    private Date dia;
    private Pelicula pelicula;
    private Sala sala;
    private ArrayList<ButacaFuncion> butacasFuncion;
    private boolean activo;
    public Funcion(LocalTime horarioInicio, LocalTime horarioFin, Date dia, Pelicula pelicula, Sala sala) {
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.dia = dia;
        this.pelicula = pelicula;
	this.sala=sala;
        this.activo = true;
    }

    // Getter y Setter para horarioInicio
    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    // Getter y Setter para horarioFin
    public void setHorarioFin(LocalTime horarioFin) {
        this.horarioFin = horarioFin;
    }

    public LocalTime getHorarioFin() {
        return horarioFin;
    }

    // Getter y Setter para dia
    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getDia() {
        return dia;
    }

    // Getter y Setter para pelicula
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    // Getter y Setter para sala
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }
	

    public ArrayList<ButacaFuncion> getButacasFuncion(){
        return new ArrayList<>(butacasFuncion);
    }

    public void setButacasFuncion(ArrayList<ButacaFuncion> butacasFuncion){
        this.butacasFuncion = butacasFuncion;
    }
    
    

    //Setter y Getter para activo
    public boolean isActivo(){
        return activo;
        
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void consultarDatos() {
    }
}
