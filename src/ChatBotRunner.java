public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot Debbie = new ChatBot("Debbie", 15);

        // void methods
        Debbie.greeting("Arhan Hossain");
        Debbie.weather();
        Debbie.favoriteNumber(25);

        // non void methods
        int sum = Debbie.addNumbers(12, 15, 18);
        System.out.println("The sum is " + sum);

        String message = Debbie.goodbye();
        System.out.println(message);

        double meters = Debbie.convertFeetToMeters(30);
        System.out.println("There are " + meters + " meters in 30 feet");


        // calling new void method
        Debbie.stateBot();

        //calling new non void method
        double inches = Debbie.convertCentimetersToMeters(12);
        System.out.println("There are " + inches + " inches in 12 centimeters");


    }
}