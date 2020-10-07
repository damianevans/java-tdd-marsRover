package org.damo.test;

import org.damo.Heading;
import org.damo.MarsRover;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverShould {

    @ParameterizedTest
    @CsvSource({"north,NORTH","east,EAST","west,WEST"})
    public void ReturnCurrentHeading(String input, String expected) {
        Heading inputHeading = Enum.valueOf(Heading.class,  input.toUpperCase());
        Heading expectedHeading = Enum.valueOf(Heading.class, expected.toUpperCase());
        MarsRover curiosity = new MarsRover(inputHeading);
        Heading heading = curiosity.getHeading();
        assertThat(heading).isEqualTo(expectedHeading);
    }
}
