package main.java.stack;

public class StackTest {

    public static void main(String[] args) {
        main.java.stack.StackOfStrings s = new main.java.stack.StackOfStrings();
        String str = "nazar mohd mubeen address hyderabad india";

        String[] items = str.split(" ");
        for (String item : items) {
            s.push(item);
        }

        System.out.println(s.size());
        while (!s.isEmpty()) {
            System.out.println(s.pop());

        }

    }
}
