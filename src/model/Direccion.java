package model;

/**
 * Clase que representa la direccion fisica ed un centro de cultivo
 * Esta clase es utilizada como composicion dentro de CentrCcultivo
 */


public class Direccion {
    private String Calle;
    private String Region;

    /**
     * Constructor principal
     *
     * @param Calle calle donde se ubica el centro.
     * @param Region region administrativa donde se ubica.
     */

    public Direccion(String Calle, String Region) {
        this.Calle = Calle;
        this.Region = Region;
    }

    public String getCalle() {
        return Calle;
    }
    public void setCalle(String Calle) {
        this.Calle = Calle;
    }
    public String getRegion() {
        return Region;
    }
    public void setRegion(String Region) {
        this.Region = Region;
    }

    @Override
    public String toString() {
        return Calle + "," + Region;
    }
}

