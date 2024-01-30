package c01create;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/2 20:59
 * @Description 购物车实现类
 */
public class Class06ShopCarTest {
    public static void main(String[] args) {
        boolean isrun=true;
        //1  定义商品类  2初始化对象数组
        Class06Goods[] shopCar = new Class06Goods[100];

        //3 搭建操作建构
        System.out.println("您可以输入的命令:");
        System.out.println("添加商品到购物车：add");
        System.out.println("修改商品数量：update");
        System.out.println("查询商品：query");
        System.out.println("结算购买商品的金额：pay");
        Scanner sc = new Scanner(System.in);

        OUT:while (isrun){
            System.out.println("请输入命令");

            String command = sc.next();
            switch (command) {
                case "add":
                    //添加商品到购物车
                    addGoods(shopCar,sc);
                    break;
                case "update":
                    //修改商品数量
                    updateGoods(shopCar,sc);
                    break;
                case "query":
                    //查询商品
                    queryGoods(shopCar);
                    break;
                case "pay":
                    //结算购买商品的金额
                    pay(shopCar);
                    break;
                case "exit":
                    break OUT;
                default:
                    System.out.println("输入错误");
                    break;


            }
        }
    }

    /**
     * 结算购买商品的金额
     * @param shopCar
     */
    private static void pay(Class06Goods[] shopCar) {
        double sum = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Class06Goods g = shopCar[i];
            if (shopCar[i]!=null){
                sum+=(g.getPrice()*g.getBuyNumber());
            }else{
                continue;
            }
        }
        queryGoods(shopCar);
        System.out.println("商品结算中金额为:"+sum);
    }

    /**
     * 查询购物车商品对象信息并展示出来
     * @param shopCar
     */
    private static void queryGoods(Class06Goods[] shopCar) {
        System.out.println("查询购物车信息如下");
        System.out.println("编号\t名称\t\t\t价格\t\t\t购买数量");
        //shopCar[g1,g2,g3,null,null]
        for (int i = 0; i < shopCar.length; i++) {
            Class06Goods g=shopCar[i];
            if (shopCar[i]!=null){
                //展示商品对象
                System.out.println(g.getId()+"\t\t"+g.getName()+"\t\t\t\t"+g.getPrice()+"\t\t\t"+g.getBuyNumber());
            }else{
                //遍历结束
                break;
            }
        }
    }

    /**
     * 修改商品数量
     * @param shopCar
     * @param sc
     */
    private static void updateGoods(Class06Goods[] shopCar, Scanner sc) {
        //输入要修改商品的id，根据id对商品进行修改
        System.out.println("请输入要修改的商品编号：");

        int id = sc.nextInt();
        Class06Goods g = getGoodsById(shopCar, id);
        if (g==null){
            System.out.println("没有该商品");
        }else{
            System.out.println("请你输入"+g.getName()+"的最新数量");
            int buyNumber = sc.nextInt();
            g.setBuyNumber(buyNumber);
            System.out.println("修改完成！");
            queryGoods(shopCar);

        }
    }

    /**
     * 添加商品到购物车
     * @param shopCar
     * @param sc
     */
    private static void addGoods(Class06Goods[] shopCar, Scanner sc) {
        //录入要添加的商品信息
        System.out.println("请输入商品编号：");
        int id = sc.nextInt();
        System.out.println("请输入商品名称");
        String name = sc.next();
        System.out.println("请输入商品价格");
        double price = sc.nextDouble();
        System.out.println("请输入商品数量");
        int buyNumber = sc.nextInt();

        //把这些信息封装到商品对象上
        Class06Goods g = new Class06Goods();
        g.setId(id);
        g.setName(name);
        g.setPrice(price);
        g.setBuyNumber(buyNumber);

        //把商品对象放入购物车

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i]==null){
                shopCar[i]=g;
                break;
            }
        }
        System.out.println("您的商品："+name+"添加成功");

    }

    /**
     * 根据id找到对应商品
     * @param shopCar
     * @param id
     * @return
     */
    public static Class06Goods getGoodsById(Class06Goods[] shopCar, int id){
        for (int i = 0; i < shopCar.length; i++) {
            Class06Goods g=shopCar[i];
            if (g!=null){

                if (g.getId() == id) {
                    return g;
                }
            }else {
                return null;
            }

        }
        return null;
    }
}
