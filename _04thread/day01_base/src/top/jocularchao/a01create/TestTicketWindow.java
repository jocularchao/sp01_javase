package top.jocularchao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/3 16:39
 * @description: 05医院排队等号机制
 * <p>
 * 四个出号机 最多有50票
 */
public class TestTicketWindow extends Thread {
    //柜台名称
    private final String name;

    //最多受理50笔业务
    private static final int MAX = 1000;

    //改进处：无论TicketWindow被实例化多少次，只需要保证index是唯一的即可
    //private  int index = 1;
    private static int index = 1;

    public TestTicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println("柜台" + name + "当前号码是：" + (index++));
        }
    }

    public static void main(String[] args) {


        TestTicketWindow ticketWindow1 = new TestTicketWindow("一号机");
        ticketWindow1.start();
        TestTicketWindow ticketWindow2 = new TestTicketWindow("二号机");
        ticketWindow2.start();
        TestTicketWindow ticketWindow3 = new TestTicketWindow("三号机");
        ticketWindow3.start();
        TestTicketWindow ticketWindow4 = new TestTicketWindow("四号机");
        ticketWindow4.start();

        //错误每一个tickWindow出的号码都是从1到50
        /*
            because:每一个线程的逻辑执行单元都不一样，我们新建了四个Ticket Window线程，它们的票号都是从0开始到50结束
        */

        



    }
}
