
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear médico
        Medico medico = new Medico("M001", "Dr. Juan Pérez", "3001234567", "Cardiología", "REG-12345");

        // Crear dos pacientes
        Paciente paciente1 = new Paciente("P001", "Carlos Gómez", "3017654321", 45, "Sura EPS");
        Paciente paciente2 = new Paciente("P002", "Ana Torres", "3029876543", 30, "Coomeva EPS");

        // Crear consultas
        Consulta consulta1 = new Consulta("Dolor en el pecho", "Posible angina", "Reposo y medicamentos",
                                          LocalDate.of(2026, 9, 7), medico);
        Consulta consulta2 = new Consulta("Dolor de cabeza", "Migraña", "Analgésicos y descanso",
                                          LocalDate.of(2026, 9, 8), medico);

        // Agregar consultas
        paciente1.agregarConsulta(consulta1);
        paciente2.agregarConsulta(consulta2);

        // Probar getters y setters
        paciente1.setEdad(46);
        paciente2.setTelefono("3020000000");

        // Mostrar información
        System.out.println("=== Médico ===");
        System.out.println(medico.datosResumen());
        System.out.println(medico.rolEnConsulta());

        System.out.println("\n=== Paciente 1 ===");
        System.out.println(paciente1.datosResumen());
        System.out.println(paciente1.rolEnConsulta());
       

        System.out.println("\n=== Paciente 2 ===");
        System.out.println(paciente2.datosResumen());
        System.out.println(paciente2.rolEnConsulta());
      
    }    
}
