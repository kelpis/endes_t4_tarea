import java.util.ArrayList;

/**
 * Clase Auto para almacenar los datos  de los coches.
 * Esta clase contendra información de los autos: la marca y el modelo.
 * @author Gemma Morais Villar
 * @version 1.0 2024/02/26
 */

public class Auto {
    /**
     * La marca del auto.
     */

    private String marca;

    /**
     * El modelo del auto.
     */

    private String modelo;

    /**
     * Constructor de la clase Auto.
     * @param marca Marca del auto.
     * @param modelo Modelo del auto.
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Metodo que devuelve una cadena con la marca del auto.
     * @return Nos devuelve la marca del auto.
     */

    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que establece la marca del auto.
     * @param marca La marca del auto.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que devuelve una cadena con el modelo del auto.
     * @return Nos devuelve la marca del auto.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que establece el modelo del auto.
     * @param modelo El modelo del auto.
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que convierte un objeto Auto en un String.
     * @return Un String con una cadena de los campos marca y modelo.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}

