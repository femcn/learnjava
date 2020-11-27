package property;

public class Item
{
    String name;
    int price;

}
class Armor extends Item
{
    int ac;//护甲等级

    public static void main(String[] args)
    {
        Item xueping=new Item();
        xueping.name="血瓶";
        xueping.price=50;

        Item caoxie=new Item();
        caoxie.name="草鞋";
        caoxie.price=300;

        System.out.printf("%s:\n价格:%d\n\n",xueping.name,xueping.price);
        System.out.printf("%s:\n价格:%d\n\n",caoxie.name,caoxie.price);

             Armor bujia=new Armor();
             bujia.name="布甲";
             bujia.price=300;
             bujia.ac=15;

             Armor suozijia=new Armor();
             suozijia.name="锁子甲";
             suozijia.price=500;
             suozijia.ac=40;

        System.out.printf("%s:\n价格:%d\n护甲等级:%d\n",bujia.name,bujia.price,bujia.ac);
        System.out.printf("%s:\n价格:%d\n护甲等级:%d\n",suozijia.name,suozijia.price,suozijia.ac);
    }
}