public class Main {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 1);
//        System.out.println("R1 \n" + r1);
        Rational r2 = new Rational(3, 4);
//        System.out.println("R2 \n" + r2);
        r1.multiply(r2);
//        System.out.println("R1 modifié \n" + r1);

        Rational r3 = new Rational(1, 2);
//        System.out.println("R3 \n" + r3);
        Rational r4 = new Rational(1, 3);
//        System.out.println("R4 \n" + r4);
        r3.add(r4);
//        System.out.println("R3 modifié \n" + r3);

        Rational r5 = new Rational(2, 4);
        r5.reduce();
//        System.out.println("R5 \n" + r5);

        Rational r6 = new Rational(2, 4);
        Rational r7 = new Rational(3, 6);
        Rational r8 = Rational.mult(r6, r7);
//        System.out.println("R8 \n" + r8);



    }
}