public class BasicThread
{
	public static void main(String[] args)
	{
		System.out.println(LongestWord("I love dogs"));
	}
	
	public static String LongestWord(String sent)
	{
		int tmp_l = -1;
		String f_word = "";
		for(String s : sent.split(" "))
		{
			if(s.length() > tmp_l) 
			{ 
				tmp_l = s.length(); 
				f_word = s;
			}
		}
		return f_word;
	}
}