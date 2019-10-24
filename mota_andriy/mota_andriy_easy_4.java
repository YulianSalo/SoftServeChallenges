public class ThirdClass
{
	public static void main(String[] args)
	{
		System.out.println(LetterCapitalize("hello world"));
	}
	
	public static String LetterCapitalize(String sent)
	{
		StringBuilder result = new StringBuilder();
		for(String s : sent.split(" "))
		{
			result.append(s.substring(0, 1).toUpperCase());
			result.append(s.substring(1));
			result.append(" ");
		}
		return result.toString();
	}
}