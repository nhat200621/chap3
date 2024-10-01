public class Main {
    public static void main(String[] args) {
                int[] differences = {6, 9, 21, 42, 94};
                int current = 1;
                System.out.print(current);
                for (int i = 1; i < 10; i++) {
                    if (i < differences.length + 1) {
                        current += differences[i - 1];
                    } else {
                        current += differences[differences.length - 1] * 2;
                    }
                    System.out.print(", " + current);
                }
            }
        }