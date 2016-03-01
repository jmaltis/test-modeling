package samples.oop.forreal;

public class Insurer {
    String name;
    InsurerType type;

    public Insurer(String name, InsurerType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public InsurerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return getName();
    }
}
