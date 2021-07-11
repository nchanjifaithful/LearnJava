import java.util.Scanner;

class WidgetGizmos
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numWidget = input.nextInt();
		int numGizmos = input.nextInt();
		int totalweight = (numWidget * 75) + (numGizmos * 112);
		System.out.println("Exactly " + totalweight + " grams!");
	}
}
