package Aplicacion;

public class Aplicacion {
    // Atributos
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0;

    // Constructor requerido
    public Aplicacion(String nombre, String version) {
        // 1. Incrementar totalAplicaciones
        totalAplicaciones++;
        // 2. Utilizar ese valor para generar id
        this.id = totalAplicaciones;
        // 3. Inicializar nombre
        this.nombre = nombre;
        // 4. Inicializar version
        this.version = version;
        // 5. Establecer ejecutando en false
        this.ejecutando = false;
    }

    // Métodos requeridos
    public void iniciar() {
        this.ejecutando = true;
        System.out.println("La aplicación " + nombre + " se ha iniciado.");
    }

    public void cerrar() {
        this.ejecutando = false;
        System.out.println("La aplicación " + nombre + " se ha cerrado.");
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    // Getters auxiliares
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }
}
