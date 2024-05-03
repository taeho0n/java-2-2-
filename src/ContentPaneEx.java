import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx(){
        setTitle("Contentpane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우를 종료하면 프로그램 종료

        Container contentpane = getContentPane();
        contentpane.setBackground(Color.ORANGE);
        contentpane.setLayout(new FlowLayout());

        contentpane.add(new JButton("OK"));
        contentpane.add(new JButton("Cancle"));
        contentpane.add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ContentPaneEx();
    }
    
}
