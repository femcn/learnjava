package Ex3;

import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Number1 Num =new Number1();
        Thread tr =new Thread(Num);
        tr.run();
        try {
            Thread.sleep(10);
            Number1 Num1 =new Number1 ();
            Thread tr1 =new Thread(Num1);
            while(true) {
                tr1.interrupt();
                tr1.run();
                Thread.sleep(50);
                tr.interrupt();
                if(Num1.getNum()==Num.getNum())
                {
                    System.out.println("猜的数字为："+Num1.getNum()+"猜对了");
                    break;
                }
                else
                if(Num1.getNum()<Num.getNum())
                    System.out.println("猜的数字为："+Num1.getNum()+"猜小了");
                else
                    System.out.println("猜的数字为："+Num1.getNum()+"猜大了");
            }
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Number1 implements Runnable{
    int num;
    public synchronized void run() {
        Random n =new Random();
        num=n.nextInt(100);
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num=num;
    }
}
