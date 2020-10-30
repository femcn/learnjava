package Practice;

import java.util.Scanner;


public class Jiecheng
{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("请输出一个整数：");
      int n=s.nextInt();
      int result=1;
      while (n>=1)
      {
          result*=n;
          n--;
      }
      System.out.println("阶乘是："+result);
    }

}
