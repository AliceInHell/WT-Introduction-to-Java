package by.bsuir.makarchik.task9.Basket;

import by.bsuir.makarchik.task9.Ball.Ball;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> _balls;

    public Basket(){
        _balls = new ArrayList<Ball>();
    }

    public void addBall(Ball value){
        _balls.add(value);
    }

    public double getWeight(){
        double weight = 0;
        for(Ball ball : _balls){
            weight += ball.getWeight();
        }

        return weight;
    }

    public int getBlueBallsCount(){
        int count = 0;
        for(Ball ball : _balls){
            if(ball.getColor() == "blue")
                count += 1;
        }
        return count;
    }
}
