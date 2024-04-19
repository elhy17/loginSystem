import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Loginpage extends Main implements ActionListener {
    JFrame frame = new JFrame("myFirstApp");
    JButton loginButton = new JButton("login");
    JButton resetButton = new JButton("reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPassword = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID: ");
    JLabel userpasswordLabel = new JLabel("password: ");

    JLabel messageLabel = new JLabel("younes s app");




    HashMap<String,String> logininfo= new HashMap<String,String>();
    Loginpage(HashMap<String,String> loginInfoOriginal){
        logininfo = loginInfoOriginal;
        userIDLabel.setBounds(50,100,75,25);
        userpasswordLabel.setBounds(50,150,75,25);



        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);





        frame.add(userIDLabel);
        frame.add(userpasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPassword);
        frame.add(loginButton);
        frame.add(resetButton);
        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(125,100,200,25);
        userPassword.setBounds(125,150,200,25);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== resetButton) {
            userIDField.setText("");
            userPassword.setText("");
        }
        if(e.getSource()==loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(userPassword.getPassword());

            if (logininfo.containsKey(userID)) {

                if(logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("login succesfull");
                    frame.dispose();
                    welcomePage welcomepage = new welcomePage();
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("wrong password");
                }
            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("not found");


            }
        }
    }
}
