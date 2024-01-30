package chao.a00hotel;

/**
 * @author jocularchao
 * @date 2024-01-30 9:47
 * @description 酒店类
 */
public class Hotel {

    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[5][10];    //初始化 五层 每层十个房间的旅馆房间二维数组
        // 初始化酒店房间
        for (int floor = 0; floor < rooms.length; floor++) {    //遍历
            for (int roomNum = 0; roomNum < rooms[floor].length; roomNum++) {
                if (floor <= 1) {   //1 2层 标准
                    rooms[floor][roomNum] = new Room((floor + 1) + "0" + (roomNum+1), "标准间", false);
                } else if (floor <= 3) { // 3 4层 双人
                    rooms[floor][roomNum] = new Room((floor + 1) + "0" + (roomNum+1), "双人间", false);
                } else {    //5层 豪华
                    rooms[floor][roomNum] = new Room((floor + 1) + "" + (roomNum+1), "豪华间", false);
                }
            }
        }
    }

    //打印酒店房间
    public void printAllRoom() {
        for (int floor = 0; floor < rooms.length; floor++) {
            for (int roomNum = 0; roomNum < rooms[floor].length; roomNum++) {
                if (roomNum == rooms[floor].length) {   //判断 最后一个房间不用加，
                    System.out.print(rooms[floor][roomNum]);
                } else {
                    System.out.print(rooms[floor][roomNum] + ",");
                }
            }
            System.out.println();
        }
    }

    //预订
    public void bookRoom(String roomNumber) {
        for (int floor = 0; floor < rooms.length; floor++) {   //遍历
            for (int roomNum = 0; roomNum < rooms[floor].length; roomNum++) {
                if (rooms[floor][roomNum].getRoomNumber().equals(roomNumber)) {  //先判断房间号和预定的相同
                    if (!rooms[floor][roomNum].isOccupied()) {  //判断是否占用
                        rooms[floor][roomNum].setOccupied(true);
                        System.out.println(roomNumber + " 预订成功!");
                        return;
                    } else {
                        System.out.println(roomNumber + " 已被占用，无法预订!");
                        return;
                    }
                }
            }
        }
        System.out.println("找不到房间号：" + roomNumber);

    }


    //退订
    public void cancelBooking(String roomNumber) {
        for (int floor = 0; floor < rooms.length; floor++) {   //遍历
            for (int roomNum = 0; roomNum < rooms[floor].length; roomNum++) {
                if (rooms[floor][roomNum].getRoomNumber().equals(roomNumber)) {
                    if (rooms[floor][roomNum].isOccupied()) {
                        rooms[floor][roomNum].setOccupied(false);
                        System.out.println(roomNumber + " 退订成功!");
                        return;
                    } else {
                        System.out.println(roomNumber + " 未被预订，无法退订!");
                        return;
                    }
                }
            }
        }
        System.out.println("找不到房间号：" + roomNumber);
    }

}
