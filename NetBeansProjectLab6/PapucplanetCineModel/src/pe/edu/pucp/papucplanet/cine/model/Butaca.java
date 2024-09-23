package pe.edu.pucp.papucplanet.cine.model;
public class Butaca {
    private char fila;
    private int columna;
    
    private boolean discapacitado;
    private Sala sala;
    private boolean activo;
    // Constructor con parámetros
    public Butaca(char fila, int columna, boolean discapacitado, Sala sala) {
        this.fila = fila;
        this.columna = columna;
        this.discapacitado = discapacitado;
        this.sala = sala;
        this.activo = true;
    }
    //Setter y Getter para activo
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Getter y Setter para fila
    public void setFila(char fila) {
        this.fila = fila;
    }

    public char getFila() {
        return fila;
    }

    // Getter y Setter para columna
    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getColumna() {
        return columna;
    }



    // Getter y Setter para discapacitado
    public void setDiscapacitado(boolean discapacitado) {
        this.discapacitado = discapacitado;
    }

    public boolean isDiscapacitado() {
        return discapacitado;
    }

    // Getter y Setter para sala
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }

    //////////////////////////////////////////////////////////////////METODOS///////////////////////////////////////////////////////////////////////////
}
