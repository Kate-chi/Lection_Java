//import java.util.Scanner;
// class Test {
 
// 	public static void main(String[] args) {
// 		System.out.println("Я изучаю");
// 		System.out.println ("Java");
// 	}


// }

class Program
{
	//типы данных
	public static void main(String[] args) {
	short age = 10;
	int salary = 123456;
	System.out.println(age); //10
	System.out.println(salary); //123456


	float e = 2.7f;
	double pi = 3.1415;
	System.out.println(e); // 2.7
	System.out.println(pi); // 3.1415


	char ch = '1';
	System.out.println(Character.isDigit(ch)); // true
	ch = 'a';
	System.out.println(Character.isDigit(ch)); // false

	
	boolean flag1 = 123 <= 234;
 	System.out.println(flag1); // true
 	boolean flag2 = 123 >= 234 || flag1;
 	System.out.println(flag2); // true
 	boolean flag3 = flag1 ^ flag2;
 	System.out.println(flag3); // false


	 var a = 123;
	 System.out.println(a); // 123
	 var d = 123.456;
	 System.out.println(d); // 123.456
	

	/*классы обертки int Integer
	short Short
	long Long
	byte Byte
	float Float
	double Double
	char Character
	boolean Boolean
	*/
	System.out.println(Integer.MAX_VALUE); // 2147483647
 	System.out.println(Integer.MIN_VALUE); // -2147483648

	//массивы

	int[] arr = new int[10];
 	System.out.println(arr.length); // 10
 	arr = new int[] { 1, 2, 3, 4, 5 };
 	System.out.println(arr.length); // 5

		//многомерные

	int[] arr1[] = new int[3][5];
	for (int[] line : arr1) {
		for (int item : line) {
	 		System.out.printf("%d ", item);
	 	}
	 	System.out.println();
	}


	int[][] arr2 = new int[3][5];
	for (int i = 0; i < arr2.length; i++) {
		for (int j = 0; j < arr2[i].length; j++) {
			System.out.printf("%d ", arr2[i][j]);
		}
		System.out.println();
	}
   
	//преобразования

	int i = 123; double t = i;
	System.out.println(i); // 123
	System.out.println(t); // 123.0
	t = 3.1415; i = (int)t;
	System.out.println(t); // 3.1415
	System.out.println(i); // 3
	t = 3.9415; i = (int)t;
	System.out.println(t); // 3.9415
	System.out.println(i); // 3
	byte b = Byte.parseByte("123");
	System.out.println(b); // 123
	//b = Byte.parseByte("1234");
	//System.out.println(b); // NumberFormatException: Value out of range


	//данные из терминала

	// Scanner iScanner = new Scanner(System.in);
 	// System.out.printf("name: ");
 	// String name = iScanner.nextLine();
 	// System.out.printf("Привет, %s!", name);
 	// iScanner.close();



	// Scanner iScanner1 = new Scanner(System.in);
	// System.out.printf("int a: ");
	// int x = iScanner1.nextInt();
	// System.out.printf("double a: ");
	// double y = iScanner1.nextDouble();
	// System.out.printf("%d + %f = %f", x, y, x + y);

	// System.out.printf("int a: ");
 	// boolean flag = iScanner1.hasNextInt();
 	// System.out.println(flag); 
 	// int r = iScanner1.nextInt();
 	// System.out.println(r); 
	// iScanner1.close();

	
	//Форматированный вывод

	int aq = 1, bq = 2;
 	int cq = aq + bq;
 	String res = aq + " + " + bq + " = " + cq;
 	System.out.println(res);

	int af = 1, bf = 2;
	int cf = af + bf;
	String resf = String.format("%d + %d = %d \n", af, bf, cf);
	System.out.printf("%d + %d = %d \n", af, bf, cf);
	System.out.println(resf);
	
	

	/*
	 * Виды спецификаторов
	 * %d: целочисленных значений
	 * %x: для вывода шестнадцатеричных чисел
	 * %f: для вывода чисел с плавающей точкой
	 * %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
	 * %c: для вывода одиночного символа
	 * %s: для вывода строковых значений
	 */


	float pin = 3.1415f;
 	System.out.printf("%f\n", pin); // 3,141500
 	System.out.printf("%.2f\n", pin); // 3,14
 	System.out.printf("%.3f\n", pin); // 3,141
 	System.out.printf("%e\n", pin); // 3,141500e+00
 	System.out.printf("%.2e\n", pin); // 3,14e+00
 	System.out.printf("%.3e\n", pin); // 3,141e+00


	}
}

