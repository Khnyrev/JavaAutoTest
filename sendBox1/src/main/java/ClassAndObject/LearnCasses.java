package ClassAndObject;

public class LearnCasses {

    public static void main(String[] args) {

        hello("котики");
        hello("User!");

        double l = 5;
        System.out.println("Площадь квадрата со сторонй " + l + " равна " + area(l));;

        double a = 4;
        double b = 6;
        System.out.println("Площадь квадрата со сторонами " + a + " и " + b + " равна " + area(a,b));
    }

    public static void hello(String somedody) {
        System.out.println("Hello, " + somedody + "!!!");
    }

    public static double area(double l){
        return l * l;
    }

    public static double area(double a, double b){
        return a * b;
    }
}
