package HomeWork4.Task2;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.add("+375292567766","LAP");
        phone.add("+375292581717","NAL");
        phone.add("+375292582929","GOP");
        phone.add("+375292562652","KON");
        phone.add("+375292682862","LOA");
        phone.add("+375292448682","BAR");
        phone.add("+375296268165","HAL");

        System.out.println(phone.getPhoneByFIO("LAP"));
        System.out.println(phone.getPhoneByFIO("+37529"));
    }
}
