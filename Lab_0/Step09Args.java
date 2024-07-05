package Lab_0;

class Step09Args {

    public static void printName(String name, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java PracticeNow <name> <repeat>");
            return;
        }
        String name = args[0];
        int repeat = 1;
        try {
            repeat = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            repeat = 5;
        }
        printName(name, repeat);
    }

}