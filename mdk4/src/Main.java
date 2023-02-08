public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("");

        Phone phone1 = new Phone("89106762811", "Xiaomi 4K 69FPS ULTRA QUADRO MEGA HD ATMOS DOLBIT NORMALNO REDMI NOTE OG BUDA TRIPLE 6 EDITION PRO MAX +", 420);
        Phone phone2 = new Phone("89036482102", "Iphone 12", 222);
        Phone phone3 = new Phone("89961986738", "Sumsung a52", 648);
        System.out.println("");

        phone1.receiveCall("Никмет");
        System.out.println(phone1.GetNumber());
        phone2.receiveCall("Катюша");
        System.out.println(phone2.GetNumber());
        phone3.receiveCall("Игорь Кантонистов");
        System.out.println(phone3.GetNumber());
        System.out.println("");

        phone1.receiveCall("Никмет", "89106762811");
        phone2.receiveCall("Катюша", "89036482102");
        phone3.receiveCall("Игорь Кантонистов", "89961986738");
        System.out.println("");

        String[] nums = new String[]{"89106762811", "89036482102", "89961986738"};
        Phone.sendMessage(nums);
        System.out.println("");
        System.out.println("");

        System.out.println("Задание 2");

        System.out.println("");
        Person nn = new Person();
        Person Ilya = new Person("Мишин Илья Алексеевич", 17);
        Ilya.move(Ilya.fullName);
        Ilya.talk(Ilya.fullName);
    }
}