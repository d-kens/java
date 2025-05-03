package inheritance_polymorphism;

public class B extends A {
    // this method overrides the method in A
    public void p (double i) {
        System.out.println(i);
    }

    // this method overloads the method in A
    public void m(int i) {
        System.out.println(i);
    }

    public void wow() {
        System.out.println("Woooow");
    }


    public static void main(String[] args) {
        B b = new B();
        b.p(10);
        b.p((10.0));

        b.m(20);
        b.m(20.0);

    }
}
