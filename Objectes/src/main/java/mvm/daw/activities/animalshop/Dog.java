package mvm.daw.activities.animalshop;
/**
 * @author Junjie
 * @version 1.0
 */
public class Dog extends Animal implements Animable{ //Clase dog con su atributo privado 
    private String barkNoise = "Woof";
   
    /**
    * Class constructor
    * @param n name
    * @param bd breed
    * @param c colour
    * @param bn barkNoise
    * @param w weight
    */
    public Dog(String n, String bd, String c, String bn, double w){ //El super coge los atributos de superclase mas poner atributo privado
        super(n,bd,c,w);
        this.barkNoise = bn;
    }
    
    /**
     * @return barkNoise
     */
    public String getBarkNoise(){return barkNoise;} //Una funcion si lo llamas te da el nombre guardado
    
    /**
     * @param bn 
     */
    public void setBarkNoise(String bn){barkNoise = bn;} //Posa els inputs del animaltester al espacio guardado para el mismo
    
    public void printValue(){ //Funcion de printar los atributos de objeto
        System.out.println("El gos es diu: " + name + " es de la raca: " + breed + " fa el so: " + barkNoise + " y pesa: " + weight); //Más seguro si se pone super.valor
    }
    
    /**
     * @param dg1
     * @param pes 
     */
    public void changeValue(Dog dg1, double pes){ //Método que recoge el objeto y un valor numérico
        dg1.weight *= pes; //Assigna al weight del objeto multiplicando al valor numérico
    }
    
    @Override //Sobreescribiendo del método padre
    public double calculate(){ //Implementacion del método del abstract
        return 1.5*weight;
    }
    
    @Override
    public void goesToSleep() { //Instancias del Animable, coge todos los abstractos y no tienen parametros
        System.out.println("Se va a dormir a las 10:00");
    }
    @Override
    public void whenToEat() {
        System.out.println("A las 21:00 a cenar, prros");
    }
    @Override
    public double getNumber(Dog d) { //Instancia del Animable, le pasamos el objeto entero de tipo Dog y retornamos el peso como double del objeto dog
        return d.weight;
    }
}