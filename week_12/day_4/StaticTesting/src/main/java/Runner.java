public class Runner {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        int result = c.add(1,2);

        String.format("My value was %d", result);
        System.out.println(result);
    }

 }
