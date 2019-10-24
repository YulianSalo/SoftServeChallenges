class Main{
  public static void main(String[] args){
    System.out.println(SimpleAdding(4));
  }
  
  public static int SimpleAdding(num){
  int sum = 1;
    for(int i = num; i != 0; i--){
      sum += i;
    }
    return sum;
  }

}
