package innerclasses;

public class LamdaInnerClass {
    public static void main(String[] args) {
        InterFace iFace = ()->System.out.println("Hello world!");
        iFace.show();
    }
}

@FunctionalInterface
interface InterFace{
    public void show();
}