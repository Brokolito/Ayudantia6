import java.util.List;
import java.util.ArrayList;

public class Register {
    private List<Paciente> pacientes;

    public Register() {
        this.pacientes = new ArrayList<>();
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        pacientes = pacientes;
    }

    public void pacientesMayores() {
        List<Paciente> pacientesMayores = new ArrayList<>();
        System.out.println("Pacientes mayores");
        for (int i = 0; i < pacientes.size(); i++) {
            if (this.pacientes.get(i).getEdad() >= 60) {
                pacientesMayores.add(pacientes.get(i));
                System.out.println(("Rut: "+ pacientes.get(i).getRut()+", Edad "+pacientes.get(i).getEdad()+", Nombre: "+pacientes.get(i).getNombre()+", Apellido: "+pacientes.get(i).getApellido()));
            }
        }
    }
    public void añadirPacientes(Paciente paciente) {
        pacientes.add(paciente);
    }
    public void buscarPaciente(String nombre){
        System.out.println("Buscando "+nombre);
        for (int i=0;i<pacientes.size();i++){
            if (this.pacientes.get(i).getNombre().equals(nombre)) {
                System.out.println(("Rut: "+ pacientes.get(i).getRut()+", Edad "+pacientes.get(i).getEdad()+", Nombre: "+pacientes.get(i).getNombre()+", Apellido: "+pacientes.get(i).getApellido()));
            }
        }
    }
    public void mostrarPacientes(){
        System.out.println("Pacientes:");
        for (int i=0;i<pacientes.size();i++){
                System.out.println(("Rut: "+ pacientes.get(i).getRut()+", Edad "+pacientes.get(i).getEdad()+", Nombre: "+pacientes.get(i).getNombre()+", Apellido: "+pacientes.get(i).getApellido()));
        }
    }
}

