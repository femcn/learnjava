package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class TestDate {
    public static void main(String[] args)
    {
        //当前时间
        Date now = new Date();
        //打印当前时间
        System.out.println("当前时间："+now.toString());
        //getTime()得到一个long型的整数
        //这个整数代表1970.1.1 08:00:00:000, 每经历一毫秒，增加1
        System.out.println("当前时间getTime()返回的值是："+now.getTime());

        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是："+zero);
        System.out.println(" ");

        //格式化输出日历
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        Date d1= new Date();
        String str1 = sdf1.format(d1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);

    }
}
