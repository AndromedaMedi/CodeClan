public class Calculator {
    public static String myString = "Some value";
    private int runningTotal;

    public Calculator() {
        this.runningTotal = 0;
    }

    public static int add(int num1, int num2) {
//        String theString = getAString();
        return num1 + num2;
    }

    public int getRunningTotal() {
        int result = add(1,3);
        return this.runningTotal;
    }
}
