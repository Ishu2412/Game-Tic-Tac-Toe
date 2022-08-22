package Game;
import java.util.*;
public class Tic_Tac_Toe {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("-------------------------------------------------------Welcome to Game----------------------------------------------------------");
	   System.out.print("Enter first Player name = ");
	   String name1=sc.nextLine();
	   System.out.print("Enter second Player name = ");
	   String name2=sc.nextLine();
	   boolean b=true;
	   String arr[][]=new String[3][3];
	   for(int i=0,ch='a';i<3;i++)
		   for(int j=0;j<3;j++,ch++)
			   arr[i][j]=(char)ch+"";
	   int c=0;
	   print(arr);
	   while(b)
	   {
		   if(c>=9)
			   break;
		   c++;
		   System.out.print("First player = ");
		   String s1=sc.nextLine().toLowerCase();
		   for(int i=0;i<3;i++)
			   for(int j=0;j<3;j++)
				   if(arr[i][j].equals(s1))
					   arr[i][j]="x";
		   print(arr);
		   if(win(arr))
		   {
			   System.out.println("Congratulations "+name1+" you won.");
			   break;
		   }
		   if(c>=9)
			   break;
		   c++;
		   System.out.print("Second player = ");
		   String s2=sc.nextLine().toLowerCase();
		   for(int i=0;i<3;i++)
			   for(int j=0;j<3;j++)
				   if(arr[i][j].equals(s2))
					   arr[i][j]="0";
		   print(arr);
		   if(win(arr))
		   {
			   System.out.println("Congratulations "+name2+" you won.");
			   break;
		   }
	   }
	   if(!win(arr))
		   System.out.println("You both loose, better luck next time.");
	   System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
   }
   public static boolean win(String arr[][])
   {
	   for(int i=0;i<3;i++)
	   {
		   if(arr[i][0].equals(arr[i][1])&&arr[i][0].equals(arr[i][2]))
			   return true;
		   if(arr[0][i].equals(arr[1][i])&&arr[0][i].equals(arr[2][i]))
			   return true;
	   }
	   if(arr[0][0].equals(arr[1][1])&&arr[0][0].equals(arr[2][2]))
		   return true;
	   if(arr[0][2].equals(arr[1][1])&&arr[1][1].equals(arr[2][0]))
		   return true;
	   return false;
	   
   }
   public static void print(String arr[][])
   {
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			   System.out.print(arr[i][j]);
			   if(j<2)
				   System.out.print(" | ");
		   }
		   System.out.println();
		   if(i<2)
		   System.out.print("--| - |--");
		   System.out.println();
	   }
   }
}
