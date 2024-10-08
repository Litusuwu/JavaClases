import java.util.ArrayList;
class Pelicula {
    private String titulo;
    private double duracion;
    private String genero;
    private String sinopsis;
    //posee un arraylist de funciones
    //private ArrayList<Funcion> funciones;

    // Constructor con parámetros
    public Pelicula(String titulo, double duracion, String genero, String sinopsis) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    // Getter y Setter para titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // Getter y Setter para duracion
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getDuracion() {
        return duracion;
    }

    // Getter y Setter para genero
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    // Getter y Setter para sinopsis
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getSinopsis() {
        return sinopsis;
    }
	/*
    public ArrayList<Funcion> getFunciones(){
        return new ArrayList<>(funciones);
    }

    public void setFunciones(ArrayList<Funcion> funciones){
        this.funciones = funciones;
    }
    */
    //////////////////////////////////////////////////////////////////METODOS///////////////////////////////////////////////////////////////////////////
	/*
    // Método para agregar una nueva función
    public void agregarFuncion(Funcion funcion) {
        this.funciones.add(funcion);
    }

    // Método para eliminar una función por índice
    public void eliminarFuncion(int indice) {
        if (indice >= 0 && indice < funciones.size()) {
            this.funciones.remove(indice);
        } else {
            System.out.println("Índice fuera de rango");
        }
    }
	*/
	
    // Método para buscar una función por fecha
	/*
    public Funcion buscarFuncionPorFecha(String fecha) {
        for (Funcion funcion : funciones) {
            if (funcion.getDia().equals(fecha)) {
                return funcion;
            }
        }
        return null; // Si no se encuentra, retorna null
    }
	*/
    // Método para mostrar la información completa de la película
	
    public void imprimirPelicula() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " horas");
        System.out.println("Género: " + genero);
        System.out.println("Sinopsis: " + sinopsis);
		/*
        System.out.println("Funciones:");
        for (Funcion funcion : funciones) {
            System.out.println(" - " + funcion.getDia() + " a las " + funcion.getHorarioInicio());
        }*/
    }
    public void consultarDatos(){

    }
}