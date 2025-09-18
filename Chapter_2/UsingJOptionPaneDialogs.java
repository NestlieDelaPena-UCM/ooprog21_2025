import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, 
                    "Enter your name:", 
                    "Input", 
                    JOptionPane.QUESTION_MESSAGE);

            if (name == null) {
                JOptionPane.showMessageDialog(null, 
                        "Program exited.", 
                        "Exit", 
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            int choice = JOptionPane.showConfirmDialog(null, 
                    "Do you want your name to be shown?", 
                    "Confirm", 
                    JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, 
                        "Your name is: " + name, 
                        "Result", 
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            } else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
                continue;
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Program exited.", 
                        "Exit", 
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
}
