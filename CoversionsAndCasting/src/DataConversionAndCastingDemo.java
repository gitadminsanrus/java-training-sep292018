public class DataConversionAndCastingDemo {

	public static void main(String[] args) {
		
		int x = 32768;
		
		//range of byte is -128 to 127
		byte b = (byte) x;
		
		//Range of short data type is: -32768 to 32767
		short s = (short) x;
		
		double d = 128.5;
		float f = (float) d;
		
		float f1 = 10.5F;
		byte b1 = 10;
		
		long l = 12312345678L;
		
		d = l;
		char ch = 'A';
		char degreeSymbol = '\u00B0';
		
		
		System.out.println("byte b = " + b);
		System.out.println("short s = " + s);
		System.out.println("float f = " + f);
		System.out.println("char ch decimal value = " + (int) ch);
		System.out.println("char degreeSymbol decimal value = " + (int) degreeSymbol);
		System.out.println("28" + degreeSymbol + " C");
		
		for (int i = 0; i <= 1000; i++)
		{
			System.out.print(((char) i) + ", ");
		}

	}
}


































