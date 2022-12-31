class RadiousIsNegative extends Exception{
	
}
class RadiousTooLarge extends Exception{
	
}
class CCircle{
	private double radius;
	public void setRadius(double r) throws RadiousIsNegative,RadiousTooLarge{
		if(r<0)
			throw new RadiousIsNegative();
		else if(r > 100)
			throw new RadiousTooLarge();
		else
			radius = r;
	}
	public void show() {
		System.out.println("area = " + 3.14 * radius * radius);
	}
}
public class Class10 {
	 public static void main(String args[]) {
		 CCircle cir = new CCircle();
		 try {
			 cir.setRadius(120);
		 }
		 catch(RadiousIsNegative e) {
			 System.out.println(e + " throwed");
		 }
		 catch(RadiousTooLarge e) {
			 System.out.println(e + " throwed");
		 }
		 cir.show();
	 }
}
