package nivel1;

public class Undo {

    private static Undo instance;

    private Undo() {

    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }
}
