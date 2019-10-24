

#include "pch.h"
#include <iostream>
int SimpleAdding(int num)
{
	int a = 0;
	for (int i = 1; i <= num; i++)
	{
		a += i;
	}
	return a;
}

int main()
{
	std::cout<<SimpleAdding(4);
	system("pause");
}
