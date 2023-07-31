import java.util.*;


public class TestPractice {

	public static void main(String[] args) {
		DuneyNum();

	}
	

	public static void DuneyNum() {
		Scanner in = new Scanner(System.in);
		int  n= in.nextInt();
		int num = n*n;
		int numcp= num;
		int nodig=0,div=1;
		System.out.println(numcp);
		while(numcp!=0) {
			nodig++;
			numcp=numcp/10;		
		}
		System.out.println(nodig);
		for(int i=0;i<(nodig/2);i++) {
			div=div*10;
		}
		int _1half= num%div;
		int _2half = num/div;
		if((_1half+_2half)==n) {
			System.out.print("TRUE");
		}
		else {
			System.out.print("False");
		}
		
	
		
	}


	public static void SwapXor() {
		Scanner in = new Scanner(System.in);
		int  n= in.nextInt();
		int m =in.nextInt();
		
		n=n^m;
		m=n^m;
		n=n^m;
		
		System.out.print("Numbers are " + (int)n +" and " + (int)m);
	}

	public static void PatterProblem() {
		Scanner in = new Scanner(System.in);
		int  n= in.nextInt();
		int num =1;
		int minus=20;
		for(int row=1;row<=n;row++) {
			for(int col =1;col<=row;col++) {
				System.out.print(num+ " ");
				num++;
			}
			for(int k=1;k<=(n+1)-row;k++) {
				System.out.print(minus + " ");
				minus--;
			}
			System.out.println();
		}
		
	}

}
