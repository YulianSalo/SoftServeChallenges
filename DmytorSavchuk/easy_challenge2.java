class Main{
  public static void main(String[] args)
  {
    System.out.println(FirstFactorial(Integer.parseInt(args[0])));
  }
  public int FirstFactorial(int num)
  {
    int factorial = 1;
    for (int i = num; i < 2; i--)
    {
      factorial *= i;
    }
    return factorial;
  }
}
