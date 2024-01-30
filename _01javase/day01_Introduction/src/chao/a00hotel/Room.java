package chao.a00hotel;

/**
 * @author jocularchao
 * @date 2024-01-30 9:57
 * @description
 * //标准间   standard room
 *     standardroom,
 *     //双人间   double room
 *     doubleroom,
 *     //豪华间   deluxe room
 *     deluxeroom
 */
public class Room {

    private String roomNumber; // 房间编号
    private String roomType; // 房间类型
    private boolean isOccupied; // 是否占用

    public Room(String roomNumber, String roomType,boolean isOccupied) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = isOccupied;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    //自定义打印
    @Override
    public String toString() {
        return "["+roomNumber+" "+roomType+" "+(isOccupied?"占用":"空闲")+"]";
    }
}
