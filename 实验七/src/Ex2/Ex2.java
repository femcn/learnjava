package Ex2;

import java.io.*;
public class Ex2 {
    private static String file = "d:\\test01.txt";
    private static String file1 = "d:\\test02.txt";
    public static void write(String content,String file) throws Exception{
        byte[] cot = content.getBytes();
        File f = new File(file1);
        FileOutputStream out = new FileOutputStream(f);
        out.write(cot);
        out.close();
    }
    public static String read(String filePath) throws Exception{
        File f= new File(filePath);
        byte con[]= new byte[1024];
        FileInputStream in = new FileInputStream(f);
        in.read(con);
        String cont = new String(con);
        in.close();
        return cont;
    }
    public static void main(String args[]) throws Exception{
//String content = "Hello Word!!bai!!!!!!!!!!!";
        String content = read(file);
        write(content,file1);
    }
}
