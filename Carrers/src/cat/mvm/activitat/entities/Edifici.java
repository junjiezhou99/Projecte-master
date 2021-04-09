package cat.mvm.activitat.entities;

public class Edifici {
    int window, portal, floor;
    String colour;
    private static final int VAL = 0; /*Inicialización de las variables*/
    private static final String VAL_TEXT = null;

    public Edifici(){
        this.setWindow(VAL);
        this.setPortal(VAL);
        this.setFloors(VAL);
        this.setColour(VAL_TEXT);
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getPortal() {
        return portal;
    }

    public void setPortal(int portal) {
        this.portal = portal;
    }

    public int getFloors() {
        return floor;
    }

    public void setFloors(int floors) {
        this.floor = floors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void sumWindow(){
        System.out.println("Las vantanas totales son de: " + window*floor);
    }
}
