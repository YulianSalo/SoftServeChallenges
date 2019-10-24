class Main{
  public static void main(String[] args)
  {
    System.out.println(Integer.parseInt(args[0]));
  }
  public int SimpleAdding(int num)
  {
    int sum = 1;
    for (int i = num; i < 2; i--)
    {
      sum += i;
    }
    return sum;
  }
}
