package week1;

public class Fibonacci {

	/**
	 * 用递归的方法计算第n个斐波那契数为多少
	 * 斐波那契数列为0，1，1，2...
	 * @param n
	 * @return
	 */
	public static int calculateRecursively(int n) {
		if(n <= 0) {
			return 0;
		}else if (n == 1) {
			return 1;
		}else{
			return calculateRecursively(n) + calculateRecursively(n-1);
		}
	}
	
	/**
	 * 用非递归的方式计算第n个斐波那契数为多少
	 * 斐波那契数列为0，1，1，2...
	 * 请完成
	 * @param n
	 * @return
	 */
	public static int calculateIteratively(int n) {
		return 0;
	}
}
