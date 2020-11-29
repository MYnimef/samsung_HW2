public class Num {
    public static void main(String[] args) {
        Fraction num1 = new Fraction(13, 16);
        System.out.println(num1);
        Fraction num2 = new Fraction(2, 3);
        System.out.println(num2);
        System.out.println(Fraction.sumFraction(num1, num2));
        System.out.println(Fraction.subFraction(num1, num2));
        System.out.println(Fraction.comFraction(num1, num2));
        System.out.println(Fraction.divFraction(num1, num2));
    }
}
