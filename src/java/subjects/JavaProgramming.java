package subjects;

public class JavaProgramming extends Subject {
    /**
     * Responsible for handling java programming subject's properties and behavior
     */
    private boolean isComputerRoomAvailable = true;

    public JavaProgramming() {
        super("Java Programming", "Java development");
    }

    public JavaProgramming(String teacher, int numberOfHours) {
        super("Java Programming", teacher, "Java development", numberOfHours);
    }

    public JavaProgramming(String name, String teacher, String topic, int numberOfHours, boolean isComputerRoomAvailable) {
        super(name, teacher, topic, numberOfHours);
        this.isComputerRoomAvailable = isComputerRoomAvailable;
    }

    public boolean isComputerRoomAvailable() {
        return isComputerRoomAvailable;
    }

    public void setComputerRoomAvailable(boolean computerRoomAvailable) {
        isComputerRoomAvailable = computerRoomAvailable;
    }
}
