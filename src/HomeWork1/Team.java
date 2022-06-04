package HomeWork1;

public class Team {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Piter", 14);
        person[1] = new Person("Alex", 11);
        person[2] = new Person("Nick", 15);
        person[3] = new Person("Mike", 10);

        Group group = new Group ("Peace", person);

        Course c = new Course (10,12);
        String result = c.doIt(group);
        System.out.println(result);



}
}
