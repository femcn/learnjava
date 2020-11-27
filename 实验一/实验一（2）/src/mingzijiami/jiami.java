package mingzijiami;

import java.util.Scanner;

public class jiami {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 0; i <= 1000; i++) {
            if (i % 3 == 0 && i % 7 == 0)
                sum = sum + i;
/*
通过循环来计算出同时被3和7整除的整数之和
 */
        }
        char xing=(char)236;
        char ming=(char)88;
        System.out.printf("姓名：曹诺\n学号：2019071002\n");
        System.out.printf("1-1000之间能被3和7同时整除的整数之和是：%d\n",sum);
        System.out.printf("对应的字符是:236-%c\n           88-%c\n", xing,ming);
        System.out.printf("加密后我的姓名是:%c%c\n", xing,ming);

        Scanner in=new Scanner(System.in);
        System.out.printf("请输入你加密后的名字：");
        String name = in.nextLine();
        int a=(int)xing;
        int b=(int)ming;

        System.out.printf("解密后的数字：%d%d",a,b);

    }
    }

