package frog_river_one;

public class frog_river_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1, 2, 3, 5, 2, 3};
		int X=5;		
		System.out.println(solution(X,A));
	}
	public static int solution(int X, int[] A)
	{
		int busca = X;
        boolean[] arrebusca = new boolean[busca+1];        
        for(int i = 0; i < A.length; i++){
            if(arrebusca[A[i]]!=true){
            	arrebusca[A[i]] = true;                
                busca--;                
            }
            if(busca == 0) return i;
        }
        return -1;
	}
}
