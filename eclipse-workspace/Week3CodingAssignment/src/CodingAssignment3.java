
import java.util.Arrays;

public class CodingAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Ages = new int[9];

		Ages[0] = 3; // 1
		Ages[1] = 9; // 1
		Ages[2] = 23; // 1
		Ages[3] = 64; // 1
		Ages[4] = 2; // 1
		Ages[5] = 8; // 1
		Ages[6] = 28; // 1
		Ages[7] = 93; // 1
		Ages[8] = 82;// 1B
		int lastNum = Ages.length; // 1B
		int SumOfAges = 0; // 1C
		int AverageOfAges = 0;// 1C

		System.out.println(Ages[lastNum - 1] - Ages[0]); // 1A remember I added a new number in here in part 1B

		for (int i = 0; i <= Ages.length - 1; i++) // 1C
		{
			SumOfAges = SumOfAges + Ages[i]; // 1C
			System.out.println("sum = " + SumOfAges); // 1C
			System.out.println("i = " + i); // 1C
		}
		System.out.println("Average of ages " + SumOfAges / Ages.length); // 1C

		String[] names = new String[6];// 2

		names[0] = "Sam";// 2
		names[1] = "Tommy";// 2
		names[2] = "Tim";// 2
		names[3] = "Sally";// 2
		names[4] = "Buck";// 2
		names[5] = "Bob";// 2
		double totalNumOfChars = 0;// 2

		for (int i = 0; i < names.length; i++)// 2a
		{
			totalNumOfChars += names[i].length();// 2a
		}

		System.out.println("Average number of letters is " + totalNumOfChars / names.length);// 2a

		for (int i = 0; i < names.length; i++) {// 2b
			System.out.print(names[i] + " ");// 2b
		}

		System.out.println();
		int threeAnswer = Ages[Ages.length - 1]; // 3 array[array.length-1]
		int fourAnswer = Ages[0]; // 4 array[0]

		System.out.println("The answer to three is " + threeAnswer + " and the answer to four is " + fourAnswer); // 3 &
																													// 4

		int[] nameLengths = new int[names.length]; // 5

		for (int i = 0; i < names.length; i++) { // 5
			nameLengths[i] = names[i].length(); // 5
		}
		System.out.println(Arrays.toString(nameLengths));// 5

		totalNumOfChars = 0; // 6

		for (int i = 0; i < names.length; i++)// 6
		{
			totalNumOfChars = nameLengths[i] + totalNumOfChars; // 6
		}

		System.out.println("Sum of all elements in array is now " + totalNumOfChars);// 6

		String repeaterWord = "Hello";// 7
		int repeaterTimes = 3;// 7

		String repeatString = repeaterString(repeaterWord, repeaterTimes);// 7
		System.out.println(repeatString);// 7

		String firstName = "Bob";// 8
		String lastName = "Ross";// 8
		String fullname = createFullName(firstName, lastName);// 8

		System.out.println(fullname);// 8

		// Boolean greaterThanA100 = SumTheInts(Ages);//9

		System.out.println(true);// 9

		double midtermGrades[] = { 65.55, 88.77, 99.55 };// 10
		Double doubleave = problem10(midtermGrades);// 10
		System.out.println("The average grades for problem 10 was " + doubleave);// 10

		double finalGrades[] = { 45.77, 88.28, 97.77 };// 11
		boolean courseGrade = problem11(midtermGrades, finalGrades);// 11
		System.out.println("Was the midterm average grades higher than the final grades -" + courseGrade);// 11

		boolean problem12 = willBuyDrink();
		System.out.println("Will they buy the drink and the answer is " + problem12);// 11

		int vinceVaughRottenTomatoeScores[] = { 85, 54, 21, 82, 54, 68 };
		boolean vinceVaughnResult = problem13(vinceVaughRottenTomatoeScores);
		System.out.println(
				"It is " + problem13(vinceVaughRottenTomatoeScores) + " that Vince Vaughn is a terrible actor");

	}

	public static String repeaterString(String x, int y)// 7
	{
		String NameOut = "";// 7

		for (int z = 0; y > z; z++) // 7
		{
			NameOut = NameOut + x;// 7
			
		}

		return NameOut;// 7
	}

	public static String createFullName(String p, String q) // 8
	{ // 8

		String fullName = p + " " + q; // 8
		return fullName; // 8
	}

	public static Boolean SumTheInts(int[] array) // 9
	{ // 9
		int sumOfArray = 0; // 9

		for (int i = 0; i <= array.length - 1; i++) // 9
		{
			sumOfArray = sumOfArray + array[i];// 9
		}
		if (sumOfArray > 100)// 9
		{
			return true;// 9

		}

		return false;// 9

	}

	public static double problem10(double[] array) { // 10
		double SumOfArray = 0;
		double aveofarray = 0;

		for (int i = 0; i <= array.length - 1; i++) // 10
		{
			SumOfArray = SumOfArray + array[i];// 10
		}
		aveofarray = (SumOfArray / array.length);// 10
		return aveofarray;// 10
	}

	public static boolean problem11(double[] array1, double[] array2) // 11
	{ // 11
		double SumOfArray1 = 0; // 11
		double aveofarray1 = 0; // 11
		double SumOfArray2 = 0; // 11
		double aveofarray2 = 0; // 11

		for (int i = 0; i <= array1.length - 1; i++) // 11
		{
			SumOfArray1 = SumOfArray1 + array1[i];// 11
		}
		aveofarray1 = (SumOfArray1 / array1.length);// 11

		for (int i = 0; i <= array2.length - 1; i++) // 11
		{
			SumOfArray2 = SumOfArray2 + array2[i]; // 11
		}
		aveofarray2 = (SumOfArray2 / array2.length); // 11

		if (aveofarray1 > aveofarray2) // 11
		{

			return true; // 11

		}

		return false;// 11

	}

	public static boolean willBuyDrink() // 12
	{
		double moneyInPocket = 55.55; // 12
		boolean isHotOutside = true; // 12

		if (moneyInPocket > 10.50 && isHotOutside == true)// 12
		{
			return true;// 12
		} else // 12
		{
			return false;// 12

		}
	}

	public static boolean problem13(int[] array)// 13
	{
		int sumOfArray = 0;// 13
		int aveOfArray = 0;// 13

		{
			for (int i = 0; i <= array.length - 1; i++) // 13

				sumOfArray = sumOfArray + array[i];// 13

			aveOfArray = (sumOfArray / array.length);// 13

		}
		{
			if (aveOfArray < 70) // 13
			{
				return true;// 13
			}

			return false;// 13
		}
	}

}
			