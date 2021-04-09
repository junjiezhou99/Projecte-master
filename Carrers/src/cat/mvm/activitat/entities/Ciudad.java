package cat.mvm.activitat.entities;

public class Ciudad {
    String nom;
    int area;

    public Ciudad(String n, int a){
        this.setArea(a);
        this.setNom(n);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nom=" + nom +
                ", area=" + area +
                '}';
    }

    public String calcular(){
        if (area>10){
            return "Más grande que 10";
        }
        else{
            return "Más pequeño que 10";
        }
    }

    public void printar(){
        switch (area){
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
        }
    }
}
