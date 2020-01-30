package ClassAndObject;

public class LearnCasses {

    public static void main(String[] args) {

    Square s = new Square();
    s.l l = 5;
        System.out.println("площадь квадрата со стороной " + s.l + "=" + area(s));
    }

    public static area (Square s) {
        return s.l * s.l;
    }
}
