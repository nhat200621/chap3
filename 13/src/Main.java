public class Main {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 10 - (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4 + (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
