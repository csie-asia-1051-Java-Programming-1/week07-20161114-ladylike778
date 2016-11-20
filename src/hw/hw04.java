package hw;
import java.util.*;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.println(gcd(m, n));
	}
	public static int gcd(int m,int n){
		if(m/n==0)
			return n;
		else {
			return gcd(n, m/n);}

	}}


