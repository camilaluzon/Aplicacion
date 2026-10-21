package Aplicacion;

public class MainAplicacion {
    public static void main(String[] args) {
        // Ejemplo de uso
        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("GestionInventario", "2.1");

        // Probar métodos iniciar y cerrar
        app1.iniciar();
        app2.iniciar();
        app1.cerrar();

        // Mostrar el total de aplicaciones registradas
        System.out.println("Total de aplicaciones: " + Aplicacion.getTotalAplicaciones());
    }
}
