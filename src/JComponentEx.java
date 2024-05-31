import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JComponentEx {
    public JComponentEx(){
        super("JComponent의 공통 메소드 예제");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("Magenta/yellow Button");
        JButton b2 = new JButton("Disable Button");
        JButton b3 = new JButton("getx(), gety()");

        b1.setBackground(Color.YELLOW);
        b1.Foreground(Color.MAGENTA);
        b1.setFont(new Font("Arial",Font.ITALIC,20));
        b2.setEnabled(false);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JButton b=(JButton)e.getSource();
                setTitle(b.getx()+","+b.gety());
            }
        });
        
        c.add(b1); c.add(b2); c.add(b3);

        setSize(260,200); setVisible(true);

    }

    public static void main(String[] args) {
        new JComponentEx();
    }
    
}
