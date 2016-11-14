package ex;
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int data[]=new int[n];
		float sum=0;
		for(int i=0;i<n;i++){
			data[i]=scn.nextInt();	
		    sum=sum+data[i];
		}sum=sum/n;
		System.out.println(var(sum,data)/n);
		System.out.println(std(var(sum,data)/n));

	}
	public static float var (float v, int data[]){
		float sum=0;
		for(int i=0;i<data.length;i++){
			
			sum=sum+((v-data[i])*(v-data[i]));
			
		}
		
		
	return sum;}

	public static float std(float g){
		g=(float)Math.sqrt(g);
		
	return g;	
	}






}


