package HomeWork1;

public class Course {
    String result;
    private int standing;
    private int running;


    public Course(int standing, int running) {
        this.standing = standing;
        this.running = running;
    }

    public String doIt(Group group) {
        result = "Group name: " + group.getName() + " " + '\n';
        for (Person person : group.getPeoples()) {
            result += "name sportsmen: " + person.getName() + " " + '\n';
            int value = person.getJumpMeters();
            testStanding(value);
            testRunning(value);
        }
        return result;
    }
    private void testStanding(int value){
        if (value<standing + 10) result += "standing jump - passed" + '\n';


    }
    private void testRunning(int value){
        if (value<running + 10) result += "running jump - passed" + '\n';

    }
    }
