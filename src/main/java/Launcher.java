import java.util.ResourceBundle;

public class Launcher {
    public static void main(String[] args) {
        Introduccion();
    }
    public static void Introduccion(){
        Register register=new Register();
        register.anhadirPacientes(new Paciente("Marcelo","Castro",18620208-2,70));
        register.anhadirPacientes(new Paciente("Walter","Wenchumilla",7394710-3,20));
        register.buscarPaciente("Marcelo");
        register.mostrarPacientes();
        register.pacientesMayores();
    }
}
