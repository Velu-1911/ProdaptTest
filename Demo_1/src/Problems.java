import java.util.*;


public class Problems
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initial = 1;
        int max = Integer.MIN_VALUE;
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
        	a[i] = sc.nextInt();
        	
        }
        
        for(int i=0;i<n-1;i++) {
        	if(a[i]<a[i+1]) {
        		initial+=1;
        		if(max<initial) {
        			max = initial;
        		}
        	}
        	else {
        		initial=1;
        	}
        }
        
        System.out.println(max);
        
        
//        int power[] = new int[n]; 
//        for(int i=0;i<n;i++) {
//        	a[i] = sc.nextInt();
//        	
//        }
//        for(int i=0;i<n;i++) {
//        	power[i] = sc.nextInt();
//        	
//        } 
//        
//        for(int i=0;i<n;i++) {
//        	System.out.print(a[i] + " ");
//        	System.out.print(power[i]);
//        	System.out.println();
//        	
//        }
//        
//        
//        for (int i = 0; i < a.length-1; i++)   
//        {     
//           for (int j = i+1; j < a.length; j++)    
//           {     
//              if(a[i]>a[j]) //Compare and swap
//              {    
//                  int temp = a[i];    
//                  a[i] = a[j];    
//                  a[j] = temp;
//                  int powertemp = power[i];    
//                  power[i] = power[j];    
//                  power[j] = powertemp;
//              }     
//           }     
//       }
//        
//        for(int i=0;i<n;i++) {
//        	System.out.print(a[i] + " ");
//        	System.out.print(power[i]);
//        	System.out.println();
//        	
//        }
//
//        
//        for(int i=0;i<n;i++) {
//        	int flag =1;
//        	if(a[i]<=initial) {
//        		flag=0;
//        		initial += power[i];
//        	}
//        	if(flag==1) {
//        		System.out.println("Monsters are not defeated");
//        		System.out.println(initial);
//        		System.exit(0);
//        	}
//        }
//        System.out.println("The monster are defeated");
//        
//       
    }
    
    
}