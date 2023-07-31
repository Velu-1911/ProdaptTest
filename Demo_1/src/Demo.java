import java.io.FileReader;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Demo {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
        	a[i] = sc.nextInt();
        	
        }
        int b[] = new int[2*n];
        for(int i=0;i<n;i++) {
        	b[i] = a[i];
        	b[i+n]=a[i];
        	
        }
        for(int i=0;i<b.length;i++) {
        	System.out.println(b[i]);
 
        }
        
            
	}

}
