package Practice;

import java.util.Scanner;

public class Season
{
public static void main(String[] args)
  {
      Scanner s=new Scanner(System.in);
      System.out.println("请输出查询的月份:");
      int season=s.nextInt();

      switch(season)
      {
          case 3:
          case 4:
          case 5:
          System.out.println("Spring");
          break;

          case 6:
          case 7:
          case 8:
          System.out.println("Summer");
          break;

          case 9:
          case 10:
          case 11:
          System.out.println("Autumn");
          break;

          case 12:
          case 1:
          case 2:
          System.out.println("Winter");
          break;

          default:
              System.out.println("输入月份不合法");
              break;


      }

  }
}
