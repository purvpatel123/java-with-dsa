//its combination of two or more type of inheritence


interface A {
    void msg();
}

class B {
    void greet() {
        System.out.println("Hello from B");
    }
}

class C extends B implements A {
    public void msg() {
        System.out.println("Hello from Interface A");
    }
}

public class HybridInheritence {
    public static void main(String[] args) {
        C obj = new C();
        obj.greet();
        obj.msg();
    }
}



