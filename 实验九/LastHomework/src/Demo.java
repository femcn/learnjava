
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {

    public static void main(String[] args) {
        Play play=new Play("玩家1");
        Play play2=new Play("玩家2");
    }
}

class Play extends JPanel
        implements ActionListener {
    Table table;
    AnswerPanel answerPanel;
    JFrame jFrame;

    Play(String userName){
        table = new Table();
        answerPanel=new AnswerPanel();
        jFrame= new JFrame(userName);
        jFrame.setTitle(userName);

        answerPanel.shitou.addActionListener(this);
        answerPanel.jiandao.addActionListener(this);
        answerPanel.bu.addActionListener(this);

        jFrame.setBounds(100,100,500,500);
        jFrame.add(table,BorderLayout.CENTER);
        jFrame.add(answerPanel,BorderLayout.EAST);
        jFrame.setVisible(true);
        jFrame.validate();
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==answerPanel.shitou) {

            if (table.isConnect==true&&(table.play.getText()=="请出拳")){
                System.out.println("石头");
                table.sendAnswer(1);
                table.playerPanel1.reloadAnswerI(1);
                table.play.setText("等待对方出拳");
            }
        }
        else if(e.getSource()==answerPanel.jiandao) {

            if (table.isConnect==true&&(table.play.getText()=="请出拳")){
                System.out.println("剪刀");
                table.sendAnswer(2);
                table.playerPanel1.reloadAnswerI(2);
                table.play.setText("等待对方出拳");
            }
        }
        if(e.getSource()==answerPanel.bu) {

            if (table.isConnect==true&&(table.play.getText()=="请出拳")){
                System.out.println("布");
                table.sendAnswer(3);
                table.playerPanel1.reloadAnswerI(3);
                table.play.setText("等待对方出拳");
            }
        }
    }
}