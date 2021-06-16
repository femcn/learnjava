package Ex2;

public class Maipiao {
    public static void main(String args[]) {
        Thread zhangsan, lisi, wangwu;
        sale Sale = new sale();
        zhangsan = new Thread(Sale);
        zhangsan.setName("z");
        lisi = new Thread(Sale);
        lisi.setName("l");
        wangwu = new Thread(Sale);
        wangwu.setName("w");
        zhangsan.start();
        lisi.start();
        wangwu.start();
    }
}
class sale implements Runnable {
    int number10 = 3, number20 = 0;
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("l")) { // 如果使用该方法的线程传递的参数是10,就不用等待
            number10 = number10 + 1;
            System.out.println("您给我10元。刚好一张票");
        } else if (name.equals("w")) {
            number20 = number20 + 1;
            number10 = number10 - 1;
            System.out.println("您给我20元。找您10元。");
        } else if (name.equals("z")) {
            while (number10 < 4 && number20 == 0) {
                Thread.yield();
            }
            number10 = number10 - 2;
            number20 = number20 - 1;
            System.out.println("您给我50元，找您40元。两张10元。一张20元。");
        }

        /*
         * String name = Thread.currentThread().getName(); if (name.equals("z")) {
         * zhangsan.sales_princ(50); } else if (name.equals("l")) {
         * Sale.sales_princ(10); } else if (name.equals("w")) {
         * Sale.sales_princ(20); }
         */
    }
}

