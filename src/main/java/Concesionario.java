import java.util.ArrayList;
/**
 * Clase Concesionario para almacenar los autos.
 * Esta clase contendra un listado de los autos que pertenecen al concesionario.
 * @author Gemma Morais Villar
 * @version 1.0 2024/02/26
 */

public class Concesionario {
    /**
     *Declara una lista de objetos de tipo Auto.
     */

    private ArrayList<Auto> autos;

    /**
     *Inicializa la lista de autos del concesionario con una instancia de ArrayList
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Metodo para agregar autos al listado del concesionario.
     * @param auto Auto que se va a agregar a la lista.
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Metodo para recorrer la lista de autos del concesionario.
     * @return El listado de Autos almacenado.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Metodo para imprimir por pantalla.
     * El bucle for itera sobre la lista de autos y muestra los detalles almacenados.
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}

