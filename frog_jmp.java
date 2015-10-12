package codility_tape_equilibrium;

public class frog_jmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=10;
		int Y=85;
		int D=30;
		System.out.println(solution(X,Y,D));
	}
	public static int solution(int X, int Y, int D)
	{
		if(X==Y)
			return 0;
		int i=0;
		while(X<Y)
		{
			X+=D;
			i++;
		}
		return i;
	}
}
