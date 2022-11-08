import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	 System.out.println("ëÃèd(kg):");
	double weight = scanner.nextDouble();
	 System.out.println("êgí∑(m):");
	double height = scanner.nextDouble();
	double BMI = 0;
	
	BMI=weight/(height*height);
	
	System.out.println("BMIÇÕ"+String.format("%.2f", BMI)+"Ç≈Ç∑ÅB");
	}
}
