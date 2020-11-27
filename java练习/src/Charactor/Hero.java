package Charactor;

public class Hero
{
    String name;
    float hp;
    float armor;//护甲
    int moveSpeed;

    public Hero(String name,float hp)
    {
        this.name=name;
        this.hp=hp;
    }

    //攻击一个英雄，并让他掉damage点血
    public void attack(Hero hero,int damage)
    {
        hero.hp=hero.hp-damage;
    }

    public void revive(Hero h)
    {
        this.hp=383;
    }

    public static void main(String[] args)
    {
        Hero teemo=new Hero("提莫",383);//创建一个对象
        Hero garen=new Hero("盖伦",616);//使用一个引用来指向这个对象

        garen.attack(teemo,383);
        System.out.println("剩余hp："+teemo.hp+"已被击杀");

        teemo.revive(teemo);
        System.out.println(teemo.hp);

    }
}


