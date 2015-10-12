package codility_tape_equilibrium;


public class tape_equilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={3, 1, 2, 4 ,3};
		System.out.println(solution2(A));
	}
	public static int solution2(int[] A)
	{
		long derecha=0;
		long izquierda=0;
		long valorabsoluto;
		
		for(int i=1;i<A.length;i++)
		{
			izquierda+=A[i];			
		}
		derecha=A[0];
		valorabsoluto=Math.abs(izquierda-derecha);
		for(int i=1;i<A.length;i++)
		{
			if(Math.abs(izquierda-derecha)<valorabsoluto)
			{
				valorabsoluto=Math.abs(izquierda-derecha);
			}
			derecha+=A[i];
			izquierda-=A[i];
		}
		return (int)valorabsoluto;
	}
	/*public static int solution(int[] A) {

	    long sumright = 0;
	    long sumleft = 0;
	    long ans;

	    for (int i =1;i<A.length;i++)
	    {
	        sumright += A[i];
	    }

	    sumleft = A[0];
	    ans =Math.abs( sumleft - sumright );
	    System.out.println("sumright:"+sumright);
	    System.out.println("sumleft:"+sumleft);
	    System.out.println("ans:"+ans);
	    for (int P=1; P<A.length; P++)
	    {
	    	if (Math.abs( sumleft - sumright ) < ans)
	    	{
	    	  ans = Math.abs( sumleft - sumright );
	    	  System.out.println("ans en for: i="+P+"ans:"+ans);
	    	}
	        sumleft += A[P];
	        sumright -=A[P];
	        System.out.println("sumleft:"+sumleft);
	        System.out.println("sumright:"+sumright);
	    }
	    return (int) ans;  
	}*/
}
