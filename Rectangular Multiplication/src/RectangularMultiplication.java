

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Math;

public class RectangularMultiplication {

	static int multiplier,multiplicand,total;
	
	public static void main(String[] args)
	{
		int i,j,hash1,hash2,sum,carry=0,product=0;
		
		int a[][]= new int[100][100];
		int b[][]= new int[100][100];
		
		int[] m1 = new int[100];
		int[] m2 = new int[100];
		int[] result = new int[100];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		
			System.out.println("Enter Multiplier");
			multiplier = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Multiplicand");
			multiplicand = Integer.parseInt(br.readLine());
		
			int temp=multiplier;
			
			for(i=1;temp!=0;i++)
			{
				m1[i]=(int)temp%10;
				temp=temp/10;
			}
			
			int rows=i;
			
			temp=multiplicand;
			
			for(j=1;temp!=0;j++)
			{
				m2[j]=(int)temp%10;
				temp=temp/10;
			}
			
			int cols=j;
			
			total=(rows-1)+(cols-1);
			HashEntry[] entry= new HashEntry[total];
			
			for(i=0;i<total;i++)
			{
				entry[i]= new HashEntry();
			}
			// Reverse the Array
			for(i=1;i<=rows/2;i++)
			{
				temp=m1[i];
				m1[i]=m1[rows-i];
				m1[rows-i]=temp;
			}
			
			for(j=1;j<=cols/2;j++)
			{
				temp=m2[j];
				m2[j]=m2[cols-j];
				m2[cols-j]=temp;
			}
			
	
			
			for(i=1;i<cols;i++)
			{
				for(j=1;j<rows;j++)
				{
					a[i][j]=(m1[j]*m2[i])/10;
					b[i][j]=(m1[j]*m2[i])%10;
					
					hash1=total-(i+j)+1;
					hash2=total-(i+j);
					
					entry[hash1].addvalue(a[i][j]);
					entry[hash2].addvalue(b[i][j]);
				
				}
			}	
			
			for(i=0;i<total;i++)
			{
				sum=entry[i].sum()+carry;
				result[i]=sum%10;
				carry=sum/10;
			}
			
		
			for(i=0;i<total;i++)
			{
				System.out.println(result[i]);
			}
			
			for(i=0; i<total;i++)
			{
				product=(int) ((result[i])*(java.lang.Math.pow(10,i))+product);
			}
		
			System.out.println(product);
		} 
		
		
		
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}


