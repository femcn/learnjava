package Practice;

public class Item
{
    String name;
    int price;
    int attack;

    public static void main(String[] args)
    {
      Item xueping=new Item();
      xueping.name="血瓶";
      xueping.price=50;

      Item caoxie=new Item();
      caoxie.name="草鞋";
      caoxie.price=300;

      Item changjian=new Item();
      changjian.name="长剑";
      changjian.price=350;
      changjian.attack=10;

      System.out.printf("%s:\n价格:%d\n\n",xueping.name,xueping.price);
      System.out.printf("%s:\n价格:%d\n\n",caoxie.name,caoxie.price);
      System.out.printf("%s:\n价格:%d\n攻击力:%d\n\n",changjian.name,changjian.price,changjian.attack);

    }

}
