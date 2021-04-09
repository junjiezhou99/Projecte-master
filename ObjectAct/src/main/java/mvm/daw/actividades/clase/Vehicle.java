package mvm.daw.actividades.clase;

/**
 * @author Junjie
 * @version 1.0
 */
public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private int mileage;
    private String plateNumber;
    
    /**
    * a constructor that takes the make, model, year, and number of wheels
    *
    * XXX: We should add some additional error-checking
    * 
    * @param make
    * @param model
    * @param year
    * @param numWheels
    */
    
    public Vehicle(String make, String model, int year, int numWheels) {
        this.make = make;
        this.model = model;
        if (year < 1900) {
            throw new IllegalArgumentException();
        }
        this.year = year;
        this.numWheels = numWheels;
        this.mileage = 0;
        this.plateNumber = "unknown";
    }
    /**
     * @return make
     */
    public String getMake(){
        return make;
    }
    /**
     * @return model
     */
    public String getModel(){
        return model;
    }
    /**
     * @return year
     */
    public int getYear(){
        return year;
    }
    /**
     * @return numWheels
     */
    public int getNumWheels(){
        return numWheels;
    }
    
    /**
     * @param make 
     */
    public void setMake(String make){
        make = make;
    }
    /**
     * @param model 
     */
    public void setModel(String model){
        model = model;
    }
    /**
     * @param year 
     */
    public void setYear (int year){
        year = year;
    }
    /**
     * @param numWheels 
     */
    public void setNumWheels(int numWheels){
        numWheels = numWheels;
    }
    
    @Override
    public String toString(){
        return ("make: " + make + ", model: " + model + " , year: " + year + ", numWheels: " + numWheels);
    }
}
