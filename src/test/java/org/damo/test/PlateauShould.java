package org.damo.test;

import org.damo.Plateau;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class PlateauShould {
    @Test
    public void BeInitialisedFromSpring(){
        ApplicationContext rootctx
                = new ClassPathXmlApplicationContext(
                "plateauSpringContext.xml");
        Plateau testPlateau = (Plateau) rootctx.getBean("testPlateau1");

        assertThat(testPlateau.getPlateauName()).isEqualTo("Arcadia Planitia");

    }
}
