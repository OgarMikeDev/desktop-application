import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;

public class MainForm {
    private String header = "Header for Name and SurNameOne and SurNameTwo";
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
                //Full name
                String newName = nameTextArea.getText().replaceFirst("Name", "").trim();
                String newSurnameOne = surnameOneTextArea.getText().replaceFirst("SurnameOne", "").trim();
                String newSurnameTwo = surnameTwoTextArea.getText().replaceFirst("SurnameTwo", "").trim();


                //Column names
                Integer nameInitially = "Name".length();
                Integer surnameInitially = "SurnameOne".length();


                //If error
                if (nameTextArea.getText().length() <= nameInitially || surnameOneTextArea.getText().length() <= surnameInitially) {
                    //Change the color of the blocks to red
                    nameTextArea.setBackground(Color.RED);
                    surnameOneTextArea.setBackground(Color.RED);

                    JOptionPane.showMessageDialog(
                            mainPanel,
                            "You must fill in the fields\n\"Name\" and \"SurNameOne\"",
                            "Header for text",
                            JOptionPane.PLAIN_MESSAGE
                    );
                    return;
                }


                //If full name exist and button equals "Collapse"
                if (nameTextArea.getText().length() >= nameInitially && surnameOneTextArea.getText().length() >= surnameInitially && buttonCollapse.getText() == "Collapse") {
                    //text button "Collapse" set "Expand"
                    buttonCollapse.setText("Expand");


                    JOptionPane.showMessageDialog(
                            mainPanel,
                            newName.concat(" ").concat(newSurnameOne).concat(" ").concat(newSurnameTwo),
                            header,
                            JOptionPane.PLAIN_MESSAGE
                    );
                    return;
                }


                //If full name correct and button equals "Expand"
                if (nameTextArea.getText().length() >= nameInitially && surnameOneTextArea.getText().length() >= surnameInitially && buttonCollapse.getText() == "Expand") {
                    String regexForNameAndSurname = "[A-Z][a-z]+";

                    if (newName.replaceAll("\\s+", "").matches(regexForNameAndSurname) && newSurnameOne.replaceAll("\\s+", "").matches(regexForNameAndSurname)) {
                        //text button "Expand" set "Collapse"
                        buttonCollapse.setText("Collapse");
                        JOptionPane.showMessageDialog(
                                mainPanel,
                                newName.concat(" ").concat(newSurnameOne).concat(" ").concat(newSurnameTwo),
                                header,
                                JOptionPane.PLAIN_MESSAGE
                        );
                    } else {
                        System.out.print(newName + " " + newSurnameOne);
                        JOptionPane.showMessageDialog(
                                mainPanel,
                                "Please enter correct data for First Name and SurNameOne",
                                "Header for invalid data",
                                JOptionPane.PLAIN_MESSAGE

                        );
                        return;
                    }
                    return;
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
