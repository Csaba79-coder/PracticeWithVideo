package subjects;

public class Mathematics extends Subject {
    /**
     * Responsible for handling mathematics subject's properties and behavior
     */
    private static final String nameLabel = "Matematika";

    public Mathematics() {
        super(nameLabel, "Fogjuk a fejünket");
    }

    public Mathematics(String teacher, int numberOfHours) {
        super("Matematika", teacher, "Fogjuk a fejünket", numberOfHours);
    }

    public Mathematics(String name, String teacher, String topic, int numberOfHours) {
        super(name, teacher, topic, numberOfHours);
    }
}
