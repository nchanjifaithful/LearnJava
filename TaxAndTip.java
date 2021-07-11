import java.util.Scanner;

public class TaxAndTip
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double cost = input.nextInt();	//Taking the cost
		double tax = 0.1 * cost;	//Assuming tax rate to be 10%
		double tip = 0.18 * cost;
		double total = tax + tip + cost;
		System.out.printf(" Tax: %.2f\nTip: %.2f\nTotal: %.2f\n",tax, tip, total);
	}
}
