// bohdan_stelmashchuk_easy_2.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>


int FirstFactorial(int num)
{
	if (num < 0) 
		return 0; 
	if (num == 0) 
		return 1; 
	else 
		return num * FirstFactorial(num - 1); 
}

int main( )
{
	FirstFactorial(4);
	std::cout << FirstFactorial(4);
	system("pause");
}

