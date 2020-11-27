package 实验二;

import java.util.Arrays;

public class Trangle {
    double sideA,sideB,sideC,area,length;
    boolean boo;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public  Trangle(double a, double b, double c)
    {
        //参数a,b,c分别赋值给sideA,sideB,sideC。
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        double p[] = new double[3];
        p[0] = a;
        p[1] = b;
        p[2] = c;
        Arrays.sort(p);
        if((p[0]+p[1]>p[2])&&(p[2]-p[1]<p[0])) //a,b,c构成三角形的条件表达式。
        {
       boo = true ;//给boo赋值。
        }
    else
        {
        boo = false ;//给boo赋值。
        }
    }

    double getLength()
    {
      return this.length = sideA + sideB + sideC; //方法体，要求计算出length的值并返回。
    }
    public double  getArea()
    {
        if(boo)
        {
            double p=(sideA+sideB+sideC)/2.0;
            area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
            return area;
        }
        else
        {
            System.out.println("不是一个三角形,不能计算面积");
            return 0;
        }
    }
    public void setABC(double a,double b,double c)
    {
   this.sideA = a;//参数a,b,c分别赋值给sideA,sideB,sideC。
   this.sideB = b;
   this.sideC = c;
        double p[] = new double[3];
        p[0] = a;
        p[1] = b;
        p[2] = c;
        Arrays.sort(p);
        if((p[0]+p[1]>p[2])&&(p[2]-p[1]<p[0])) //a,b,c构成三角形的条件表达式。
        {
        boo = true;//给boo赋值。
        }
    else
        {
        boo = false;//给boo赋值。
        }
    }
}

class Lader
{
    double above,bottom,height,area;
    Lader(double a,double b,double h)
    {
        this.above = a;
        this.bottom = b;
        this.height = h;
        //方法体。
    }
    double getArea()
    {
      return this.area = (this.above + this.bottom)*this.height/2;//方法体，,要求计算出area返回。
    }
}

class AreaAndLength
{
    public static void main(String args[])
    {
        double length,area;
        Trangle trangle = null;
        Lader lader;
        trangle = new Trangle(3,4,5);//创建对象trangle。
        lader = new Lader(1,1,1); //创建对象lader。
        length = trangle.getLength();// trangle调用方法返回周长并赋值给length。
        System.out.println("三角形的周长:"+length);
        area = trangle.getArea();// trangle调用方法返回面积并赋值给area。
        System.out.println("三角形的面积:"+area);
        area = lader.getArea();// lader调用方法返回面积并赋值给area。
        System.out.println("梯形的面积:"+area);
        trangle.setABC(12,34,1);// trangle调用方法返修改三个边的代码，要求将三个边修改为12,34,1。
        area = trangle.getArea();// trangle调用方法返回面积并赋值给area。
        if(trangle.boo == false)
        System.out.println("三角形的面积不存在");
        if(trangle.boo == false)
        length = trangle.getLength();// trangle调用方法返回周长并赋值给length。
        System.out.println("三角形的周长不存在");
    }
}
