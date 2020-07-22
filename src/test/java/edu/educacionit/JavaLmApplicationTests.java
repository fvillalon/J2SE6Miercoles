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
        
        @Test
	void testearGanaJugador1_1() {
            // A de act
            Integer resultado = LogicaPPT.jugar(LogicaPPT.Papel, LogicaPPT.Piedra);
            
            // A de assert
            Assert.isTrue(resultado == LogicaPPT.Gana1, "Guarda que Debería haber ganado 1");
        }
        
        @Test
	void testearGanaJugador1_2() {
            // A de act
            Integer resultado = LogicaPPT.jugar(LogicaPPT.Piedra, LogicaPPT.Tijera);
            
            // A de assert
            Assert.isTrue(resultado == LogicaPPT.Gana1, "Guarda que Debería haber ganado 1");
        }
        
        @Test
	void testearGanaJugador1_3() {
            // A de act
            Integer resultado = LogicaPPT.jugar(LogicaPPT.Tijera, LogicaPPT.Papel);
            
            // A de assert
            Assert.isTrue(resultado == LogicaPPT.Gana1, "Guarda que Debería haber ganado 1");
        }
        
        @Test
	void testearGanaJugador2_1() {
            // A de act
            Integer resultado = LogicaPPT.jugar(LogicaPPT.Piedra, LogicaPPT.Papel);
            
            // A de assert
            Assert.isTrue(resultado == LogicaPPT.Gana2, "Guarda que Debería haber ganado 2");
        }
        
        @Test
	void testearGanaJugador2_2() {
            // A de act
            Integer resultado = LogicaPPT.jugar(LogicaPPT.Tijera, LogicaPPT.Piedra);
            
            // A de assert
            Assert.isTrue(resultado == LogicaPPT.Gana2, "Guarda que Debería haber ganado 2");
        }
        
        @Test
	void testearGanaJugador2_3() {
            // A de act
            Integer resultado = LogicaPPT.jugar(LogicaPPT.Papel, LogicaPPT.Tijera);
            
            // A de assert
            Assert.isTrue(resultado == LogicaPPT.Gana2, "Guarda que Debería haber ganado 2");
        }
}
