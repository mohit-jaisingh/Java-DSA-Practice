package recursion_ClassProblems;

public class FindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastPower(5,50)); //best approach
		System.out.println(findPower(5,50));
		
	}

	static int findPower(int a , int n) {// return a^n  //O(N) time
		
		if(n==0) return 1; //base case
		
//		if(n==1) { //base case
//			return n;
//		}
//		
		return a * findPower(a , n-1); //operation and call for sub problem
	}
	
	//Binary Exponentiation or Fast Power
	
	//if power is even, divide the power by 2, multiply base to itself.
	// if power is odd, subtract 1 from power, then divide the pow by 2, base*base then multiply base at end.
	// Eg pow(3^10) = (9^5) = (9^4)*9 = (81^2)*9 = (6561^1)*9
	
	static int fastPower(int a, int n) { //O(logn) time
		if(n==0) {
			return 1;
		}
		
		if(n%2==0) {
			return fastPower(a*a, n/2);
		}else {
			return fastPower(a*a, (n-1)/2) * a;
		}
	}
}
