class Ctest{
	public static void test(int num,int den) throws ArithmeticException{
		System.out.println(num + "/" + den + " = " + num/den);
	}
}
public class Class08 {

	public static void main(String[] args) {
		try {
			Ctest.test(5,0);
		}
		catch(ArithmeticException e){
			System.out.println("���Ƭ�0");
		}
		finally {
			System.out.println("end of main()!!");
		}

	}

}
