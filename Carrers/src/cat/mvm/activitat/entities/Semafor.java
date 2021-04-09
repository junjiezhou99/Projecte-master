package cat.mvm.activitat.entities;

public class Semafor {
    String colour;
    int amount;
    double high;

    public Semafor(String c, int a, double h){
        this.setColour(c);
        this.setAmount(a);
        this.setHigh(h);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Semafor{" +
                "colour=" + colour +
                ", amount=" + amount +
                ", high=" + high +
                '}';
    }
}
