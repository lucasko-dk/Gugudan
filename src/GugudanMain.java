import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		System.out.println("몇단 ? : " );
		Scanner scanner = new Scanner(System.in);
//		int InputValue = scanner.nextInt();
		String InputValue = scanner.nextLine();
		int InputValue1 = Integer.parseInt(InputValue);
		int InputValue2 = 2;
		int InputValue3 = Integer.parseInt(InputValue);
//		int[] result = Gugudan.calculate(InputValue2);
		if (InputValue1 >= 2) {  
			while(InputValue2<=InputValue1) {
				int[] result0 = Gugudan.front(InputValue2, InputValue3);
				int[] result = Gugudan.calculate1(InputValue2, InputValue3);
				int[] result1 = Gugudan.end(InputValue3);
				Gugudan.print(result0,result,result1);
				InputValue2=InputValue2+1; 
			}
		} else {
			System.out.println("input numer greater than 1");
		}
	}
}
