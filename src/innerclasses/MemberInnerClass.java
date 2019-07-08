package innerclasses;

public class MemberInnerClass {

    public static void main(String[] args) {
        MainClass mc = new MainClass();
        MainClass.InnerClass in = mc.new InnerClass();
        in.setName("Omar");
        System.out.println(in.getName());
    }
}

class MainClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    class InnerClass {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }//End of InnerClass
    
}//End of MainClass
