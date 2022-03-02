import javax.swing.*;
public class Main{
    public static void main(String[] args) {
        Gui okno = new Gui();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setSize(250, 200);
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);

    }
}