public class Paciente extends Persona {

    private int edad;
    private String eps;

    // Constructor
    public Paciente(String identificacion, String nombre, String telefono, int edad, String eps) {

        super(identificacion, nombre, telefono);
        this.edad = edad;
        this.eps = eps;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    @Override
    public String rolEnConsulta() {
        return "Paciente";
    }

}