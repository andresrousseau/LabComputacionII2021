package TPLaFacultad;

import java.util.LinkedList;

public class Materia {

    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes;
    private LinkedList<Profesor> coleccionProfesores;

    public Materia(String nombre, Profesor titular){
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<Estudiante>();

    }



    public void agregarEstudiante (Estudiante estudianteNuevo){
        this.coleccionEstudiantes.add(estudianteNuevo);
    }



    public boolean eliminarEstudiante(int legajo){
        boolean encontro = false;
        for (Estudiante estudiante:
             coleccionEstudiantes) {
            if (estudiante.getLegajo() == legajo){
                coleccionEstudiantes.remove(estudiante);
                encontro = true;
            }

        }
        return encontro;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public LinkedList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(LinkedList<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public LinkedList<Profesor> getColeccionProfesores() {
        return coleccionProfesores;
    }

    public void setColeccionProfesores(LinkedList<Profesor> coleccionProfesores) {
        this.coleccionProfesores = coleccionProfesores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
