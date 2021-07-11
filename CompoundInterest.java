import java.util.Scanner;

class CompoundInterest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double ratio = 0.04, interest;
		double deposit = input.nextDouble();
		double principal = deposit;
		for (int i = 0; i < 3; i++)
		{
			interest = principal * ratio;
			principal += interest;
			if (i == 0)
			{
			System.out.printf("%dst year: %.2f in Savings\n", (i + 1), principal);
			}
			else
			{
			System.out.printf("%dth year: %.2f in Savings\n", (i + 1), principal);
			}
		}
	}
}
