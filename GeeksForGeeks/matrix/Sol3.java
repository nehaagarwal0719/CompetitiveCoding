import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int q=1;q<=T;q++){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    
		 int a[][] = new int[m][n];
		 int j,i,c=0;
		 
		 for(i=0;i<m;i++){
		     for(j=0;j<n;j++)
		       a[i][j]=sc.nextInt();
		  } 
		  int res=0,min=Integer.MIN_VALUE;
		  for(i=0;i<m;i++){

		     int l=0,r=n-1,mid=0;
		     int f=0;
		     while(l<=r){
		         mid=(l+r)/2;
		         if(a[i][mid]==1 && (mid==0 || a[i][mid-1]==0)){
		             f=1;
		            break;
		         }
		         else if(a[i][mid]==0)
		            l=mid+1;
		         else
		            r=mid-1;
		     }
		     if(mid>min && f==1){
		         min=mid;
		         res=i;
		     }
		  } 
		  if(min==Integer.MIN_VALUE)
		   System.out.println(-1);
		  else 
		    System.out.println(res);
		}
	}
}