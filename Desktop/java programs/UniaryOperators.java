
class Main {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;

        System.out.println("Unary Increment: " + ++a);
        System.out.println("a after increment: " + a);
        System.out.println("Unary Decrement: " + --b);
        System.out.println("b after decrement: " + b);
        int c = -5;
        System.out.println("Unary Plus: " + (+c));
        System.out.println("Unary Minus: "+  (-c));
        boolean d = false;
        System.out.println("Unary Logical NOT: " + !d);
        int e = 1;
        System.out.println("Unary Bitwise NOT: " + ~e);
    }
}