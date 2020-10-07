package org.damo;

public class MarsRover {

    Heading currentHeading = Heading.NORTH;

    public MarsRover(Heading initialHeading) {
        this.currentHeading = initialHeading;
    }

    public Heading getHeading() {
        return currentHeading;
    }
}
