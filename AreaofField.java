import java.util.Scanner;

class AreaofField
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//This program computes area in acres from length and width given in feets
		System.out.prinln("Enter the length and the width in feets");
		double lengthf = input.nextDouble();
		double widthf = input.nextDouble();
		double Area = (lengthf * widthf) / 43560;
		System.out.printf("Area of the field is %.2f acres\n", Area);
	}
}
