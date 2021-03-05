
public class Gugudan {
	
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0;i<result.length;i++) {
			result[i]=times*(i+1);
		}
		return result;
		
	}
	
	public static int[] front(int times,int times1) {
		int[] result = new int[times1];
			for(int i=0;i<result.length;i++) {
				result[i]=times;
			}
		return result;
	}	
	
	public static int[] end(int times1) {
		int[] result = new int[times1];
			for(int i=0;i<result.length;i++) {
				result[i]=i+1;
			}
		return result;
	}	
	
	public static int[] calculate1(int times, int times1) {
		int[] result = new int[times1];
			for(int i=0;i<result.length;i++) {
				result[i]=times*(i+1);
			}
		return result;
	}	
	
	public static void print(int[] result0, int[] result, int[] result1) {
		for(int i=0;i<result.length;i++) {
//			System.out.println("1==> "+result0[i]);
//			System.out.println("2==> "+result[i]);
//			System.out.println("3==> "+result1[i]);
			System.out.println(result0[i]+" * " + result1[i] + " = " +result[i]);
		}
	}
}
