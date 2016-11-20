package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(ofdigits(n));

	}
	public static int ofdigits(int v){
		if (v/10<1){
			return 1;
		}else{
			return 1+ofdigits(v/10);
		}
		
	}

}
