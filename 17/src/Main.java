public class Main {
    public static void main(String[] args) {
        System.out.println("Series 2: ");
        int secondSeries = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(secondSeries + " ");
            secondSeries = secondSeries * 2 + 1; // Formula: prev * 2 + 1
        }
        System.out.println();
    }
}