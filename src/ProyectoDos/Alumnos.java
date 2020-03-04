package ProyectoDos;

// * @author Jaziel
public class Alumnos
{
  private String nombre;
private int numControl;
private double promedio;
        

public Alumnos ()
{
}
public Alumnos (String nombre, int numControl,double promedio){
    this.nombre = nombre;
    this.numControl= numControl;
    this.promedio = promedio;
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int NumControl) {
        this.numControl = NumControl;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}