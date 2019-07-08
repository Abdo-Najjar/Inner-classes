package innerclasses;

public class StaticInnerClass {

    public static void main(String[] args) {
        MainClassS.InnerClass ic = new MainClassS.InnerClass();
        MainClassS.InnerClass ic1 = new MainClassS.InnerClass();
        ic.setName("Omar");
        System.out.println("First Class :"+ic.getName());
        System.out.println("Second Class :"+ic1.getName());
    }

}

class MainClassS {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static class InnerClass {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
