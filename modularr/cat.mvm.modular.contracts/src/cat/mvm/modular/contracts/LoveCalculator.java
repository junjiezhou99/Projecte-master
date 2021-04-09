package cat.mvm.modular.contracts;

public interface LoveCalculator {
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 0;

    public abstract String sayHello(String name1, String name2);//interface funcional (SAM - Single Abstract Method)

    public default int getCompatibilityBetween(String name1, String name2){
        return 1;
    }
}
