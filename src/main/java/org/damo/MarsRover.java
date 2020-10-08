package org.damo;

import org.damo.interfaces.IPlateau;

import java.awt.Point;

public class MarsRover {

    Heading currentHeading = Heading.NORTH;
    Point currentPosition;
    IPlateau plateau;


    public MarsRover(IPlateau plateau, Heading initialHeading, Point initialPosition) {
        this.plateau = plateau;
        this.currentHeading = initialHeading;
        this.currentPosition = initialPosition;
    }

    public Heading getHeading() {
        return currentHeading;
    }

    public String getPlateauName() {
        if(plateau != null)
            return plateau.getPlateauName();

        return "dunno";
    }

    public Point getPosition(){
        return currentPosition.getLocation();
    }

    public int getPositionX() {
        return (int) currentPosition.getX();
    }

    public int getPositionY() {
        return (int) currentPosition.getY();
    }
}
