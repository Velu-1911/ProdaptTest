import java.util.*;
import java.io.*;
public class JavaTestProblems {

	public static void main(String[] args) {
		Studentsort2();
		

	}
	
	private static void Jumpproblem() {
		Scanner in = new Scanner(System.in);
		int n;
		int count=1;
		n = in.nextInt();
		int[] a = new int[n]; 
		for(int i=0;i<a.length;i++) {
			a[i] = in.nextInt();
		}
		int maxi=a.length;
		int start=0;
//		while(start<maxi) {
//			int jump=a[start];
//			int max=Integer.MIN_VALUE;
//			for(int i=start+1;i<=jump;i++) {
//				Math.max(a[i], max);
//			}
//			System.out.println(max);
//		}
		for(int i=0;i<a.length;i++) {
			int end=a[i];
			int max=Integer.MIN_VALUE;
			for(int j=i+1;j<=end;j++) {
				max=Math.max(max, a[j]);
			}
			i=i+max;
			count++;
			;
		}
		System.out.println(count);
	}

	private static void grouptreasure() {
		Scanner in = new Scanner(System.in);
		int n;
		int max = 0;
		n = in.nextInt();
		int[] a = new int[n]; 
		for(int i=0;i<a.length;i++) {
			a[i] = in.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			max+=a[i];
		}
		if(max%2==0) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		
		
	}

	public static void Studentsort2() {
		// TODO Auto-generated method stub
		List<String> student = new ArrayList<>();
		String[] students = {"Manoj Kumar","Tom Hanks","Manoj Bajpayee","Tom Cruise"
				,"John Wick","Alice Smith","Alice Wonderland","John Cena"};
		for(int i=0;i<students.length;i++) {
			student.add(students[i]);
		}
		Collections.sort(student);
		for(int i=0;i<students.length;i++) {
			String name = student.get(i);
			System.out.println(name);
		}
	}

	public static void Studentsort1() {
		// TODO Auto-generated method stub
		List<String> student = new ArrayList<>();
		String[] students = {"Alice","Bella","Edward","John","Zack"};
		for(int i=0;i<students.length;i++) {
			student.add(students[i]);
		}
		Collections.sort(student);
		for(int i=0;i<students.length;i++) {
			String name = student.get(i);
			System.out.println(name);
		}
	}

	public static void Profitloss() {
		Scanner in = new Scanner(System.in);
		int n;
		int max = Integer.MIN_VALUE;
		n = in.nextInt();
		int[] a = new int[n]; 
		for(int i=0;i<a.length;i++) {
			a[i] = in.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			int sum=0;
			for(int j=i+1;j<a.length;j++) {
				sum+=a[j];
				max=Math.max(max, sum);
			}
		}
		System.out.print(max);
	}

	public static void Passionrun() {
		Scanner in = new Scanner(System.in);
		int flag=0;
		int n=0;
		while(flag==0) {
			System.out.println("Enter a starting Distance (between 5 and 8km)");
			n = in.nextInt();
			if((n>=5) && (n<=8)) {
				flag = 1;
				continue;
			}
			System.out.println("Sorry, Choose between 5km and 8km");
			System.out.println(" ");
			
		}
		int i=n;
		while(i>0) {
			System.out.println("Distance to run:" + i);
			if(i==(n-1)) {
				System.out.println("Good start Keep it up!");
			}
			if(i<3) {
				System.out.println("almost there!");
				
			}
			if(i==1) {
				System.out.println("Done for the day!");
			}
			
			i--;
		}
		
	}

}
