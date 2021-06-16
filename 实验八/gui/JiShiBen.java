package gui;
import javax.swing.*;

public class JiShiBen {
    public static void main(String[] args) {
        JFrame f=new JFrame("记事本");
        f.setSize(300,300);
        f.setLocation(300,300);
        f.setLayout(null);

        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("文件(F)");
        m1.add(new JMenuItem("新建(N)         CTRL+O"));
        m1.add(new JMenuItem("打开(O)         CTRL+O"));
        m1.add(new JMenuItem("保存(S)         CTRL+O"));
        m1.add(new JMenuItem("另存为(V)       CTRL+V"));
        m1.addSeparator();
        m1.add(new JMenuItem("页面设置(O)       "));
        m1.add(new JMenuItem("打印(P)         CTRL+O"));
        m1.addSeparator();
        m1.add(new JMenuItem("退出()          CTRL+O"));


        JMenu m2=new JMenu("编辑(E)");
        JMenu m3=new JMenu("格式(O)");
        JMenu m4=new JMenu("查看(V)");
        JMenu m5=new JMenu("帮助(H)");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);

        f.setJMenuBar(mb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}