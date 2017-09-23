//输出n*n阶数字旋转矩阵，按照由外而内，由上而下的旋转方式输出数字图形。
//lv.1
//2017年9月23日

import java.util.Scanner;
public class juzhen {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		  Scanner in = new Scanner(System.in);  
		  System.out.print("请输入矩阵的阶数范围为4~10:");  
		  int n = in.nextInt(); 
		  if(n<4||n>10)
			  System.out.println("该数不符合要求！");
		  else
		  {
		  int num[][]=new int[n][n]; //创建一个大小为n*n的二维数组 
		  int c=n%2==0 ? n/2:n/2+1;  //
		  int x=0;
		  int y=0;  
		  int value=1;  
		  num[x][y]=value;  
		  for (int i=1;i<=c;i++)
		  {  
		   x++;  
		   // 上 左起，先从上到下  
		   while (x<n&&x>=0&&y<n&&y>=0) 
		   {  
		      if (num[x][y]!=0)  
		        break;  
		    num[x++][y]=++value;  
		   }  
		   x--;  
		   y++;  
		   // 下左起，先从左到右  
		   while (x<n&&x>=0&&y<n&&y>=0)
		   {  
		    if(num[x][y]!=0)  
		     break;  
		    num[x][y++]=++value;  
		   }  
		   y--;  
		   x--;  
		   // 从下右起，先从下到上  
		   while (x < n && x >= 0 && y < n && y >= 0) {  
		    if(num[x][y]!=0)  
		     break;  
		    num[x--][y]=++value;  
		   }  
		   x++;  
		   y--;  
		   // 从上右起，先从右到左  
		   while(x<n&&x>=0&&y<n&&y>=0){  
		    if (num[x][y]!=0)  
		     break;  
		    num[x][y--]=++value;  
		   }  
		   y++;  
		  }  
		  for (int i=0;i<num.length;i++) {  
		   for (int j=0;j<num[i].length;j++) 
		   System.out.printf("%5d", num[i][j]);
		   System.out.println();  
		  }  
		 }  
	}
}
		 
