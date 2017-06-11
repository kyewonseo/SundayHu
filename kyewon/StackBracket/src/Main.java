import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("반복 횟수 입력 :");
        int t = sc.nextInt();
        int n = 0;

        while (n <= t) {

            String input = sc.nextLine();

            if (!input.equals("")) {
                if (isCheckedBracket(input)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            n++;
        }
    }

    public static boolean isCheckedBracket(String inputs) {
        boolean isCorrect = true;
        Stack<Character> resultStack = new Stack<Character>();

        char[] insertArray = inputs.toCharArray();
        for (int i = 0; i < insertArray.length; i++) {
            if (insertArray[i] == '(') {
                resultStack.push(insertArray[i]);
            } else {

                /**
                 * if stack.peek null
                 * EmptyStackException 발생*/
                if (resultStack.empty()) {
                    isCorrect = false;
                    break;
                } else {
                    resultStack.pop();
                }
            }
        }
        if (!resultStack.empty()) {
            isCorrect = false;
        }
        return isCorrect;
    }

}
