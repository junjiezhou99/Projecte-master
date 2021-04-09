package mvm.daw.activities.animalshop;
/**
 * @author alumne
 */
public class Fish extends Animal{
    private String waterType;
    
    public Fish(String n, String bd, String c, String wt, double w){
        super(n,bd,c,w);
        this.waterType = wt;
    }
    
    public String getWaterType(){return waterType;}
    public void setWaterType(String wt){waterType = wt;}
    
    public void printValue(){
        System.out.println("El peix es diu: " + name + " es de la raca: " + breed + " es per aigua: " + waterType + " y pesa: " + weight);
    }

    @Override
    public double calculate() {
        return 1.5*weight;
    }
}
