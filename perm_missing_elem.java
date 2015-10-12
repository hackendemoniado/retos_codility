package codility_tape_equilibrium;

public class perm_missing_elem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={2, 3, 1,1, 5};
		System.out.println(solution(A));
	}
	public static int solution(int[] A)
	{
		int max=0,min=10000000;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]<min)
				min=A[i];
			if(A[i]>max)
				max=A[i];
		}
		min++;
		System.out.println("min:"+min+" max:"+max);
		for(int i=0;i<A.length;i++)
		{
			int j=0;		
			while(j<A.length&&A[j]!=min)
				j++;
			if(j<A.length)
				min++;
			else return min;
		}
		
		return 0;
	}	
}
