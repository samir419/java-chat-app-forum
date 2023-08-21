/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package citsaap;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import javafx.scene.layout.Border;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Hello
 */
public class CITSAAP {
    JFrame frame;
    JPanel panel;
    
    public CITSAAP(){
        frame = new JFrame("CITSA APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400, 800);
        frame.setBackground(Color.BLUE);

        Font font = new Font ("Arial",Font.BOLD,30);
        
        Font font2 = new Font ("Arial",Font.PLAIN,20);
        //FOOTER
        JPanel footer = new JPanel(null, false);
        footer.setBounds(0, 700, 400, 70);
        footer.setBackground(Color.blue);
            JButton chats = new JButton("chats", null);
            chats.setBounds(1, 1, 100, 70);
            footer.add(chats);
            JButton home = new JButton("home", null);
            home.setBounds(100, 1, 100, 70);
            footer.add(home);
            JButton searchb = new JButton("search", null);
            searchb.setBounds(200, 1, 100, 70);
            footer.add(searchb);
            JButton back = new JButton("back", null);
            back.setBounds(300, 1, 100, 70);
            footer.add(back);
            frame.add(footer);
            footer.setVisible(false);

        
        //CHATPAGE
        JPanel chatpanel = new JPanel(null, false);
        chatpanel.setBounds(0, 0, 400, 800);
        

         JPanel header2 = new JPanel(null, false);
        header2.setBounds(0, 0, 400, 70);
        header2.setBackground(Color.blue);
            JLabel headertf2 = new JLabel();
            headertf2.setBounds(20, 1, 300, 60);
            headertf2.setText("CHAT");
            headertf2.setFont(font);
            headertf2.setForeground(Color.white);
            header2.add(headertf2);
            chatpanel.add(header2);

        
        JTextArea chatArea = new JTextArea();chatArea.setEditable(false);chatArea.setBounds(10, 110, 380, 500);
        chatArea.setFont(font2);
        JScrollPane chatScrollPane = new JScrollPane(chatArea);
        JPanel inputpanel = new JPanel();inputpanel.setLayout(null);inputpanel.setBounds(10, 500, 400, 150);
        JTextField inputField = new JTextField("enter text");inputField.setBounds(10, 20, 250, 140);
        JButton sendButton = new JButton("Send");sendButton.setBounds(290, 20, 80, 40);
        inputpanel.add(inputField);
        inputpanel.add(sendButton);
        chatpanel.add(inputpanel);
        chatpanel.add(chatArea);
        

        frame.add(chatpanel);
        chatpanel.setVisible(false);
        

        //HOME PAGE
        JPanel homepanel = new JPanel(null, false);
        homepanel.setBounds(0, 0, 400, 800);
        homepanel.setBackground(Color.white);
        
        JPanel header = new JPanel(null, false);
        header.setBounds(0, 0, 400, 70);
        header.setBackground(Color.blue);
            JLabel headertf = new JLabel();
            headertf.setBounds(100, 1, 300, 60);
            headertf.setText("CITSA TALK");
            headertf.setFont(font);
            headertf.setForeground(Color.white);
            header.add(headertf);
            JLabel image = new JLabel();
            image.setIcon(new ImageIcon("Untitled-1.jpg"));
            image.setBounds(10, 1, 50, 50);
            header.add(image);
            homepanel.add(header);

        JTextField search = new JTextField();
        search.setBounds(10, 80, 350, 60);
        search.setText("search");
        homepanel.add(search);

        JPanel threads = new JPanel(null, false);
        threads.setBounds(0, 150, 400, 200);
            JLabel ttle = new JLabel();ttle.setBounds(10,10,200,20);ttle.setText("threads");ttle.setFont(font2);threads.add(ttle);
            JButton go = new JButton("go", null);go.setBounds(10, 40, 50, 30);threads.add(go);
            JLabel itc = new JLabel();itc.setBounds(70,40,300,20);itc.setText("java for web development");itc.setFont(font2);;threads.add(itc);
            JButton go2 = new JButton("go", null);go2.setBounds(10, 90, 50, 30);threads.add(go2);
            JLabel itc2 = new JLabel();itc2.setBounds(70,90,300,20);itc2.setText("cyber security for students");itc2.setFont(font2);;threads.add(itc2);
            JButton go3 = new JButton("go", null);go3.setBounds(10, 140, 50, 30);threads.add(go3);
            JLabel itc3 = new JLabel();itc3.setBounds(70,140,300,20);itc3.setText("automation with java");itc3.setFont(font2);;threads.add(itc3);
            homepanel.add(threads);

        JPanel threads2 = new JPanel(null, false);
        threads2.setBounds(0, 350, 400, 200);
            JLabel xttle = new JLabel();xttle.setBounds(10,10,200,20);xttle.setText("channels");xttle.setFont(font2);threads2.add(xttle);
            JButton xgo = new JButton("go", null);xgo.setBounds(10, 40, 50, 30);threads2.add(xgo);
            JLabel xitc = new JLabel();xitc.setBounds(70,40,300,20);xitc.setText("INTRODUCTION TO COMPUTING");xitc.setFont(font2);;threads2.add(xitc);
            JButton xgo2 = new JButton("go", null);xgo2.setBounds(10, 90, 50, 30);threads2.add(xgo2);
            JLabel xitc2 = new JLabel();xitc2.setBounds(70,90,300,20);xitc2.setText("DATABASES");xitc2.setFont(font2);;threads2.add(xitc2);
            JButton xgo3 = new JButton("go", null);xgo3.setBounds(10, 140, 50, 30);threads2.add(xgo3);
            JLabel xitc3 = new JLabel();xitc3.setBounds(70,140,300,20);xitc3.setText("OOP WITH JAVA");xitc3.setFont(font2);;threads2.add(xitc3);
            homepanel.add(threads2);


        frame.add(homepanel);
        homepanel.setVisible(false);

        //LOG IN PAGE
        JLabel login = new JLabel();
        login.setBounds(100, 150, 300, 70);
        login.setText("   LOG IN");
        login.setFont(font);
        login.setForeground(Color.white);
        frame.add(login);

        JTextField textname = new JTextField();
        textname.setBounds(100, 250, 150, 30);
        textname.setText("name");
        textname.setFont(null);
        textname.setEditable(true);
        frame.add(textname);

        JPasswordField textpass = new JPasswordField();
        textpass.setBounds(100, 350, 150, 30);
        textpass.setText("password");
        textpass.setFont(null);
        textpass.setEditable(true);
        frame.add(textpass);

        JButton signin = new JButton("SUBMIT", null);
        signin.setBounds(100, 450, 150, 70);
        frame.add(signin);

        JPanel backpan = new JPanel(null, false);
        backpan.setBounds(0, 0, 400, 800);
        backpan.setBackground(Color.blue);
        frame.add(backpan);

        //FUNCTIONS
        class action implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
        chatpanel.setVisible(true);
    }
    
}
        ActionListener actionl = new action();

        go.addActionListener(actionl);
        go2.addActionListener(actionl);
        go3.addActionListener(actionl);
        xgo.addActionListener(actionl);
        xgo2.addActionListener(actionl);
        xgo3.addActionListener(actionl);
        
        signin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homepanel.setVisible(true);
                frame.remove(signin);
                footer.setVisible(true);
            }
        });
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the text from the input field and append it to the chat area
                String message = inputField.getText();
                chatArea.append(message + "\n");
                inputField.setText("");
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chatpanel.setVisible(false);
            }
        });
        
        frame.setVisible(true);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CITSAAP citsa = new CITSAAP();
                //citsa.setVisible(true);
            }
        });
    }
    
}
