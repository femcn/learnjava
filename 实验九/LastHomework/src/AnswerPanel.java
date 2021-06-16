
import javax.swing.*;

public class AnswerPanel extends JPanel {

    JButton shitou,jiandao,bu;
    String imageName[]={
            "D:\\大学文件夹\\大二课程\\learnjava\\LastHomework\\石头.jpg",
            "D:\\大学文件夹\\大二课程\\learnjava\\LastHomework\\剪刀.jpg",
            "D:\\大学文件夹\\大二课程\\learnjava\\LastHomework\\布.jpg"};
    Icon icon[]= new Icon[imageName.length];
    Box box;

    AnswerPanel(){
        setSize(60,300);
        setVisible(true);

        for (int i=0;i<icon.length;i++){
            icon[i]=new ImageIcon(imageName[i]);
        }
        shitou = new JButton(icon[0]);
        shitou.setSize(50,50);
        jiandao = new JButton(icon[1]);
        jiandao.setSize(50,50);
        bu = new JButton(icon[2]);
        bu.setSize(50,50);
        box=Box.createVerticalBox();
        box.add(shitou);
        box.add(jiandao);
        box.add(bu);
        add(box);
        validate();
    }

}

