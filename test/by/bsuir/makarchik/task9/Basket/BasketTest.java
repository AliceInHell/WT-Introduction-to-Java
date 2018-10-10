package by.bsuir.makarchik.task9.Basket;

import by.bsuir.makarchik.task9.Ball.Ball;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    private Basket _basket;

    @BeforeEach
    void setUpBasket(){
        this._basket = new Basket();
        _basket.addBall(new Ball("red", 14));
        _basket.addBall(new Ball("blue", 13.2));
        _basket.addBall(new Ball("blue", 7.7));
        _basket.addBall(new Ball("yellow", 1.1));
    }

    @Test
    void getWeight() {
        double actual =_basket.getWeight();
        double expected = 36.0;

        assertEquals(expected, actual);
    }

    @Test
    void getBlueBallsCount() {
        int actual = _basket.getBlueBallsCount();
        int expected = 2;

        assertEquals(expected, actual);
    }
}