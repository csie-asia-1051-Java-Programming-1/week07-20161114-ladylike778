package ex;
import java.util.*;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		System.out.println(fun(n));

	}
	public static int fun(int v1){
		if(v1==1){
			return v1;
		}else{
			return v1*fun(v1-1);
			
		}
	}



	}


