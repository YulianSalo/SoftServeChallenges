#include <iostream>
#include <string.h>

using namespace std;

int CheckNums(int num1,int num2)
{


    if (num1<num2)
        return (true);
    else if (num1>num2)
        return (false);


   else
    return (-1);
}


int main()
{
    int num1,num2;
    cin >> num1;
    cin>>num2;
    cout << CheckNums(num1,num2);


    return 0;
}
