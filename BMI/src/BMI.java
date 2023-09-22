import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		float height;
		float weight;
		float bmi;
		float height2;
		System.out.println("Enter your height in metres");
		height=scan.nextFloat();
		height2=height*height;
		System.out.println("Enter your weight in Kilograms");
		weight=scan.nextFloat();
		
		bmi=weight/(height2);
		System.out.println("Your Body Mass Index is"+bmi);

	}

}
