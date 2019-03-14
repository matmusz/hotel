public class Room {

    private static int roomId=0;
    private int size;
    private int whichFloor;
    boolean isRoomEmpty;

    public Room() {
    }

    public Room(int size, int whichFloor, boolean isRoomEmpty) {
        this.size = size;
        this.whichFloor = whichFloor;
        this.isRoomEmpty = isRoomEmpty;
        roomId++;
    }
}
