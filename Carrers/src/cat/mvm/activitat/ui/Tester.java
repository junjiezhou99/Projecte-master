package cat.mvm.activitat.ui;
import cat.mvm.activitat.utils.Colour;
import cat.mvm.activitat.entities.Persona;

import java.time.LocalDate;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Introdueix el nom: ");
        String n = sc.next();
        System.out.println("Introdueix el num inici: ");
        int ni = sc.nextInt();
        System.out.println("Introdueix el num Final: ");
        int nf = sc.nextInt();

        Carrer ca = new Carrer(n,ni,nf);
        System.out.println(ca);*/

        /*Edifici ed = new Edifici();
        System.out.println("Introdueix quantitat de ventanas: ");
        ed.setWindow(sc.nextInt());
        System.out.println("Introdueix quantitat de pisos: ");
        ed.setFloors(sc.nextInt());

        ed.sumWindow();*/

        /*System.out.println("Introdueix el color: ");
        String c = sc.next();
        System.out.println("Introdueix la quantitat: ");
        int a = sc.nextInt();
        System.out.println("Introdueix la altura: ");
        double h = sc.nextDouble();

        Semafor se = new Semafor(c,a,h);
        System.out.println(se);*/

        /*System.out.println("nom: ");
        String n = sc.next();
        System.out.println("area: ");
        int a = sc.nextInt();

        Ciudad ci = new Ciudad(n,a);
        System.out.println(ci);
        System.out.println(ci.calcular());
        ci.printar();

        System.out.println(Colour.reed());*/

        var per1 = new Persona("Junjie", "Zhou", LocalDate.of(1999, 9, 25), 1405.21);
        System.out.println(per1.toString());
        var per2 = new Persona("Junjie", "Zhou", LocalDate.of(1999, 9, 25));
        System.out.println(per2.toString());
    }
}
