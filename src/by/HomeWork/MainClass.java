package by.HomeWork;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MainClass
{
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                CalculatorFrame frame = new CalculatorFrame();
               frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setBounds(300, 300, 400, 400);
                frame. setVisible(true);
            }
        });
    }
}
