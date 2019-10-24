class Main{
  public static void main(String[] args){
    System.out.println(FirstFactorial(4));
  }
  
  public static int FirstFactorial(num){
  int sum = 1;
    for(int i = num; i != 1; i--){
      sum *= i;
    }
    return sum;
  }

}
