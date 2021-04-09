package mvm.daw.activities.animalshop;
import mvm.daw.activities.sea.Tiburones;
import java.util.Scanner;
/**
 * @author alumne
 */
public class AnimalTester {
    public static void main(String[] args) {
        Scanner sc; //Instanciar una clase 
        sc = new Scanner(System.in); //Utilizar constructor
        
        /*Tiburones t = new Tiburones("barbo","husky","white","dientes",10.2);*/
        
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        if (c1.equals(c2)){ //llama al metodo equals del complex y hace una comparacion, retornando true si es igual
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        System.out.println(c1); //toString devuelve lo que es el return del metodo c1
        /*Tiburones d = new Tiburones();
        d.finalize();*/
        /*
        System.out.println("Introdueix el nom del gos 1: ");
        String name = sc.next();
        System.out.println("Introdueix la raca del gos 1: ");
        String breed = sc.next();
        System.out.println("Introdueix el so del gos 1: ");
        String barkNoise = sc.next();
        System.out.println("Introdueix el color del gos 1: ");
        String colour = sc.next();
        System.out.println("Introdueix el pes del gos 1: ");
        double weight = sc.nextDouble();
        Dog dg1 = new Dog(name,breed,barkNoise,colour,weight); //Instanciar una clase de dog utilizando el constructor com parámetros
        
        dg1.changeValue(dg1, 2); //Cambio en el valor del atributo mediante método propio
        System.out.println("El pes de gos 1 canviat és: " + dg1.weight); //Comprobación del método anterior
        
        Dog falsodg=dg1;
        falsodg.changeValue(dg1, 3);
        System.out.println("El pes de gos fals és de: " + falsodg.weight);
        System.out.println("Probando abstract: " + dg1.calculate() + " Kilos pesa despues");  //Print del abstract, no ha cambiado el valor
        System.out.println("Probando nodo padre: " + dg1.getName()); //Probando el getName del padre animal
    
        dg1.goesToSleep(); //Printa la interfície, con el void y el println del dg1 no hara falta poner print aqui
        dg1.whenToEat();
        System.out.println(dg1.getNumber(dg1)); //Printa el metodo pasando el dg1 como objeto
        */
        
        /*System.out.println("Introdueix el nom del gos 2: ");
        name = sc.next();
        System.out.println("Introdueix la raca del gos 2: ");
        breed = sc.next();
        System.out.println("Introdueix el so del gos 2: ");
        barkNoise = sc.next();
        System.out.println("Introdueix el pes del gos 2: ");
        weight = sc.nextDouble();
        Dog dg2 = new Dog(name,breed,barkNoise,colour,weight);
        
        dg1.printValue();
        dg2.printValue();
        
        if (dg1.getWeight()>dg2.getWeight()){
            System.out.println("El gos 1 pesa mes");
        }
        else{
            System.out.println("El gos 2 pesa mes");
        }
        
        System.out.println("Introdueix el nom del gat: ");
        name = sc.next();
        System.out.println("Introdueix la raca del gat: ");
        breed = sc.next();
        System.out.println("Introdueix el bigoti del gat: ");
        String moustache = sc.next();
        System.out.println("Introdueix el pes del gat: ");
        weight = sc.nextDouble();
        Cat ct = new Cat(name, breed, colour, moustache, weight);
        
        ct.printValue();
        
        System.out.println("Introdueix el nom del peix: ");
        name = sc.next();
        System.out.println("Introdueix la raca del peix: ");
        breed = sc.next();
        System.out.println("Introdueix el color del peix: ");
        colour = sc.next();
        System.out.println("Introdueix el tipus d'aigua del peix: ");
        String waterType = sc.next();
        System.out.println("Introdueix el pes del peix: ");
        weight = sc.nextDouble();
        Fish fs = new Fish(name, breed, colour, waterType, weight);
        
        fs.printValue();*/
    }   
}
