import javax.swing.*;

public class MenuEx extends JFrame {
    public MenuEx() {
        setTitle("Menu 만들기 예제");
        createMenu();
        setSize(250,200);
        setVisible(true);
    }

    private void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu screenMenu = new JMenu("screen");


        screenMenu.add(new JMenuItem("Load"));
        screenMenu.add(new JMenuItem("Hide"));
        screenMenu.add(new JMenuItem("ReShow"));
        screenMenu.addSeparator(); //ReShow 메뉴아이템 다음에 분리선 삽입
        screenMenu.add(new JMenuItem("Exit"));

        mb.add(screenMenu);
        mb.add(new JMenu("Edit"));
        mb.add(new JMenu("Source"));
        mb.add(new JMenu("Project"));
        mb.add(new JMenu("Run"));

        setJMenuBar(mb);
    }
    public static void main(String[] args) {
        new MenuEx();
    }
    
}
