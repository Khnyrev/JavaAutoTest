package ClassAndObject;

public class LearnCasses {

    public static void main(String[] args) {

        hello("котики");
        hello("User!");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со сторонй " + s.l + " равна " + s.area());;

        Rectangle r =new Rectangle(4,6);
        System.out.println("Площадь квадрата со сторонами " + r.a + " и " + r.b + " равна " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!!!");
    }


}
