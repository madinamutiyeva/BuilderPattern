import java.util.HashMap;
import java.util.Map;

public class Maze implements Cloneable {
    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room r) {
        rooms.put(r.getRoomNo(), r);
    }

    public Room roomNo(int r) {
        return rooms.get(r);
    }

    @Override
    public Maze clone() {
        try {
            Maze mazeClone = (Maze) super.clone();
            mazeClone.rooms = new HashMap<>(this.rooms); // Shallow copy of rooms
            return mazeClone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Maze{" +
                "rooms=" + rooms +
                '}';
    }
}





