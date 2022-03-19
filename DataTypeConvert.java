

public class DataTypeConvert {

	public static void main(String[] args) {
		// String to Integer
		/*
		 * String s= "200";
		 *  int i = Integer.parseInt(s);
		 * 
		 * System.out.println(s+200); 
		 * System.out.println(i+300);
		 */
		// integer to string
		/*
		 * int x = 300; 
		 * String y = String.valueOf(x);
		 *  System.out.println(y+20);
		 * System.out.println(x+20);
		 */
		// string to long
		String s = "200";
		long l = Long.parseLong(s);
		System.out.println(s + 20);
		System.out.println(l + 20);
		//long to string 
		long lo = 2453;
		String st = String.valueOf(lo);
		System.out.println(st+20);
		System.out.println(lo+20);
		//string to float
		String sr = "20.45";
		float f = Float.parseFloat(sr);
		System.out.println(sr+200);
		System.out.println(f+255);
		//float to string
	    float fl = (float) 4.90;
		String x = String.valueOf(fl);
		System.out.println(fl+20);
		System.out.println(x+20);
		

	}

}
