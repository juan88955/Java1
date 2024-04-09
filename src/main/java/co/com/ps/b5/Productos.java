package co.com.ps.b5;


public enum Productos {
    LAPTOP("Laptop"),
    SMARTPHONE("Smartphone"),
    TABLET("Tablet"),
    SMARTWATCH("Smartwatch");

    private final String nombre;

    Productos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
