public class TestStack {
    public static void main(String[] args) {
        StackArrayBased<Character> stack = new StackArrayBased<Character>();// generic type

        System.out.println("Test isEmpty");
        System.out.println(stack.isEmpty());
        System.out.println();

        for(char i = 'a'; i <= 'j'; i++)
            stack.push(i);
        System.out.println("test push");
        System.out.println(stack.toString());
        System.out.println();

        for(int i = 1; i <= 5; i++)
            stack.pop();

        System.out.println("Testing pop");
        System.out.println(stack.toString());
        System.out.println();

        System.out.println("Testing Peek");
        System.out.println(stack.peek());
        System.out.println();

        System.out.println("Testing popAll");
        stack.popAll();
        System.out.println(stack);
        System.out.println("Testing isEmpty");
        System.out.println(stack.isEmpty());

    }
}
