import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	 System.out.println("�̏d(kg):");
	double weight = scanner.nextDouble();
	 System.out.println("�g��(m):");
	double height = scanner.nextDouble();
	double BMI = 0;
	
	BMI=weight/(height*height);
	
	System.out.println("BMI��"+String.format("%.2f", BMI)+"�ł��B");
	}
}
