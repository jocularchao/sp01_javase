package c01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/2 20:59
 * @Description 商品类
 */
public class Class06Goods {
    private int id;         //商品编号
    private String name;    //名称
    private double price;   //价格
    private int buyNumber;  //购买数量

    public Class06Goods() {
    }

    public Class06Goods(int id, String name, double price, int buyNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.buyNumber = buyNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }
}
