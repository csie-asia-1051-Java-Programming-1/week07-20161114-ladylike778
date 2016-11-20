package hw;
import java.util.*;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int i=0;
		System.out.print(fun(n,i));
	}
    public static int fun(int n,int i){
   
      if(n==0)
    	return i;
      else
    	i=i*10;
       	return fun(n/10,i+n%10);
        }

	}


