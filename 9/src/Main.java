public class Main {
    public static void main(String[] args) {
        int largest = 0;
        for (int number = 1; number <= 100; number++) {
            if (number % 7 == 0) {
                largest = number;
            }
        }
        System.out.println("The largest number between 1 and 100 that is divisible by 7 is: " + largest);
    }
}
