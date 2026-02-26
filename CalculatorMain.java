public class CalculatorMain {
    public static void main (String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(6, 2));
        System.out.println(c.sub(6, 2));
        System.out.println(c.mul(6, 2));
        System.out.println(c.div(6, 2));
    }
}
