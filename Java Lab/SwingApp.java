import javax.swing.*;
public class SwingApp {
    SwingApp(){
        JFrame F = new JFrame();
        JLabel FirstName = new JLabel("First Name");
        FirstName.setBounds(20,50,80,20);

        JLabel LastName = new JLabel("Last Name");
        LastName.setBounds(20,80,80,20);

        JLabel Dob = new JLabel("Date of Birth");
        Dob.setBounds(20,110,80,20);

        JTextField FirstNameTF = new JTextField();
        FirstNameTF.setBounds(120,50,100,20);

        JTextField LastNameTF = new JTextField();
        LastNameTF.setBounds(120,80,100,20);

        JTextField DobTF = new JTextField();
        DobTF.setBounds(120,110,100,20);

        JButton Submit = new JButton("Submit");
        Submit.setBounds(20, 160, 100, 30);

        JButton Reset = new JButton("Reset");
        Reset.setBounds(120,160,100,30);

        F.add(FirstName);
        F.add(LastName);
        F.add(Dob);
        F.add(FirstNameTF);
        F.add(LastNameTF);
        F.add(DobTF);
        F.add(Submit);
        F.add(Reset);

        F.setSize(300,300);
        F.setLayout(null);
        F.setVisible(true); 

    }
    public static void main(String[] args){
        SwingApp s = new SwingApp();
    }
}