import javax.swing.*;
import java.awt.*;

public class LableEx  extends JFrame{
    public LableEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(new FlowLayout());

        JLabel textLable= new JLabel("제임스 고슬링입니다!.");

        ImageIcon img = new ImageIcon("images/Desert.jpg");
        JLabel imageLable=new JLabel(img);

        ImageIcon icon= new ImageIcon("images/icon.gif");
        JLabel label =new JLabel("커피한잔 하실래예,전화 주이소", icon, SwingConstants.CENTER);

        c.add(textLable);
        c.add(imageLable);
        c.add(label);

        setSize(300,500);
        setVisible(true);

    }
    
    public static void main(String[] args) {
        new LableEx();
    }
}
