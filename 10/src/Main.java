public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 100; number++) {
            if (number % 7 == 0) {
                sum += number;
            }
        }
        System.out.println("The sum of numbers between 1 and 100 that are divisible by 7 is: " + sum);
    }
}
