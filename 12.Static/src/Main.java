




public class Main {
    public static void main(String[] args) {
        SomeClass n = new SomeClass("fff");
        System.out.println(n.getI());
        SomeClass l = new SomeClass("wtf");
        System.out.println(n.getI());
        System.out.println(l.getI());
        n.setI(4);
        System.out.println(n.getI());
        System.out.println(l.getI());
        SomeClass s = new SomeClass("wtf");
        System.out.println(s.getI());



    }
}
