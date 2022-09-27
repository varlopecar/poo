public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void multiply(Rational other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
    }

    public static Rational mult(Rational a, Rational b) {
        Rational c = new Rational(a.numerator * b.numerator, a.denominator * b.denominator);
        return c;
    }

    public void add(Rational other) {
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator *= other.denominator;
    }

    public void reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
