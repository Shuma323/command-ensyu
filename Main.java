import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	 System.out.println("体重(kg):");
	double weight = scanner.nextDouble();
	 System.out.println("身長(m):");
	double height = scanner.nextDouble();
	double BMI = 0;
	
	BMI=weight/(height*height);
	
	System.out.println("BMIは"+String.format("%.2f", BMI)+"です。");
	}
}
