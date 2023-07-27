package org.arteaga.junit5app.ejemplos.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    @Test
    void testNombreCuenta(){
        Cuenta cuenta = new Cuenta("Alisson", new BigDecimal(1000.12345));
        //cuenta.setPersona("Alisson");
        String esperado = "Alisson";
        String real = cuenta.getPersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("Alisson"));
    }

    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
    }
}