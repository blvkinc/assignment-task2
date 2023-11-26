package base;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class Location extends SpacePlace {
	private int column;
    private int row;
    private Direction direction;

	public enum Direction {
        VERTICAL, HORIZONTAL
    };

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

	public Location(int row, int column, Direction direction) {
        this(row, column);
        this.direction = direction;
    }

	public String toString() {
        if (direction == null) {
            int tempCol = column + 1;
            return "(" + tempCol + "," + (row + 1) + ")";
        } else {
            int tempCol = column + 1;
            return "(" + tempCol + "," + (row + 1) + "," + direction + ")";
        }
	}

	public void drawGridLines(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        for (int tmp = 0; tmp <= 7; tmp++) {
            g.drawLine(20, 20 + tmp * 20, 180, 20 + tmp * 20);
        }
        for (int see = 0; see <= 8; see++) {
            g.drawLine(20 + see * 20, 20, 20 + see * 20, 160);
        }
	}

	public static int getInt() {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				return Integer.parseInt(r.readLine());
			} catch (Exception e) {
			}
		} while (true);
	}
}
