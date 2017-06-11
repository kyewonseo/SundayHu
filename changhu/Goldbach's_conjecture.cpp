#include <iostream>

using namespace std;


int GetPrimeNumber(int currentNum);

int main()
{
	cout << "Test Case : ";
	int nCase;
	cin >> nCase;
	
	int evenNumber;
	for (int i = 0; i < nCase; i++) {
		cout << i+1 << " : ";
		cin >> evenNumber;

		int oddNumber = evenNumber / 2;
		int oddNumber2 = evenNumber / 2;

		if (GetPrimeNumber(oddNumber) == oddNumber) {
			if (GetPrimeNumber(oddNumber2) == oddNumber2) {
				cout << evenNumber << " = " << oddNumber << " + " << oddNumber2 << endl;
				cin >> nCase;
				return 0;
			}
		}

		oddNumber--;
		oddNumber2++;

		while (true) {
			if (GetPrimeNumber(oddNumber) == oddNumber) {
				if (GetPrimeNumber(oddNumber2) == oddNumber2)
					break;
			}
			cout << oddNumber << "   " << oddNumber2 << endl;
			oddNumber--;
			oddNumber2++;
		}
		cout << evenNumber << " = " << oddNumber << " + " << oddNumber2 << endl;
	}

	cin >> nCase;

	return 0;
}

int GetPrimeNumber(int currentNum)
{
	// 현재 숫자로 나누어 떨어지는 것이 없으면 소수 리턴
	// 나누어지는 떨어지는 숫자가 있으면 몫 출력 => 소수 아님
	int tp=2;

	while (tp < currentNum) {
		if (!(currentNum%tp) == 0)	tp++;
		else
			return currentNum / tp;
	}
		
	return currentNum;
}