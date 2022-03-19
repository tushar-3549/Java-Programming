
public class NumberConversion2 {

	public static void main(String[] args) {
		//convert decimal into binary , octal , hexadecimal
		int decimal=15;
		String binary = Integer.toBinaryString(decimal);
		System.out.println(binary);
		String hexa = Integer.toHexString(decimal);
		System.out.println(hexa);
		String octal = Integer.toOctalString(decimal);
		System.out.println(octal);

	}

}
