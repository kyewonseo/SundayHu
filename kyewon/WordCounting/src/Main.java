import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input value :");
        String input = sc.nextLine();

        showSplictWord(input);
    }

    private static void showSplictWord(String input) {

        String[] word = input.split("\\s");
        System.out.print(word.length);

    }
}
