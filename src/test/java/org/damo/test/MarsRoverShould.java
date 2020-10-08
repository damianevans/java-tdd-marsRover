package org.damo.test;

import org.damo.Heading;
import org.damo.MarsRover;
import org.damo.Plateau;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverShould {

    @ParameterizedTest
    @CsvSource({"north,NORTH","east,EAST","west,WEST"})
    public void ReturnCurrentHeading(String input, String expected) {
        Heading inputHeading = Enum.valueOf(Heading.class,  input.toUpperCase());
        Heading expectedHeading = Enum.valueOf(Heading.class, expected.toUpperCase());
        MarsRover curiosity = new MarsRover(null, inputHeading, null);
        Heading heading = curiosity.getHeading();
        assertThat(heading).isEqualTo(expectedHeading);
    }

    @Test
    public void BeInstanciatedFromSpringWithExpectedConfiguration(){
        Heading expectedHeading = Heading.EAST;
        String expextedPlateauName = "Arcadia Planitia";
        int expectedPositionHashcode = new Point(2,1).hashCode();

        ApplicationContext rootctx
                = new ClassPathXmlApplicationContext(
                "roverContext.xml");
        MarsRover opportunity = (MarsRover) rootctx.getBean("InjectwithConstructor");

        assertThat(opportunity).isNotNull();
        assertThat(opportunity.getHeading()).isEqualTo(expectedHeading);
        assertThat(opportunity.getPlateauName()).isEqualTo(expextedPlateauName);
        assertThat(opportunity.getPositionX()).isEqualTo(2);
        assertThat(opportunity.getPositionY()).isEqualTo(1);
        assertThat(opportunity.getPosition().hashCode()).isEqualTo(expectedPositionHashcode);
        //assertThat(opportunity.getPlateauName()).isNotEqualTo("dunno");


    }
}
