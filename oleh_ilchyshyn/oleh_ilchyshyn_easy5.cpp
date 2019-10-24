#define _CRT_SECURE_NO_WARNINGS_
#include <iostream>
#include <string>
using namespace std;

void First_Reverse()
{
	string word;
	cin >> word;
	string new_word;
	int j = 0;
	int len = word.size();
	for (int i = len - 1; i >= 0; i--)
	{
		new_word += word[i];
		j++;
	}
	cout << new_word;

}

int main()
{
	First_Reverse();

}
