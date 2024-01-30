package chao.a00hotel;

import java.util.Scanner;

/**
 * @author jocularchao
 * @date 2024-01-30 9:47
 * @description 客户端类
 */
public class Client {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("""
                请选择操作:
                            1   打印所有房间
                            2   预订房间名
                            3   退订房间名
                            4   退出
                """);

        Scanner sc = new Scanner(System.in);
        while (true){

            String s = sc.nextLine();
            //输入 1 打印所有房间
            if (s.equals("1")) {
                hotel.printAllRoom();
                continue;
            }
            //输入 预定 房间名  来预定房间
            if (s.startsWith("预定")) {
                hotel.bookRoom(s.substring(3));
                continue;
            }
            //输入 退订 房间名     来退订房间
            if (s.startsWith("退订")) {
                hotel.cancelBooking(s.substring(3));
            }
        }



    }

}
