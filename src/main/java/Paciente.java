public class Paciente {
    private String Nombre;
    private String Apellido;
    private int Rut;
    private int Edad;

    public Paciente(String Nombre, String Apellido, int Rut, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Rut = Rut;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getRut() {
        return Rut;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}

