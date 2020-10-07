package org.damo;

import org.damo.interfaces.IPlateau;

public class Plateau  implements IPlateau {

    String plateauName = "";
    int plateauWidth = 0;
    int plateauLength = 0;

    public Plateau() {

    }

    public Plateau(String plateauName) {
        this.plateauName = plateauName;
    }

    public Plateau(int plateauWidth, int plateauLength){
        this.plateauWidth = plateauWidth;
        this.plateauLength = plateauLength;
    }

    public Plateau(String plateauName, int plateauWidth, int plateauLength){

        this.plateauName = plateauName;
        this.plateauWidth = plateauWidth;
        this.plateauLength = plateauLength;
    }

    public String getPlateauName(){
        return this.plateauName;
    }
}
