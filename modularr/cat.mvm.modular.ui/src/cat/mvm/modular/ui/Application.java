package cat.mvm.modular.ui;
import cat.mvm.modular.contracts.LoveCalculator;
import cat.mvm.modular.entities.Person;

public class Application {
    public static void main(String[] args) {
        LoveCalculator lc =  (name1, name2) -> String.format("hola %s i %s", name1, name2);

        var lc3 = new LoveCalculator() {
            @Override
            public String sayHello(String name1, String name2) {
                return String.format("Hola %s i la %s", name1, name2);
            }
        };

        System.out.println(lc.sayHello("Josep", "Maria"));
        System.out.println(lc3.sayHello("Josep", "Maria"));
    }
}
