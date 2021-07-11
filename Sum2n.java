import java.util.Scanner;

class Sum2n
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double sum = (n*(n-1))/2;
		System.out.println("" + sum);
	}
}
