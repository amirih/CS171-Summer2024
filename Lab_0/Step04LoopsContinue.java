package Lab_0;

public class Step04LoopsContinue {
    public static void main(String[] args) {

        // for loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.err.println("i is 5, skipping");
                continue;
            }
            System.out.println("i is " + i);
        }

        // while loop
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                i++;
                System.err.println("i is 5, skipping");
                continue;
            }
            System.out.println("i is " + i);
            i++;
        }

        // do while loop
        i = 0;
        do {
            if (i == 5) {
                i++;
                System.err.println("i is 5, skipping");
                continue;
            }
            System.out.println("i is " + i);
            i++;
        } while (i < 10);
    }

}
