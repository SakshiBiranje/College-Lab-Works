import java.awt.*;

public class AWTApp extends Frame{
    AWTApp(){
    JLabel FirstName = new JLabel("First Name");
        FirstName.setBounds(50,50,80,20);

        JLabel LastName = new JLabel("Last Name");
        LastName.setBounds(50,80,80,20);

        JLabel Dob = new JLabel("Date of Birth");
        Dob.setBounds(50,110,80,20);

        JTextField FirstNameTF = new JTextField();
        FirstNameTF.setBounds(200,50,100,20);

        JTextField LastNameTF = new JTextField();
        LastNameTF.setBounds(200,80,100,20);

        JTextField DobTF = new JTextField();
        DobTF.setBounds(200,110,100,20);

        JButton Submit = new JButton("Submit");
        Submit.setBounds(50, 160, 100, 30);

        JButton Reset = new JButton("Reset");
        Reset.setBounds(250,160,100,30);

        add(FirstName);
        add(LastName);
        add(Dob);
        add(FirstNameTF);
        add(LastNameTF);
        add(DobTF);
        add(Submit);
        add(Reset);

        setSize(400,250);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        AWTApp awt =new AWTApp();
    }
}
