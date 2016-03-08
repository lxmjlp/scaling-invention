package lxm;

import java.io.IOException;
import java.io.*;
import java.util.*;


public class Qiuhe {	
	public static void main(String[] args) {
	  try
	  {	  
		  FileReader f=new FileReader("data.csv");
		  BufferedReader fis=new BufferedReader(f);
		  Scanner in=new Scanner(System.in);
		  System.out.println("请输入初始位置");
		  int m=in.nextInt();
		  System.out.println("请输入末尾位置");
		  int n=in.nextInt();
		  int hang=n/3+1;
		  int sum=0;
		  String str1=null;
		  String[] strI=null;
		  int result=0;
		  int result1=0;
		  int y;
		  if(m%3==0)
		  {
			  for(int s=1;s<(m/3+1);s++)
			  {
				  str1=fis.readLine();
			  }
		  if((n+1)%3!=0)
		  {
		    for(int j=m/3+1;j<hang;j++)
		    {
		      str1=fis.readLine();
		      strI=str1.split(",");
		      for(int g=0;g<strI.length;g++)
		      {
		      result =Integer.parseInt(strI[g]);
		      sum+=result;
		      }
		    }
		    str1=fis.readLine();
		    strI=str1.split(",");
		    for(int p=0;p<(n+1)%3;p++)//最后一行的
		    {
		    	result1 =Integer.parseInt(strI[p]);
			      sum+=result1;
		    }
		  }
		  else{
			  for(int r=m/3+1;r<=hang;r++)
			    {
			      str1=fis.readLine();
			      strI=str1.split(",");
			      for(int w=0;w<strI.length;w++)
			      {
			      result =Integer.parseInt(strI[w]);
			      sum+=result;
			      }
			    }
		  }
		  }
		  else
		  {
			  for(int h=1;h<(m/3+1);h++)
			  {
				  str1=fis.readLine();
			  }
			  str1=fis.readLine();
			  strI=str1.split(",");
			  y=m%3;
			  if(y==1)
			  {
				  int u=Integer.parseInt(strI[y]);
				  int t=Integer.parseInt(strI[y+1]);
				  sum=sum+u;
				  sum=sum+t;
			  }
			  else if(y==2)
			  {
				  int e=Integer.parseInt(strI[y]);
				  sum=sum+e;
			  }
				  
			  if((n+1)%3!=0)
			  {
			    for(int j=m/3+2;j<hang;j++)
			    {
			      str1=fis.readLine();
			      strI=str1.split(",");
			      for(int g=0;g<strI.length;g++)
			      {
			      result =Integer.parseInt(strI[g]);
			      sum+=result;
			      }
			    }
			    str1=fis.readLine();
			    strI=str1.split(",");
			    for(int p=0;p<(n+1)%3;p++)//最后一行的
			    {
			    	result1 =Integer.parseInt(strI[p]);
				      sum+=result1;
			    }
			  }
			  else{
				  for(int r=m/3+2;r<=hang;r++)
				    {
				      str1=fis.readLine();
				      strI=str1.split(",");
				      for(int w=0;w<strI.length;w++)
				      {
				      result =Integer.parseInt(strI[w]);
				      sum+=result;
				      }
				    }
			  }
		  }
		  System.out.println("和为="+sum);
		}catch(IOException e){}
}
}