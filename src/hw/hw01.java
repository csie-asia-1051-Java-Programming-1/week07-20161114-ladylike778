package hw;
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int z=scn.nextInt();
		System.out.println(lcm(x,y,z));

	}
	public static int lcm(int x,int y,int z ){
		int a=1;int sum=0;
		while(a!=0){
			if(a%x!=0 || a%z!=0 || a%y!=0){
				a++;
			}else{
				 sum=a;
				a=0;
			}
		}return sum;
	}

}
