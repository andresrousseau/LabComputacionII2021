package TPLaFacultad;

class Profesor extends Persona {

    private double sueldoBasico;
    private int antiguedad;


    public Profesor(String nombre, String apellido, int legajo){
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(legajo);
    }



    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public double calcularSueldo(double sueldoBasico, int antiguedad){
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;



        return sueldoBasico + antiguedad;
    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public String toString(){
        return "Profesor: " + super.toString();
    }
}
