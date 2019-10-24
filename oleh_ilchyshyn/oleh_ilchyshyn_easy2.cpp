#include <iostream>
using namespace std;
int FirstFactorialrial(int n);

int main()
{
    int num;
    cout << "Enter a positive integer: ";
    cin >> num;
    cout << " =" << FirstFactorial(num) << endl;
}
  int FirstFactorial(int num)
  {

    cout << num << "*";

    if (num > 1)
    {
      return num * FirstFactorial(num - 1);
    }
    else
      return 1;
  }
