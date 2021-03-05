import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		System.out.println("몇단 ? : " );
		Scanner scanner = new Scanner(System.in);
		String InputValue = scanner.nextLine();
		String[] splitvalue = InputValue.split(",");
		
		int first = Integer.parseInt(splitvalue[0]);
		int second = Integer.parseInt(splitvalue[1]);
//	    System.out.println(first + " / ");
//	    System.out.println(second);
	    
		//int InputValue1 = Integer.parseInt(InputValue);
		int startno = 2;
//		int InputValue3 = Integer.parseInt(InputValue);
		
		if (first >= 2) {  
			while(startno<=first) {
				int[] result0 = Gugudan.front(startno, second);  // 앞의숫자
				int[] result1 = Gugudan.end(second); // 뒤의숫자 
				int[] result = Gugudan.calculate1(startno, second); // 결과값
//				System.out.println(result0[0]);
//				System.out.println(result0[1]);
//				System.out.println(result0[2]);
//				System.out.println(result0[3]);
//				System.out.println(result0[4]);
//				System.out.println(result0[5]);
//				System.out.println(result0[6]);
//				
//				System.out.println(result1[0]);
//				System.out.println(result1[1]);
//				System.out.println(result1[2]);
//				System.out.println(result1[3]);
//				System.out.println(result1[4]);
//				System.out.println(result1[5]);
//				System.out.println(result1[6]);
//				
//				
//				System.out.println(result[0]);
//				System.out.println(result[1]);
//				System.out.println(result[2]);
//				System.out.println(result[3]);
//				System.out.println(result[4]);
//				System.out.println(result[5]);
//				System.out.println(result[6]);
				
				Gugudan.print(result0,result,result1);
				startno=startno+1;  
			}  
		} else {
			System.out.println("input numer greater than 1");
		}
	}
}
