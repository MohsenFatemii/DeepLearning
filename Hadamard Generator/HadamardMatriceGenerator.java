import java.util.Scanner;

public class HadamardMatriceGenerator {
	public static int [][]Generator(int n){
		int t[][] = {{1}};
		int cnt = 1;
		while(n>=cnt){
			if(n==cnt){
				return t;
			}
			int Arr[][] = new int[(int)Math.pow(2,cnt)][(int)Math.pow(2,cnt)];
			for(int i = 0 ;i < t.length ;i++){
				for(int j = 0 ; j < t[0].length;j++){
					Arr[i][j]=t[i][j];
					Arr[i+t.length][j]=t[i][j];
					Arr[i][j+t.length]=t[i][j];
					Arr[i+t.length][j+t.length]=-t[i][j];
				}
			}
			t = Arr;
			cnt++;
		}
		return t;
	}
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.println("Which order of hadamard Matrice you want?\nEg: if you want the second hadamard enter 2\nhere you can see the second hadamard:\n1 1\n1 -1\n");
		int choice = in.nextInt();
		int t[][] = Generator(choice);
		for(int i = 0 ;i < t.length ;i++){
			for(int j = 0 ; j < t[0].length;j++)
				System.out.print(t[i][j]+" ");
			System.out.println();
		}
		
	}
}