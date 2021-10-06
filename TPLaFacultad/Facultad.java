package TPLaFacultad;

import java.util.LinkedList;

public class Facultad {
    private String nombre;
    private LinkedList<Carrera> coleccionCarrera;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.coleccionCarrera = new LinkedList<Carrera>();
    }

    public void agregarCarrera(Carrera carreraNueva){
        coleccionCarrera.add(carreraNueva);
    }

    public void mostrarCarrera(){
        System.out.println("Carrera de " + this.nombre);
        for (Carrera carrera :
             coleccionCarrera) {
            System.out.println("-" + carrera.toString());

        }
    }

    public boolean eliminarCarrera(String nombreCarrera){
        boolean encontro = false;
        for (Carrera carrera: coleccionCarrera) {
            if (carrera.getNombre().equals(nombreCarrera)){
                coleccionCarrera.remove(carrera);
                encontro = true;
                break;
            }
        }
        return encontro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Carrera> getColeccionCarrera() {
        return coleccionCarrera;
    }

    public void setColeccionCarrera(LinkedList<Carrera> coleccionCarrera) {
        this.coleccionCarrera = coleccionCarrera;
    }
}
