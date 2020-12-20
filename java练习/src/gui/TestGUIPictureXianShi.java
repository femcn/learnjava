package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUIPictureXianShi {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);

        final JLabel l = new JLabel();

        ImageIcon i = new ImageIcon("D:\\大学文件夹\\大二课程\\learnjava\\java练习\\picture\\shana.png");
        l.setIcon(i);
        l.setBounds(125, 50, i.getIconWidth(), i.getIconHeight());

        JButton b = new JButton("隐藏图片");
        b.setBounds(50, 200, 100, 30);

        // 给按钮 增加 监听
        b.addActionListener(new ActionListener() {

            // 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行
            public void actionPerformed(ActionEvent e) {
                l.setVisible(false);
            }
        });
        JButton c = new JButton("显示图片");
        c.setBounds(250, 200, 100, 30);

        c.addActionListener(new ActionListener() {

            // 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行
            public void actionPerformed(ActionEvent e) {
                l.setVisible(true);
            }
        });

        f.add(l);
        f.add(b);
        f.add(c);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}