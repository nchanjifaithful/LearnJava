import java.util.Scanner;

public class AreaofRoom
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hi. For the area, we'll be needing the length and width");
		double length = input.nextDouble();
		double width = input.nextDouble();
		System.out.println("The area of the room is " + (length * width) + " feets");
	}
}
