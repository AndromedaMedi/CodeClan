package components;

public class Engine {

    private static String type;

    public Engine(String type) {
        this.type = type;
    }

    public static String getType() {
        return type;
    }
}
