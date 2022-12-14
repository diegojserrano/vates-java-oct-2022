public class Empleado implements Comparable<Empleado>{

    private int legajo;
    private String nombre;
    private float sueldoBasico;

    public Empleado() {
    }

    public Empleado(int legajo, String nombre, float sueldoBasico) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }


    @Override
    public int compareTo(Empleado o) {
        return this.legajo - o.legajo;
    }

    @Override
    public String toString() {
        return String.format("%4d %-15s %8.2f", legajo, nombre, sueldoBasico);
    }
}
