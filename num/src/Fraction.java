public class Fraction {
    private int numerator;
    private int denominator = 1;

    public Fraction(int numerator, int denominator) {   //Constructor
        if(denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(denominator);
        normalization();
    }


    public int getNumerator() { //getter
        return numerator;
    }

    public int getDenominator() {   //getter
        return denominator;
    }

    public void setNumerator(int numerator) {   //setter
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {   //setter
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        if (denominator < 0){
            this.numerator *= -1;
        }
    }

    private int gcd(int numerator, int denominator) {   //Euclid
        while (numerator != 0 && denominator != 0) {
            if (numerator > denominator) {
                numerator %= denominator;
            } else {
                denominator %= numerator;
            }
        }
        return numerator + denominator;
    }

    private void normalization() {
        int n = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= n;
        denominator /= n;
    }

    public boolean properFraction() { //проверка правильности дроби
        return (Math.abs(numerator) < denominator ? true : false);
    }

    public int isIntegerPart() { // выделение целой части
        return (numerator / denominator);
    }

    public Fraction fractionalPart() { // выделение дробной части
        return new Fraction(numerator % denominator, denominator);
    }

    public double toDecimalFractions() { // результат деления в виде десятичной дроби
        return (double) numerator / denominator;
    }

    public String toString() { // вывод дроби на печать
        return new String(numerator + " / " + denominator);
    }

    public Fraction sumFractionTo(Fraction obj) {   //sum
        return new Fraction(this.numerator * obj.denominator + obj.numerator * this.denominator, this.denominator * obj.denominator);
    }

    public static Fraction sumFraction(Fraction obj1, Fraction obj2) {
        return new Fraction(obj1.numerator * obj2.denominator + obj2.numerator * obj1.denominator, obj1.denominator * obj2.denominator);
    }

    public Fraction subFractionTo(Fraction obj) {   //sum
        return new Fraction(this.numerator * obj.denominator - obj.numerator * this.denominator, this.denominator * obj.denominator);
    }

    public static Fraction subFraction(Fraction obj1, Fraction obj2) {   //sum
        return new Fraction(obj1.numerator * obj2.denominator - obj2.numerator * obj1.denominator, obj1.denominator * obj2.denominator);
    }

    public Fraction comFractionTo(Fraction obj) {   //subtraction
        return new Fraction(this.numerator * obj.numerator, this.denominator * obj.denominator);
    }

    public static Fraction comFraction(Fraction obj1, Fraction obj2) {   //subtraction
        return new Fraction(obj1.numerator * obj2.numerator, obj1.denominator * obj2.denominator);
    }

    public Fraction divFractionTo(Fraction obj) {   //division
        return new Fraction(this.numerator * obj.denominator, this.denominator * obj.numerator);
    }

    public static Fraction divFraction(Fraction obj1, Fraction obj2) {   //division
        return new Fraction(obj1.numerator * obj2.denominator, obj1.denominator * obj2.numerator);
    }
}