
public class SingleNumber3Test {

	public static SingleNumber3 singleNumber = new SingleNumber3();

	public void inputNullTest() {

		int[] in = null;
		int[] out = null;

		int[] result = singleNumber.singleNumber(in);
		if (result==out)
			System.out.println("[TEST] inputNullTest PASS");
		else
			System.out.println("[TEST] inputNullTest FAIL");
	}

	public void inputNormalTest() {

		int[] in = {1, 2, 1, 3, 2, 5};
		int[] out = {3, 5};

		int[] result = singleNumber.singleNumber(in);
		if (out.length==result.length)
			System.out.println("[TEST] inputNormalTest PASS");
		else
			System.out.println("[TEST] inputNormalTest FAIL");
	}

	public static void main(String[] args) {

		SingleNumber3Test singleNumber3Test = new SingleNumber3Test();

		singleNumber3Test.inputNullTest();
		singleNumber3Test.inputNormalTest();
	}
}