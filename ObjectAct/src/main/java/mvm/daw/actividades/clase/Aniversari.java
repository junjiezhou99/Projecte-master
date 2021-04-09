package mvm.daw.actividades.clase;

/**
 * @author Junjie
 * @version 1.0
 */
public class Aniversari {
    private String month;
    private String day;
    private String year;
    
    /**
     * @param m month/mes
     * @param d day/dia
     * @param y year/año
     */
    public Aniversari(String m, String d,String y){
        this.month = m;
        this.day = d;
        this.year = y;
    }
    
    @Override
    public String toString(){ //toString para devolver directamente el objeto
        return ("La data és: " + month + "/" + day + "/" + year);
    }
}
