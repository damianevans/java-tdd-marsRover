package org.damo;

import org.damo.interfaces.IPlateau;

public class MarsRover {

    Heading currentHeading = Heading.NORTH;
    IPlateau plateau;


    public MarsRover(Heading initialHeading) {
        this.currentHeading = initialHeading;
    }

    public MarsRover(IPlateau plateau, Heading initialHeading) {
        this.plateau = plateau;
        this.currentHeading = initialHeading;
    }

    public Heading getHeading() {
        return currentHeading;
    }

    public String getPlateauName() {
        if(plateau != null)
            return plateau.getPlateauName();

        return "dunno";
    }
}
