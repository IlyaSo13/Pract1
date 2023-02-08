public class Phone {
    String phone;
    String model;
    int weight;
    public Phone(String phoneNum, String models, int Weight) {
        this(phoneNum, models);
        this.weight = Weight;
        System.out.print(phoneNum + " " +  models + " ");
        System.out.print(Weight);
        System.out.println("");
    }
    public Phone(String phoneNum, String models) {
        this.phone = phoneNum;
        this.model = models;
    }
    public Phone() {
    }
    public String GetNumber() {
        return phone;
    }
    public void receiveCall(String name) {
        System.out.println("Вам звонит " + name);
    }
    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Вам звонит " + name + " c телефона " + phoneNumber);
    }
    public static void sendMessage(String[] numbers){
        System.out.println("Вы отправили сообщения на номера: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
}