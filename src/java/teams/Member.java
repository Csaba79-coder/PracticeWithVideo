package teams;

public class Member {
    /**
     * Responsible for handling member's properties and behavior
     */

    private static int getterUsage = 0;

    private String name;
    private int age;
    private String gender;

    public Member() {
        name = "Anonymus";
        age = -1;
        gender = "Unknown";
    }

    public Member(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        getterUsage++;
        return name;
    }

    public int getAge() {
        getterUsage++;
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Warning - Age cannot be negative");
        }
    }

    // if some man are getting older
    public void incrementAge(int amount) {
        if (amount > 0) {
            this.age += amount;
        }
    }

    public String getGender() {
        getterUsage++;
        return gender;
    }
}
