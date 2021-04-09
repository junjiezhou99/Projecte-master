package mvm.daw.activities.animalshop;
/**
 * @author alumne
 */
public class Cat extends Animal{ //Clase cat con su atributo privado
    private String moustache;
    
    public Cat(String n, String bd, String c, String m, double w){
        super(n,bd,c,w);
        this.moustache = m;
    }
    
    public String getMoustache(){return moustache;}
    public void setMoustache(String m){moustache = m;}
    
    public void printValue(){
        System.out.println("El gat es diu: " + name + " es de la raca: " + breed + " te el bigoti: " + moustache + " y pesa: " + weight);
    }

    @Override
    public double calculate() {
        return 1.5*weight;
    }
}
