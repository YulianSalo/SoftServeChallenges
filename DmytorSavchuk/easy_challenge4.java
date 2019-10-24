class Main{
  public static void main(String[] args)
  {
    System.out.println(LetterCapitalize(args[0]));
  }
  public String LetterCapitalize(String str)
  {
  StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++)
    {
      if (i == 0)
      {
        result.append(str.charAt(i).toUpperCase());
      }
      else if (str.charAt(i - 1) == " ")
      {
        result.append(str.charAt(i).toUpperCase());
      }
      else {
      result.append(str.charAt(i));
      }
    }
      return result;
  }

}
