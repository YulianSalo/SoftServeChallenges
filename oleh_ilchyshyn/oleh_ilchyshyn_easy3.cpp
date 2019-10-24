#include <iostream>
#include <string>

using namespace std;

int main()
{
	int n;
	cin >> n;
	long long sum = 0;
	for (auto i{ 1 }; i <= n; ++i)
	{
		sum += i;
	}

	cout << sum;

	return 0;
}
