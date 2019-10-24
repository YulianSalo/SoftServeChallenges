#include <iostream>
#include <string>

using namespace std;

int main()
{
	string input;
	getline(cin, input);
	input += " ";
	string str = "";
	string max_s = "";

	for (auto i{ 0 }; i < input.size(); ++i)
	{
		if ((input[i] >= 'a' && input[i] <= 'z') || (input[i] >= 'A' && input[i] <= 'Z')) str += input[i];
		else
		{
			if (str.size() > max_s.size())
			{
				max_s = str;
			}
			str = "";
		}
	}
	cout << max_s;


	return 0;
}
