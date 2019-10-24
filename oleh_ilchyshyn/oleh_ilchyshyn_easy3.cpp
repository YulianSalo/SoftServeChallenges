#include <iostream>
#include <string>

using namespace std;


long long SimpleAdding(int n)
{
	long long sum = 0;
	for (auto i{ 1 }; i <= n; ++i)
	{
		sum += i;
	}
	return sum;
}

int main()
{
	int n;
	cin >> n;
	

	cout << SimpleAdding(n);

	return 0;
}
