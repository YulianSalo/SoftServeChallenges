#include <iostream>
using namespace std;

void Time_Convert()
{
	int num;
	cin >> num;
	int min;
	int sec;
	min = num / 60;
	sec = num % 60;
	cout << min << ":" << sec << endl;
}

int main()
{
	Time_Convert();
}
