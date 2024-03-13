package org.example.GUI;
import org.example.BusinessLogic.Operations;
import org.example.DataModels.Polynom;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Graphics
{
    private JFrame frame=new JFrame("Polynomial Calculator");
    private JLabel label1=new JLabel(" First Polynomial=");
    private JLabel label2=new JLabel("Second Polynomial=");
    private JLabel label3=new JLabel("Polynomial Calculator");
    private JLabel label4=new JLabel("Result:");
    private JTextArea txtScreen1=new JTextArea();
    private JTextArea txtScreen2=new JTextArea();
    private JTextArea outputScreen=new JTextArea();
    private JButton buttonMultiplicate=new JButton("Multiplicate");
    private JButton buttonDivide=new JButton("Divide");
    private JButton buttonAdd=new JButton("Add");
    private JButton buttonSubstract=new JButton("Substract");
    private JButton buttonDerivat =new JButton("Derivate");
    private JButton buttonIntegrare=new JButton("Integrate");
    private JButton button1=new JButton("1");
    private JButton button2=new JButton("2");
    private JButton button3=new JButton("3");
    private JButton button4=new JButton("4");
    private JButton button5=new JButton("5");
    private JButton button6=new JButton("6");
    private JButton button7=new JButton("7");
    private JButton button8=new JButton("8");
    private JButton button9=new JButton("9");
    private JButton button0=new JButton("0");
    private JButton buttonplus=new JButton("+");
    private JButton buttonminus=new JButton("-");
    private JButton buttonslash=new JButton("/");
    private JButton buttonstar=new JButton("*");
    private JButton buttonpower=new JButton("^");
    private JButton buttonpoint=new JButton(".");
    private JButton buttonx=new JButton("x");
    private JButton buttondel=new JButton("del");
    private JButton buttonclearall=new JButton("CLEAR ALL");

    public Graphics ()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,550);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(255,204,229));
        createObjects();
        addObjects();
        createActionListener();
        frame.setVisible(true);
    }
    private void addObjects()
    {
        frame.add(label3);
        frame.add(label1);
        frame.add(label2);
        frame.add(label4);
        frame.add(txtScreen1);
        frame.add(txtScreen2);
        frame.add(outputScreen);
        frame.add(buttonMultiplicate);
        frame.add(buttonSubstract);
        frame.add(buttonDivide);
        frame.add(buttonDerivat);
        frame.add(buttonIntegrare);
        frame.add(buttonAdd);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);
        frame.add(buttonplus);
        frame.add(buttonminus);
        frame.add(buttonslash);
        frame.add(buttonstar);
        frame.add(buttonpower);
        frame.add(buttonpoint);
        frame.add(buttonx);
        frame.add(buttondel);
        frame.add(buttonclearall);

    }
    private void createObjects()
    {
        label3.setSize(380,50);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setFont(new Font("Serif",Font.BOLD,25));
        label1.setSize(380,50);
        label1.setLocation(7,40);
        label1.setFont(new Font ("Serif",Font.ITALIC,15));
        label2.setSize(380,50);
        label2.setLocation(7,80);
        label2.setFont(new Font ("Serif",Font.ITALIC,15));
        label4.setSize(380,50);
        label4.setLocation(15,432);
        label4.setFont(new Font("Serif",Font.ITALIC,15));
        txtScreen1.setSize(200,26);
        txtScreen1.setLocation(150,50);
        txtScreen2.setSize(200,26);
        txtScreen2.setLocation(150,90);
        outputScreen.setSize(400,26);
        outputScreen.setLocation(2,475);
        buttonMultiplicate.setSize(160,45);
        buttonMultiplicate.setLocation(15,150);
        buttonSubstract.setSize(160,45);
        buttonSubstract.setLocation(208,150);
        buttonDivide.setSize(160,45);
        buttonDivide.setLocation(15,200);
        buttonDerivat.setSize(160,45);
        buttonDerivat.setLocation(208,200);
        buttonAdd.setSize(160,45);
        buttonAdd.setLocation(15,250);
        buttonIntegrare.setSize(160,45);
        buttonIntegrare.setLocation(208,250);
        button1.setSize(53,45);
        button1.setLocation(15,310);
        button1.setBackground(Color.PINK);
        button2.setSize(53,45);
        button2.setLocation(70,310);
        button2.setBackground(Color.PINK);
        button3.setSize(53,45);
        button3.setLocation(125,310);
        button3.setBackground(Color.PINK);
        button4.setSize(53,45);
        button4.setLocation(15,357);
        button4.setBackground(Color.PINK);
        button5.setSize(53,45);
        button5.setLocation(70,357);
        button5.setBackground(Color.PINK);
        button6.setSize(53,45);
        button6.setLocation(125,357);
        button6.setBackground(Color.PINK);
        button7.setSize(53,45);
        button7.setLocation(15,404);
        button7.setBackground(Color.PINK);
        button8.setSize(53,45);
        button8.setLocation(70,404);
        button8.setBackground(Color.PINK);
        button9.setSize(53,45);
        button9.setLocation(125,404);
        button9.setBackground(Color.PINK);
        button0.setSize(53,45);
        button0.setLocation(208,310);
        button0.setBackground(Color.PINK);
        buttonplus.setSize(53,45);
        buttonplus.setLocation(263,310);
        buttonplus.setBackground(Color.MAGENTA);
        buttonminus.setSize(53,45);
        buttonminus.setLocation(318,310);
        buttonminus.setBackground(Color.MAGENTA);
        buttonslash.setSize(53,45);
        buttonslash.setLocation(208,357);
        buttonslash.setBackground(Color.MAGENTA);
        buttonstar.setSize(53,45);
        buttonstar.setLocation(263,357);
        buttonstar.setBackground(Color.MAGENTA);
        buttonpower.setSize(53,45);
        buttonpower.setLocation(318,357);
        buttonpower.setBackground(Color.MAGENTA);
        buttonpoint.setSize(53,45);
        buttonpoint.setLocation(208,404);
        buttonpoint.setBackground(Color.MAGENTA);
        buttonx.setSize(53,45);
        buttonx.setLocation(263,404);
        buttonx.setBackground(Color.MAGENTA);
        buttondel.setSize(53,45);
        buttondel.setLocation(318,404);
        buttondel.setBackground(Color.MAGENTA);
        buttonclearall.setSize(163,20);
        buttonclearall.setLocation(208,452);
        buttonclearall.setBackground(Color.MAGENTA);

    }
    boolean t1_selected = false;
    boolean t2_selected = false;
    private void createActionListener()
    {
        txtScreen1.addFocusListener(new FocusListener() {

            @Override
            public void focusLost(FocusEvent arg0) {
            }
            @Override
            public void focusGained(FocusEvent arg0) {
                t1_selected = true;
                t2_selected = false;
            }
        });
        txtScreen2.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {
            }
            @Override
            public void focusGained(FocusEvent e) {
                t1_selected = false;
                t2_selected = true;
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(t1_selected)
                        txtScreen1.append("0");
                    if (t2_selected)
                        txtScreen2.append("0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("1");
                if (t2_selected)
                    txtScreen2.append("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("2");
                if (t2_selected)
                    txtScreen2.append("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("3");
                if (t2_selected)
                    txtScreen2.append("3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("4");
                if (t2_selected)
                    txtScreen2.append("4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("5");
                if (t2_selected)
                    txtScreen2.append("5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("6");
                if (t2_selected)
                    txtScreen2.append("6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("7");
                if (t2_selected)
                    txtScreen2.append("7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("8");
                if (t2_selected)
                    txtScreen2.append("8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("9");
                if (t2_selected)
                    txtScreen2.append("9");
            }
        });
        buttonplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("+");
                if (t2_selected)
                    txtScreen2.append("+");
            }
        });
        buttonminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("-");
                if (t2_selected)
                    txtScreen2.append("-");
            }
        });
        buttonx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("x");
                if (t2_selected)
                    txtScreen2.append("x");
            }
        });
        buttonpower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("^");
                if (t2_selected)
                    txtScreen2.append("^");
            }
        });
        buttonstar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("*");
                if (t2_selected)
                    txtScreen2.append("*");
            }
        });
        buttonslash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append("/");
                if (t2_selected)
                    txtScreen2.append("/");
            }
        });
        buttonpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1_selected)
                    txtScreen1.append(".");
                if (t2_selected)
                    txtScreen2.append(".");
            }
        });
        buttondel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                outputScreen.setText("");
            }
        });

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1= txtScreen1.getText();
                String s2=txtScreen2.getText();
                if (s2.isEmpty()||s1.isEmpty())
                    outputScreen.setText("Te rog sa introduci polinoame in ambele campuri");
                else
                {Polynom p1=new Polynom(s1);
                Polynom p2=new Polynom(s2);
                Operations op=new Operations();
                Polynom p3=op.add(p1,p2);
                String s3=p3.readHashmap(p3);
                outputScreen.setText(s3);}

            }
        });
        buttonMultiplicate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1= txtScreen1.getText();
                String s2=txtScreen2.getText();
                if (s2.isEmpty()||s1.isEmpty())
                    outputScreen.setText("Te rog sa introduci polinoame in ambele campuri");
                else
                {Polynom p1=new Polynom(s1);
                Polynom p2=new Polynom(s2);
                Operations op=new Operations();
                Polynom p3=op.multiply(p1,p2);
                String s3=p3.readHashmap(p3);
                outputScreen.setText(s3);}
            }
        });
        buttonclearall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtScreen1.setText("");
                txtScreen2.setText("");
                outputScreen.setText("");
            }
        });

        buttonSubstract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1= txtScreen1.getText();
                String s2=txtScreen2.getText();
                if (s2.isEmpty()||s1.isEmpty())
                    outputScreen.setText("Te rog sa introduci polinoame in ambele campuri");
                else
                {Polynom p1=new Polynom(s1);
                Polynom p2=new Polynom(s2);
                Operations op=new Operations();
                Polynom p3=op.substract(p1,p2);
                String s3=p3.readHashmap(p3);
                outputScreen.setText(s3);}
            }
        });
        buttonIntegrare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String s1= txtScreen1.getText();
                if (s1.isEmpty())
                    outputScreen.setText("Te rog sa introduci polinom in primul camp pentru integrare");
                else {
                    Polynom p1 = new Polynom(s1);
                    Operations op = new Operations();
                    Polynom p3 = op.integrate(p1);
                    String s3 = p3.readHashmap(p3);
                    outputScreen.setText(s3);
                }
            }
        });
        buttonDerivat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1= txtScreen1.getText();
                if (s1.isEmpty())
                    outputScreen.setText("Te rog sa introduci polinom in primul camp pentru derivare");
                else {
                    Polynom p1 = new Polynom(s1);
                    Operations op = new Operations();
                    Polynom p3 = op.derive(p1);
                    String s3 = p3.readHashmap(p3);
                    outputScreen.setText(s3);
                }
            }
        });
    }
    public static void main(String[] args)
    {
        new Graphics();
    }
}
