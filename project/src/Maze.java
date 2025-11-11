package project.src;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeListener;

public abstract class Maze implements PropertyChangeListener {
    JFrame mainFrame = new JFrame("Maze Program");
    boolean exitFound = false;

    public Maze() {
        showMaze();
    }

    private void showMaze() {
        mainFrame.setSize(600, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().setBackground(Color.green);

        JTextPane f = new JTextPane();
        f.setText("Score");

        f.setEditable(false);
        //f.setBackground(Color.red);
        //f.setFont(new Font("Arial", Font.BOLD, 14));

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.setOpaque(false);
        topPanel.add(f);

        mainFrame.add(topPanel, BorderLayout.NORTH);
        mainFrame.setVisible(true);
    }
}
