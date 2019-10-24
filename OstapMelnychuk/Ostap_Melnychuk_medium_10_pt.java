class Main{
  public static void main(String[] args){
    System.out.println(LetterChanges("Line *3"));
  }
  
  public static String LetterChanges(String str){
    int key = Integer.valueOf(str.charAt(str.length() -1));
    StringBuilder st = new StringBuilder();
    char[] arr = str.toCharArray();
    for(int i = 0; i < arr.length; i++){
       int code = arr[i];
       if(code < 97 || code > 122){
         st.append((char) code);
         continue;
       }
       if(code + key > 122){
         char c = (key - (122 - code));
         if(c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u'){
            st.append(String.valueOf(c).toUpperCase();
         }
         else{
          st.append(String.valueOf(c));
        }
        }
        else{
          st.append(String.valueOf(c + keys));
        }
       }
       return st.toString();
    }
    
  
  }
}
© 2019 GitHub, Inc.
