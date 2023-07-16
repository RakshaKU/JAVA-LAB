import java.util.*;
public class lexgraph
{
 public static void main(String[]args)
 {
  Scanner a=new Scanner(System.in);
  String[] str=new String[5];
  for(int i=0;i<5;i++)
  {
   str[i]=a.nextLine();
   }
   for(int i=0;i<5;i++)
    for(int j=i+1;j<5;j++)
    {
    if(str[i].compareTo(str[j])>0)
    {
    String temp=str[i];
    str[i]=str[j];
    str[j]=temp;
    }
   }
  System.out.println("After lexographical sorting:");
  for(int i=0;i<5;i++)
  {
    System.out.println(str[i]);
    }
    }
    }
