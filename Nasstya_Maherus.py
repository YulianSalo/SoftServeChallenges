#include <iostream>
#include <string>
using namespace std;
int Factorial(int n);
int main()
{
  cout << Factorial(4);
}
int Factorial(int n)
{
  if (n == 1) return 1;
  if (n == 0) return 1;
  if (n > 1) return n * Factorial(n-1);
}
