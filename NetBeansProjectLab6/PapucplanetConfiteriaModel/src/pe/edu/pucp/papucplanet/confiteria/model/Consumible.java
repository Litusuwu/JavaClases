package pe.edu.pucp.papucplanet.confiteria.model;

public abstract class Consumible {
    private int codigo;
    private String nombre;
    private double precio;

    // Constructor con parámetros
    public Consumible(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter para codigo
    public int getCodigo() {
        return codigo;
    }

    // Setter para codigo
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para precio
    public double getPrecio() {
        return precio;
    }

    // Setter para precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
