package ex;
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int sum=0;
		int data[][]=new int[n][m];
		for(int i=0;i<n;i++){			
			for(int j=0;j<m;j++){
				data[i][j]=scn.nextInt();
			sum=sum+data[i][j];
			}
			}sum=sum/(n*m);
			System.out.println(var(sum,data,n,m)/(n*m));
			System.out.println(std(var(sum,data,n,m)/(n*m)));
	
	}
	public static float var (float v, int data[][],int n,int m){
		float sum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
			
			sum=sum+((v-data[i][j])*(v-data[i][j]));
			
		}
		
		
	return sum;}

	public static float std(float g){
		g=(float)Math.sqrt(g);
		
	return g;	
	}




}
