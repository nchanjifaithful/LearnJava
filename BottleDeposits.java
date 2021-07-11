import java.util.Scanner;

public class BottleDeposits
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float refund = 0;
		System.out.println("Enter the number of containers");
		int num = input.nextInt();
		int[] sign = new int[num];	//Getting the size of the array to be used
		for (int i = 0; i < num; i++)
		{
			sign[i] = input.nextInt();
		}
		for (int a:sign)
		{
			if (a <= 1)
			{
				refund += 0.10;
			}
			else
			{
				refund += 0.25;
			}
		}
		System.out.println("$" + refund);
	}
}
