public class Main {
    public static void main(String[] args) {
        System.out.println("Series 4: ");
        int fourthSeries = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(fourthSeries + " ");
            fourthSeries = fourthSeries * 3; // Formula: prev * 3
        }
        System.out.println();
    }
}