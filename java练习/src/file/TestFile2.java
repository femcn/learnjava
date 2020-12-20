package file;

import java.io.File;

public class TestFile2 {
    public static void main(String[] a){
        File file = new File("C:/WINDOWS");
        File[] fileList = file.listFiles();
        int length = fileList.length;
        long max=fileList[0].length(),min=fileList[0].length();
        int imax = 0,imin = 0;
        for(int i=0;i<length;i++){
            if(max<fileList[i].length()){
                max = fileList[i].length();
                imax = i;
            }
            if(min>fileList[i].length()){
                min = fileList[i].length();
                imin = i;
            }
        }
        System.out.println("最大的长度是："+max+"\t文件目录是："+fileList[imax]);
        System.out.println("最小的长度是："+min+"\t\t文件目录是："+fileList[imin]);
    }
}






