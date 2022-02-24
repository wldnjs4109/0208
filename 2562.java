import java.util.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int MAX=0,N=0;
		Scanner s = new Scanner(System.in);
 
		int[] A = new int[9];
		for(int i=0;i<9;i++) {
			A[i]=s.nextInt();
		}
 
		for(int j=0;j<9;j++) {
			if(MAX<A[j]) {
				MAX=A[j];
				N=j+1;
			}
		}
		System.out.println(MAX);
		System.out.println(N);
	}
}
