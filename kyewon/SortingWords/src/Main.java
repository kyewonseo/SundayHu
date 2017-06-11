import java.util.*;

public class Main {

    private static ArrayList<String> words = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("반복 횟수 입력 :");
        int t = sc.nextInt();
        int n = 0;

        while (n <= t) {

            String word = sc.nextLine();

            if (!word.equals("")) {
                addWord(word);
            }
            n ++;
        }
        sortWords(words);

        System.out.println("정렬된 단어");
        Iterator<String> itr = words.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    public static void addWord(String word) {
        words.add(word);
    }

    public static void sortWords(ArrayList<String> words) {
        int size = words.size();
        int min;
        String temp;

        for (int i = 0; i < size-1; i ++) {
            min = i;
            for (int j = i+1; j < size; j ++) {
                if (words.get(min).length() > words.get(j).length()) {
                    min = j;
                }

                if (words.get(min).length() == words.get(j).length()) {
                    if (words.get(min).compareTo(words.get(j)) > 0) {
                        min = j;
                    }
                }
            }
            temp = words.get(min);
            words.set(min, words.get(i));
            words.set(i, temp);
        }
    }
}
