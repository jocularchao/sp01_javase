package top.jocularchao.a03api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 16:40
 * @description:
 */
public class D06QueryTask extends Thread implements D06Query{

    private final String origin;

    private final String destination;

    private final List<String> flightList = new ArrayList<>();

    public D06QueryTask(String airline,String origin, String destination) {
        super("["+airline+"]");
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void run() {
        System.out.printf("%s-query from %s to %s \n", getName(), origin, destination);
        int randomVal = ThreadLocalRandom.current().nextInt(10);

        try {
            TimeUnit.SECONDS.sleep(randomVal);
            this.flightList.add(getName()+"-"+randomVal);
            System.out.printf("The Fight:%s list query successful\n",getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> get() {
        return this.flightList;
    }
}
