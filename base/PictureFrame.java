package base;

import java.awt.*;
import javax.swing.*;

public class PictureFrame {
    private int[] reroll = null;
    private Main master = null;
    private DominoPanel dp;

    // Inner class representing the panel to display the grid
    class DominoPanel extends JPanel {
        private static final long serialVersionUID = 4190229282411119364L;

        // Overrides the paintComponent method to paint the panel
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBackground(g);
            Location l = new Location(1, 2);
            // Checks if the master object and its mode are valid
            if (master != null && (master.mode == 1 || master.mode == 0)) {
                l.drawGridLines(g);
                drawHeadings(g);
                drawGrid(g);
                if (master.mode == 1) {
                    master.drawGuesses(g);
                } else {
                    master.drawDominoes(g);
                }
            }
        }

        // Draws the background of the panel
        private void drawBackground(Graphics g) {
            g.setColor(Color.YELLOW);
            g.fillRect(0, 0, getWidth(), getHeight());
        }

        // Draws the row and column headings
        private void drawHeadings(Graphics g) {
            for (int row = 0; row < 7; row++) {
                fillDigitGivenCentre(g, 10, 30 + row * 20, 20, row + 1);
            }
            for (int col = 0; col < 8; col++) {
                fillDigitGivenCentre(g, 30 + col * 20, 10, 20, col + 1);
            }
        }

        // Draws the grid based on the master's grid data
        private void drawGrid(Graphics g) {
            for (int row = 0; row < 7; row++) {
                for (int col = 0; col < 8; col++) {
                    drawDigitGivenCentre(g, 30 + col * 20, 30 + row * 20, 20, master.grid[row][col]);
                }
            }
        }

        // Draws a digit at the specified position
        private void drawDigitGivenCentre(Graphics g, int x, int y, int diameter, int n) {
            int radius = diameter / 2;
            g.setColor(Color.BLACK);
            FontMetrics fm = g.getFontMetrics();
            String txt = Integer.toString(n);
            g.drawString(txt, x - fm.stringWidth(txt) / 2, y + fm.getMaxAscent() / 2);
        }

        // Fills a circle with a digit at the specified position
        private void fillDigitGivenCentre(Graphics g, int x, int y, int diameter, int n) {
            int radius = diameter / 2;
            g.setColor(Color.GREEN);
            g.fillOval(x - radius, y - radius, diameter, diameter);
            g.setColor(Color.BLACK);
            g.drawOval(x - radius, y - radius, diameter, diameter);
            FontMetrics fm = g.getFontMetrics();
            String txt = Integer.toString(n);
            g.drawString(txt, x - fm.stringWidth(txt) / 2, y + fm.getMaxAscent() / 2);
        }
    }

    // Constructor for the PictureFrame class
    public PictureFrame(Main sf) {
        master = sf;
        JFrame f = new JFrame("Abominodo");
        dp = new DominoPanel();
        f.setContentPane(dp);
        f.pack();
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }

    // Method for resetting the frame, to be implemented if needed
    public void reset() {
        // TODO: Implement reset logic if needed
    }
}
