package cat.mvm.activitat.entities;

public class Carrer {
    String name;
    int numInici, numFinal;

    public Carrer(String n, int ni, int nf){
        this.setName(n);
        this.setNumInici(ni);
        this.setNumFinal(nf);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumInici() {
        return numInici;
    }

    public void setNumInici(int numInici) {
        this.numInici = numInici;
    }

    public int getNumFinal() {
        return numFinal;
    }

    public void setNumFinal(int numFinal) {
        this.numFinal = numFinal;
    }

    @Override
    public String toString() {
        return "Carrers{" +
                "name=" + name +
                ", numInici=" + numInici +
                ", numFinal=" + numFinal +
                '}';
    }
}
