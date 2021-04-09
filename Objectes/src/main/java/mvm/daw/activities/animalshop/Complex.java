package mvm.daw.activities.animalshop;
/**
 * @author alumne
 */
public class Complex {
    private double algo1, algo2;
    
    public Complex(double algo1, double algo2){
        this.algo1 = algo1;
        this.algo2 = algo2;
    }
    
    public boolean equals (Object o){ //Metodo equal que compara dos objetos
        if (o==this){
            return true; //Si son lo mismo que el objeto devuelve true directo
        }
        
        if (!(o instanceof Complex)){ //si es diferente que las instancias devuelve false directo
            return false;
        }
        
        Complex c = (Complex) o; //Crear variable c de tipo complex igual que el o de complex
        
        return Double.compare(algo1, c.algo1)==0 && Double.compare(algo2, c.algo2)==0; //Si los dos returns anteriores no es el caso, compara ambos valores para ver si da el true/false
    }
    public String toString(){ //printa al objeto
        return String.format(algo1 + " + i" + algo2);
    }
}
