package project.src;

import javax.swing.*;
import java.awt.*;

public class MazeFrame {
    private JFrame basicFrame;

    public MazeFrame(Dimension size, Point location) {
        basicFrame = new JFrame("Basic Maze");
        basicFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        basicFrame.setSize(size);
        basicFrame.setLocation(location);

        basicFrame.setVisible(true);

    }
}
