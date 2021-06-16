package Ex4;

public class Ex4(){
        RandomAccessFile raf = null;
        try {
        raf = new RandomAccessFile(new File("hello.txt"),"rw");
        raf.seek(4);
        byte[] b = new byte[10];
        int len;
        StringBuffer sb = new StringBuffer();
        while((len = raf.read(b)) != -1){
        sb.append(new String(b,0,len));
        }
        raf.seek(4);
        raf.write("xy".getBytes());
        raf.write(sb.toString().getBytes());
        }catch (IOException e) {
// TODO Auto-generated catch block
        e.printStackTrace();
        }finally{
        if(raf != null){
        try {
        raf.close();
        } catch (IOException e) {
// TODO Auto-generated catch block
        e.printStackTrace();
        }
        }
        }
        }
        }
