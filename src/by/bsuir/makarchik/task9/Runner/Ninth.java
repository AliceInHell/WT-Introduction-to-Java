package by.bsuir.makarchik.task9.Runner;

import by.bsuir.makarchik.task9.Basket.Basket;
import by.bsuir.makarchik.task9.Ball.Ball;

public class Ninth {
    public static void main(String[] args){
        Basket newBasket = new Basket();
        newBasket.addBall(new Ball("blue", 5));
        newBasket.addBall(new Ball("red", 10));
        newBasket.addBall(new Ball("black", 7));
        newBasket.addBall(new Ball("yellow", 5.5));
        newBasket.addBall(new Ball("blue", 27.3));

        System.out.print("Balls weight = " + newBasket.getWeight() + "\n");
        System.out.print("Blue balls count = " + newBasket.getBlueBallsCount());
    }
}
