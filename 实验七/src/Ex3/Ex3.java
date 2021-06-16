package Ex3;

public class Ex3 {
 2 public static void main(String[] args) throws Exception {
        3 int lineNumber=0;
        4 File f1 = new File("d:\\test.txt");
        5 File f2 = new File("d:\\test2.txt");
        6 PrintStream ps = new PrintStream(f2);
        7 Scanner in = new Scanner(f1);
        8 String st = null;
        9 while(in.hasNext()){
            10 st = in.nextLine();
            11 ps.println((++lineNumber) + st);
            12 }
        13 ps.close();
        14 in.close();
        15 }
16 }