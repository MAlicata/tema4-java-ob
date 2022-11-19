public class Main {

    public static void main(String[] args) {
        SmartDevice smartdevice1 = new SmartDevice(30, 11.2, 10);
        SmartWatch apple = new SmartWatch("apple");
        SmartPhone samsung = new SmartPhone("samsung");

        System.out.println(smartdevice1);
        System.out.println(apple);
        System.out.println(samsung);
    }
}
