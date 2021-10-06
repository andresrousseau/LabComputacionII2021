package TPLaFacultad;

import java.util.LinkedList;

public class Carrera extends Facultad{
    private String nombre;
    private LinkedList<Materia> coleccionMaterias;

    public Carrera(String nombre) {
        super(nombre);
    }

    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }


    public boolean encontrarMateria(String nombreMateria){
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(LinkedList<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    public boolean eliminarMateria(String nombre){
        this.nombre = nombre;
        boolean encontro = false;
        for (Materia materia:
                coleccionMaterias) {
            if (materia.getNombre() == nombre ){
                coleccionMaterias.remove(materia);
                encontro = true;
            }

        }
        return encontro;
    }
}
