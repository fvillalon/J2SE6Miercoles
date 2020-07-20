package edu.educacionit;

import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest(classes={Date.class})
class JavaLmApplicationTests {

	@Test
	void testearPiedraPapelTijeraEmpate() {
            // A de arrange
            Integer j1 = LogicaPPT.Piedra;
            Integer j2 = LogicaPPT.Piedra;
            
            // A de act
            Integer resultado = LogicaPPT.jugar(j1, j2);
            
            // A de assert
            Assert.isTrue(resultado == LogicaPPT.Empate, "Guarda que no es empate");
	}
        
}
