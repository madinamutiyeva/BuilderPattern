import java.util.HashMap;
import java.util.Map;

class Room implements Cloneable {
    private Map<Direction, Wall> sides = new HashMap<>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    public int getRoomNo() {
        return roomNo;
    }

    @Override
    public Room clone() {
        try {
            Room roomClone = (Room) super.clone();
            roomClone.sides = new HashMap<>(this.sides); // Shallow copy of sides
            return roomClone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "sides=" + sides +
                ", roomNo=" + roomNo +
                '}';
    }
}
