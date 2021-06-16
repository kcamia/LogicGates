public class LogicGates {
    private static AndGate and;
    private static OrGate or;
    private static XorGate xor;

    public static void main(String[] args) {

        System.out.println(CircuitOne(0,0));
        System.out.println(CircuitOne(0,1));
        System.out.println(CircuitOne(1,0));
        System.out.println(CircuitOne(1,1));
    }

    public static int CircuitOne(int a, int b) {

        int a2;
        if (a == 1) {
            a2 = 0;
        } else {
            a2 = 1;
        }

        int b2;
        if (b == 1) {
            b2 = 0;
        } else {
            b2 = 1;
        }

        int c1 = and.And(a2, b);
        int c2 = and.And(a, b2);

        return or.Or(c1, c2);

    }

    public static String CircuitTwo(int a, int b){

        int s = xor.Xor(a, b);
        int c = and.And(a, b);
        String one = Integer.toString(s);
        String two = Integer.toString(c);
        String three = one + ", " + two;

        return three;
    }
}
