class Main{
  public static void main(String[] args){
    System.out.println(LetterCapitalize("soft serve"));
  }
  
  public static String LetterCapitalize(String str){
  String[] s = str.split(" ");
  StringBuilder s = new StringBuilder();
  for(String st : s){
    char[] a = st.toCharArray();
    a[0] = (char) String.valueOf(a[0]).toUpperCase();
    s.append(new String(a));
  }
  
  
    return s.toString();
  }

}
