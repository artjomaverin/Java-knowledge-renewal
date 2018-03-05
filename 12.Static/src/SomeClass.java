public class SomeClass {
    private static int i = 0;
    private String name;

    public SomeClass(String name) {
        this.i++;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setName(String name) {
        this.name = name;
    }
}
