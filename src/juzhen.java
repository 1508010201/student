//���n*n��������ת���󣬰���������ڣ����϶��µ���ת��ʽ�������ͼ�Ρ�
//lv.1
//2017��9��23��

import java.util.Scanner;
public class juzhen {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  Scanner in = new Scanner(System.in);  
		  System.out.print("���������Ľ�����ΧΪ4~10:");  
		  int n = in.nextInt(); 
		  if(n<4||n>10)
			  System.out.println("����������Ҫ��");
		  else
		  {
		  int num[][]=new int[n][n]; //����һ����СΪn*n�Ķ�ά���� 
		  int c=n%2==0 ? n/2:n/2+1;  //
		  int x=0;
		  int y=0;  
		  int value=1;  
		  num[x][y]=value;  
		  for (int i=1;i<=c;i++)
		  {  
		   x++;  
		   // �� �����ȴ��ϵ���  
		   while (x<n&&x>=0&&y<n&&y>=0) 
		   {  
		      if (num[x][y]!=0)  
		        break;  
		    num[x++][y]=++value;  
		   }  
		   x--;  
		   y++;  
		   // �������ȴ�����  
		   while (x<n&&x>=0&&y<n&&y>=0)
		   {  
		    if(num[x][y]!=0)  
		     break;  
		    num[x][y++]=++value;  
		   }  
		   y--;  
		   x--;  
		   // ���������ȴ��µ���  
		   while (x < n && x >= 0 && y < n && y >= 0) {  
		    if(num[x][y]!=0)  
		     break;  
		    num[x--][y]=++value;  
		   }  
		   x++;  
		   y--;  
		   // ���������ȴ��ҵ���  
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
		 
