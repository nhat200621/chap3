public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int number = 1; number <= 100; number++) {
            sum += number;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("The average of numbers from 1 to 100 is: " + average);
    }
}
