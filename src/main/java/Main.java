import javax.swing.*;

public class Main {
    //main
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000, 500);


        frame.add(new MainForm().getMainPanel());


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
