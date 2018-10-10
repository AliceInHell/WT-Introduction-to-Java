package by.bsuir.makarchik.task2.Localizer;

import by.bsuir.makarchik.task2.Point.Point;

public class Localizer {
    public static boolean locate(Point point){
        if(point.getY() >= 0 && point.getY() <= 5){
            if(point.getX() >= -4 && point.getX() <= 4)
                return true;
            else
                return false;
        }
        else
            if(point.getY() >= -3 && point.getY() <= 0)
                if(point.getX() >= -6 && point.getX() <= 6)
                    return true;
                else
                    return false;
             else
                 return false;
    }
}
