package cat.mvm.activitat.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Persona {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private double salary;
    private static int counter = 0;

    public static final double DEFAULT_SALARY = 1500;

    public Persona (String name, String lastName, LocalDate birthDate, double salary){
        this.setBirthDate(birthDate);
        this.setLastName(lastName);
        this.setName(name);
        this.salary = salary;
        counter++;
    }

    public Persona (String name, String lastName, LocalDate birthDate){ //Segundo constructor
        this(name, lastName, birthDate, DEFAULT_SALARY);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getFullName(){ //Método para nombre completo con String.format (parecido al C)
        return String.format("El nombre completo és: %s %s", name, lastName);
    }

    public int getAge(){ //Método para saber el intervalo entre dos fechas, luego coger el año
        var period = Period.between(this.birthDate, LocalDate.now());
        return period.getYears();
    }

    public double getSalaryAnual(){ //Método para probar una multiplicación
        return this.salary * 12;
    }

    public long getSeniority(){
        return ChronoUnit.DAYS.between(this.birthDate, LocalDate.now());
    }

    public static int getCounter(){
        return counter;
    }

    public String toString(){ //Método toString que permite agregar varias lineas modificables parecido al C, queda más bonito
        var sb = new StringBuilder();
        sb.append(String.format("-Nombre:        %s %n", this.getName()));
        sb.append(String.format("-Apellido:      %s %n", this.getLastName()));
        sb.append(String.format("-Nacimiento:    %s %n", this.getBirthDate()));
        sb.append(String.format("-Edad:          %d años  %n", getAge()));
        sb.append(String.format("-Salario anual: %.2f euros %n", getSalaryAnual()));
        sb.append(String.format("-Edad en dias:  %d dias %n", this.getSeniority()));
        sb.append(String.format("-Contador:      %d %n", this.getCounter()));
        return sb.toString();
    }
}
