#include <iostream>
#include <string>

using namespace std;


string AlphabetSoup (string str)
{
	int arr[32] = { 0 };
	for (auto i{ 0 }; i < str.size(); ++i)
		++arr[str[i] - 'a'];
	string str2;
	for (int i = 0; i < 32; ++i)
		for (int j = 0; j < arr[i]; ++j)
			str2 += ('a' + i);
	return str2;
}

int main()
{
	string str;
	getline(cin, str);
	 cout <<AlphabetSoup(str);

	return 0;
}
