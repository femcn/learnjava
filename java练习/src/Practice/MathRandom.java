package Practice;

public class MathRandom {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);

        System.out.println("数组中的各个随机数是：");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        int[] b=new int[]{1,2,3};
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);

    }
}