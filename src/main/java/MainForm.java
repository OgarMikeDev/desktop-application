import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;

public class MainForm {
    private JPanel mainPanel;
    private JButton buttonCollapse;
    private JTextArea nameTextArea;
    private JTextArea surnameTwoTextArea;
    private JTextArea surnameOneTextArea;

    public MainForm() {
        buttonCollapse.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Integer nameInitially = "Name".length();
                Integer surnameInitially = "SurNameOne".length();
                if (nameTextArea.getText().length() <= nameInitially || surnameOneTextArea.getText().length() <= surnameInitially) {
                    nameTextArea.setBackground(Color.RED);
                    surnameOneTextArea.setBackground(Color.RED);

                    JOptionPane.showMessageDialog(
                            mainPanel,
                            "You must fill in the fields\n\"Name\" and \"SurNameOne\"",
                            "Header for text",
                            JOptionPane.PLAIN_MESSAGE
                    );
                }
            }
        });

        buttonCollapse.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                nameTextArea.setBackground(Color.WHITE);
                surnameOneTextArea.setBackground(Color.WHITE);
                surnameTwoTextArea.setBackground(Color.WHITE);

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
