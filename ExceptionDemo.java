
public class ExceptionDemo {

	public static void main(String[] args) {
		int x,y;
		
		try{
			x = 1;
			y = 3;
			
			printString("product:" + x*y);
		} 
		catch (Exception e) 
		{
			System.out.println("ERROR");
		}
		finally{
			System.out.println("Finally here");
		}
		printString("hi");


	}
	public static void printstring(String s) throws NullpointerException{
		System.out.println(s);
	}

}
