import java.util.List;
import java.util.ArrayList;

public class Register {
    private List<Paciente>Pacientes;

    public Register(ArrayList Register){
        this.Pacientes= new ArrayList<>();
}
    public List<Paciente> getPacientes() {
        return Pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        Pacientes = pacientes;
    }
    public void pacientesMayores(){
        ArrayList<String>pacientesMayores= new ArrayList<>();
    }
}

