class TypeCastingDemo {
    public static void main(String[] args) {
        int a = 10;
        double b = a;  

        System.out.println("Implicit Casting (int → double): " + b);

        double x = 9.78;
        int y = (int) x;

        System.out.println("Explicit Casting (double → int): " + y);
    }
}
