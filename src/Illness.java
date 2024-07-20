public class Illness {
    private String name;

    public Illness(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printDetails() {
        System.out.println("Illness: " + name);
    }
}
