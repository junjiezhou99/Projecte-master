package mvm.daw.activities.animalshop;
/**
 *
 * @author alumne
 */
public abstract class Animal { //Super clase Animal con características generales para todas las clases
    String name,breed,colour;
    double weight;
    
    public Animal(String n, String bd, String c, double w){ //Constructor, guarda espacios para los atribuos 
        this.name = n;
        this.breed = bd;
        this.colour = c;
        this.weight = w;
    }
    public String getName(){return name;} //Una funcion si lo llamas te da el nombre guardado
    public void setName(String n){name = n;} //Posa els inputs del animaltester al espacio guardado para el mismo

    public String getBreed(){return breed;}
    public void setBreed(String bd){breed = bd;}
    
    public String getColour(){return colour;}
    public void setColour(String c){colour = c;}

    public double getWeight(){return weight;}
    public void setWeight(double w){weight = w;}
    
    public abstract double calculate(); //Hacer que os nodos hijos tenga una funcion todos, el como es la funcion lo decide el hijo
}
