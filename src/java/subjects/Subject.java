package subjects;

public class Subject {
    /**
     * Parent class for subjects package
     */
    protected String name;
    protected String teacher;
    protected String topic;
    protected int numberOfHours;

    public Subject(String name, String topic) {
        this.name = name;
        this.topic = topic;

        teacher = "N/A";
        numberOfHours = -1;
    }

    public Subject(String name, String teacher, String topic, int numberOfHours) {
        this.name = name;
        this.teacher = teacher;
        this.topic = topic;
        this.numberOfHours = numberOfHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }
}
