package 实验三;

interface ComputeTotalSales

{

    public double totalSalesByYear();

}

class Television implements ComputeTotalSales

{

    public double totalSalesByYear()

    {

        return 500;

    }

}

class Computer implements ComputeTotalSales

{

    public double totalSalesByYear()

    {

        return 300;

    }

}

class Mobile implements ComputeTotalSales

{

    public double totalSalesByYear()

    {

        return 100;

    }

}

class Shop

{

    ComputeTotalSales[]goods;

    double totalSales=0;

    Shop(ComputeTotalSales[]goods)

    {

        this.goods=goods;

    }

    public double giveTotalSales()

    {

        totalSales=0;

        for (int i=0;i<goods.length;i++)

        {

            totalSales=totalSales+goods[i].totalSalesByYear();

        }

        return totalSales;

    }

}

public class di3ti

{

    public static void main(String args[])

    {

        ComputeTotalSales[] goods=new ComputeTotalSales[1123];

        for(int i=0;i<goods.length;i++)

        {

            if(i%3==0)

                goods[i]=new Television();

            else if(i%3==1)

                goods[i]=new Computer();

            else if(i%3==2)

                goods[i]=new Mobile();

        }

        Shop shop=new Shop(goods);

        System.out.println("商店年销售额："+shop.giveTotalSales());

    }

}