package ChatBot;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class chatBot extends JFrame{
     public JTextArea text = new JTextArea();
     public JTextField textField = new JTextField();
     public JButton button = new JButton();
     public JLabel label = new JLabel();

chatBot(){
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setSize(400,400);
    frame.getContentPane().setBackground(Color.BLACK);
    frame.setTitle("ChatBot");
    frame.add(text);
    frame.add(textField);
    text.setSize(300,310);
    text.setLocation(1, 1);
    text.setBackground(Color.WHITE);
    textField.setSize(300, 20);
    textField.setLocation(1, 320);
    frame.add(button);
    label.setText("SEND");
    button.add(label);
    button.setSize(400, 50);
    button.setLocation(300,  320);

    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==button){
                String textSpace = textField.getText().toLowerCase();
                text.setForeground(Color.BLACK);
                text.append("you -->" + textSpace + "\n");
                textField.setText("");

                if(textSpace.contains("hi")) {
                    replyMeth("HI THERE, WELCOME TO TOBI \nCHAT BOT");

                }
                else if (textSpace.contains("how are you"))
                    replyMeth("I'M ALWAYS GOOD TO SERVE YOU BETTER ");
                else if(textSpace.contains("okay"))
                    replyMeth("YEAH, I HOPE YOU GOT IT ");
                else if(textSpace.contains("bye"))
                    replyMeth("ALRIGHT BYE\uD83D\uDC4B");
                else if(textSpace.contains("game"))
                    replyMeth("this features is not yet added");
                else if(textSpace.contains("name"))
                    replyMeth("ChatBot");
                else if(textSpace.contains("gender"))
                    replyMeth("AI doesn't have a particular gender");
                 else if(textSpace.contains("okay"))
                      replyMeth("Yeah");
                else
                    replyMeth("I DON'T UNDERSTAND");
            }
        }
         
         
    });



    }
    public void replyMeth(String s){
        text.append("ChatBot-->" + s + "\n");
}

}

public class Application {
    public static void main(String[] args) {
        new chatBot();
    }
}
