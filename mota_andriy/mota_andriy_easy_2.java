public class SecondTask
{
	public static void main(String[] args)
	{
		System.out.println(FirstFactorial(5));
	}
	
	public static int FirstFactorial(int num)
	{
		int result = 1;
		for(int i = num ; i > 0; i--)
		{
			result = result * i;
		}
		return result;
	}
}