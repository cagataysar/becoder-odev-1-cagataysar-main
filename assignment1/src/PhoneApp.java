public class PhoneApp {

    public static void main (String[] args) {
        SmartPhone[] smartPhoneArray = new SmartPhone[5];

        smartPhoneArray[0] = new SmartPhone(1, "Phone 1", 800.0, 101, 64, 2, 4);
        smartPhoneArray[1] = new SmartPhone(2, "Phone 2", 900.0, 102, 128, 4, 8);
        smartPhoneArray[2] = new SmartPhone(3, "Phone 3",1000.0 , 103, 256, 6, 16);
        smartPhoneArray[3] = new SmartPhone(4, "Phone 4",1200.0 , 104, 512, 8, 40);
        smartPhoneArray[4] = new SmartPhone(5, "Phone 5", 1500.0, 105, 1024, 12, 64);

        double totalPrice = calculateTotalPrice(smartPhoneArray);
        System.out.println("Price: " + totalPrice);
    }

    public static double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double total = 0.0;
        for (SmartPhone smartPhone : smartPhoneArray) {
            total =total+ smartPhone.getPrice();
        }
        return total;
    }
}
