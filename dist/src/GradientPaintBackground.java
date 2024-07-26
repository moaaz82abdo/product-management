import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GradientPaintBackground {

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                // the GUI as seen by the user (without frame)
                JPanel gui = new JPanel(new BorderLayout(15, 15)) {

                    @Override
                    public void paintComponent(Graphics g) {
                        super.paintComponent(g);

                        Point point1 = new Point(10, 10);
                        Point point2 = new Point(
                                getWidth() - 10, 
                                getHeight() - 10);
                        final GradientPaint gp = new GradientPaint(
                                point1, Color.green,
                                point2, new Color(255, 225, 100),
                                true);

                        // we need a Graphics2D to use GradientPaint.
                        // If this is Swing, it should be one..
                        final Graphics2D g2 = (Graphics2D) g;
                        g2.setPaint(gp);
                        g.fillRect(0, 0, getWidth(), getHeight());
                    }
                };
                // adjust size to need.
                gui.setBorder(new EmptyBorder(400, 400,400,400));

             

                JFrame f = new JFrame("Gradient Background in JFrame");
                f.add(gui);
                // Ensures JVM closes after frame(s) closed and
                // all non-daemon threads are finished
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                // See https://stackoverflow.com/a/7143398/418556 for demo.
                f.setLocationByPlatform(true);

                // ensures the frame is the minimum size it needs to be
                // in order display the components within it
                f.pack();
                f.setMinimumSize(f.getSize());
                // should be done last, to avoid flickering, moving,
                // resizing artifacts.
                f.setVisible(true);
            }
        };
        // Swing GUIs should be created and updated on the EDT
        // http://docs.oracle.com/javase/tutorial/uiswing/concurrency
        SwingUtilities.invokeLater(r);
    }
}