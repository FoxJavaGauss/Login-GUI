import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Main implements ActionListener {
  private static JLabel userLabel;
  private static JTextField userText;
  private static JLabel passwordLabel;
  private static JPasswordField passwordText;
  private static JButton button;
  private static JLabel successorfailure;
  public static void main(String[] args) {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    frame.setSize(350, 350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    panel.setLayout(null);
    userLabel = new JLabel("Username");
    userLabel.setBounds(10, 20, 80, 25);
    panel.add(userLabel);
    userText = new JTextField(20);
    userText.setBounds(100, 20, 165, 25);
    panel.add(userText);
    passwordLabel = new JLabel("Password");
    passwordLabel.setBounds(10, 50, 80, 25);
    panel.add(passwordLabel);
    passwordText = new JPasswordField();
    passwordText.setBounds(100, 50, 165, 25);
    panel.add(passwordText);
    button = new JButton("Login");
    button.setBounds(10, 80, 80, 25);
    button.addActionListener(new Main());
    panel.add(button);
    successorfailure = new JLabel("");
    successorfailure.setBounds(10, 110, 400, 25);
    panel.add(successorfailure);
    frame.setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    String username = userText.getText();
    String password = passwordText.getText();
    if(username.equals("FoxJava") && password.equals("Java")) {
      successorfailure.setText("Login successful!");
    }
    else {
      successorfailure.setText("Incorrect username or password. Please try again.");
    }
  }
}