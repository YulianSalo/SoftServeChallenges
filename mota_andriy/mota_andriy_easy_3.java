public class BasicThread
{
	public static void main(String[] args)
	{
		System.out.println(SimpleAdding(4));
	}
	
	public static int SimpleAdding(int num)
	{
		int result = 0;
		for(int i = 1; i <= num; i++)
		{
			result += i;
		}
		return result;
	}
}