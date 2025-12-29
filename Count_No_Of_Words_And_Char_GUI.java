import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class Count_No_Of_Words_And_Char_GUI extends JFrame implements ActionListener
{
    JLabel label_1 , label_2;
    JButton btn_1 , btn_2;
    JTextArea textarea;
    JScrollPane scrollPane;
    Count_No_Of_Words_And_Char_GUI()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setTitle("GUI based Word and Character Count");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0xDCDCDC));
        textarea = new JTextArea("Sample Text");
        textarea.setBounds(25,90,725,350);
        textarea.setFont(new Font("Arial",Font.PLAIN,18));
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setMargin(new Insets(10,10,10,10));
        scrollPane = new JScrollPane(textarea);
        scrollPane.setBounds(25,90,725,350);
        label_1 = new JLabel();
        label_1.setBounds(25,25,200,50);
        label_1.setFont(new Font("Arial",Font.PLAIN,12));
        label_2 = new JLabel();
        label_2.setBounds(500,25,200,50);
        label_2.setFont(new Font("Arial",Font.PLAIN,12));
        btn_1 = new JButton("Number of Words");
        btn_1.setBounds(25,470,200,50);
        btn_1.setFont(new Font("Arial",Font.PLAIN,14));
        btn_2 = new JButton("Number of Characters");
        btn_2.setBounds(550,470,200,50);
        btn_2.setFont(new Font("Arial",Font.PLAIN,14));
        btn_1.addActionListener(this);
        btn_2.addActionListener(this);
        this.add(scrollPane);
        this.add(label_1);
        this.add(label_2);
        this.setVisible(true);
        this.add(btn_1);
        this.add(btn_2);
    }
    public static void main(String[]args)
    {
        new Count_No_Of_Words_And_Char_GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String str = textarea.getText();
        String count_words[]= str.split(" ");
        int count_characters = str.length();
        if(count_characters == 0)
        {
            if(e.getSource() == btn_1)
            {
                label_1.setText("The number of words = " + 0);
            }
            else if(e.getSource() == btn_2)
            {
                label_2.setText("The number of characters = " + count_characters);
            }
        }
        else
        {
            if(e.getSource() == btn_1)
            {
                label_1.setText("The number of words = " + count_words.length);
            }
            else if(e.getSource() == btn_2)
            {
                label_2.setText("The number of characters = " + count_characters);
            }
        }
    }
}