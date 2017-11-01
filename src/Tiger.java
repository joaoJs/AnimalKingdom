import java.awt.*;

public class Tiger extends Critter {
    private int count = 0;
    private int random = (int)(Math.floor(Math.random() * 3));

    public Tiger() {
        super();
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }

    public Color getColor() {
        if (count % 3 == 0) {
            random = (int) (Math.floor(Math.random() * 3));
        }
        if (random == 1) {
            count++;
            return Color.RED;
        } else if (random == 2) {
            count++;
            return Color.GREEN;
        } else {
            count++;
            return Color.BLUE;
        }
    }

    public String toString() {
        return "TGR";
    }
}
