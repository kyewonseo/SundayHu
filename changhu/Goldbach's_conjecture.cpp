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
	// ���� ���ڷ� ������ �������� ���� ������ �Ҽ� ����
	// ���������� �������� ���ڰ� ������ �� ��� => �Ҽ� �ƴ�
	int tp=2;

	while (tp < currentNum) {
		if (!(currentNum%tp) == 0)	tp++;
		else
			return currentNum / tp;
	}
		
	return currentNum;
}