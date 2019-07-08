package innerclasses;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Class c = new Class() {
            @Override
            public void show() {
                System.out.println("Hi");
            }
        };
        c.show();
    }

}

class Class {

    public void show() {
        System.out.println("Hello");
    }
}
