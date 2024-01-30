package jcs3;

import javax.swing.*;
import java.awt.*;

/**
 * @author jocularchao
 * @date 2024-01-10 20:40
 * @description 弹力球游戏ElasticBallGame
 */

/**
 * 游戏场景
 */
public class ElasticBallGame{
    //固定尺寸
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    int source = 0;  //积分打掉砖块 积分
    private ElasticBall ball; // 游戏中的球
    private CollisionPlate paddle; // 游戏中的撞球板

}

/**
 * 弹力球
 */
class ElasticBall {

    private DrawingBoard circle;    //画板画球
    private double xSpeed;  //球在x轴上的速度
    private double ySpeed;  //球在y轴上的速度

    /**
     *
     * @param radius    球的半径
     * @param color 球颜色
     * @param x 球的初始坐标
     * @param y 球的初始坐标
     * @param xSpeed    球的初始速度
     * @param ySpeed    球的初始速度
     */
    public ElasticBall(double radius, Color color, double x, double y, double xSpeed, double ySpeed) {
        this.circle = new DrawingBoard(radius,color);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        //自定义初始坐标
        this.circle.relocate(x,y);
    }

    //球移动
    /**
     * 将球移动一步，根据速度更新球的位置
     */
    public void move() {
        // 球的移动逻辑


        // 碰撞检测和处理


        // 碰撞音效处理

        //

    }



    //检查球是否与边界或其他物体发生碰撞
    public void ballCheckCollision() {
        //与墙体碰撞，x y 发生变化


        //左右侧墙体 x就会反转

        //上面墙体 y反转

        //下面与撞球板碰撞y反转

    }
}

class Wall {

}

/**
 * 撞板
 * 用来接弹力球使其不被落在地面
 */
class CollisionPlate{
    private DrawingBoard paddle;
    private double paddleX;


    /**
     *
     * @param paddleHeight  撞板高度
     * @param paddleWidth   撞板宽度
     * @param paddleColor   撞板颜色
     * @param paddleX   撞板x坐标
     * @param paddleY   撞板y坐标
     */
    public CollisionPlate(double paddleHeight, double paddleWidth, Color paddleColor, double paddleX, double paddleY) {

        this.paddle = new DrawingBoard(paddleWidth,paddleHeight,paddleColor);
        this.paddleX = paddleX;
        //y是固定值 撞板只在水平活动
        this.paddle.relocate(paddleX,paddleY);
    }

    //鼠标事件 移动撞板
    public void moveTo(double mouseX) {
        paddleX = mouseX - paddle.getWidth() / 2; // 将板的 x 坐标设置为鼠标位置减去板宽度的一半，以使板居中
        paddle.relocate(paddleX, paddle.getHeight()); // 重新定位板
    }




}

//画板
class DrawingBoard{

    private double width;
    private double height;
    private Color color;

    private double radius;

    /**
     * 绘制球
     * @param radius 球半径
     * @param color 球颜色
     */
    public DrawingBoard(double radius,Color color){
        this.radius = radius;
        this.color = color;
    }
    /**
     * 绘制方块
     * @param width 宽度
     * @param height 高度
     * @param color 颜色
     */
    public DrawingBoard(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //固定目标位置
    public void relocate(double x, double y){

    }

    public double getWidth() {
        return width;
    }



    public double getHeight() {
        return height;
    }


    public Color getColor() {
        return color;
    }

}
