package Charactor;

class ADHero extends Hero implements AD
{

    public ADHero(String name, float hp)
    {
        super(name, hp);
    }

    @Override
    public void physicAttack()
    {
        System.out.println("进行物理攻击");
    }
    public static void main(String[] args)
    {
       ADHero jiansheng=new ADHero("剑圣",500);
       jiansheng.physicAttack();
    }
}