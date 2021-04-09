package mvm.daw.actividades.clase;
import java.util.Scanner;

/**
 * @author Junjie
 * @version 1.0
 */
public class DataTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*System.out.println("Intro date:");
        String a = sc.next();
        String month = a.substring(0, 2);
        String day = a.substring(3, 5);
        String year = a.substring(6, 10);
        Aniversari uwu = new Aniversari(month,day,year);
        System.out.println(uwu);*/
        
        Vehicle txu = new Vehicle("aaa", "lamborguini", 1994, 4);
        System.out.println(txu);
    }
}
