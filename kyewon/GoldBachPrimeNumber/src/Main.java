import java.util.ArrayList;
import java.util.Scanner;

/**
 * GoldBach
 * */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("반복 횟수 입력 :");
        int t = sc.nextInt();
        int n = 0;

        while (n <= t) {

            int input = sc.nextInt();
            collectionPrimeNumber(input);

            n++;
        }
    }

    private static void collectionPrimeNumber(int input) {

        ArrayList<Integer> primeNumberList = new ArrayList<>();
        ArrayList<Integer> resultPrimeNumber = new ArrayList<>();

        for (int num = 2; num <= input; num ++) {
            boolean isPrime = true;
            for (int s = 2; s < num; s ++) {

                if (num % s == 0) {
                    isPrime = false;
                    break;

                }

                continue;
            }

            if (isPrime) {
                primeNumberList.add(num);
            }
        }

        if (primeNumberList.size() != 0) {
            ArrayList<Integer> primeNumberKey = new ArrayList<>();
            ArrayList<Integer> primeNumberValue = new ArrayList<>();

            int resultKey = 0;
            int resultValue = 0;

            for (int i = 0; i < primeNumberList.size(); i ++) {
                for (int j = 0; j < primeNumberList.size(); j ++) {

                    if (primeNumberList.get(i) + primeNumberList.get(j) == input) {
                        primeNumberKey.add(primeNumberList.get(i));
                        primeNumberValue.add(primeNumberList.get(j));
                    }
                }
            }

            if (primeNumberKey.size() >=2) {

                int resultNumber = Math.abs(primeNumberKey.get(0) - primeNumberValue.get(0));
                resultKey = primeNumberKey.get(0);
                resultValue = primeNumberValue.get(0);

                for (int w = 1; w < primeNumberKey.size(); w ++) {

                    if (resultNumber > primeNumberKey.get(w) - primeNumberValue.get(w)) {

                        resultKey = primeNumberKey.get(w);
                        resultValue = primeNumberValue.get(w);
                    } else {
                        continue;
                    }
                }
            } else {
                resultKey = primeNumberKey.get(0);
                resultValue = primeNumberValue.get(0);
            }
            System.out.println(resultKey);
            System.out.println(resultValue);
        }

    }
}
