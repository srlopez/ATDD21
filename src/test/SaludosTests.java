
package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import app.*;

 class SaludosTests {
    @Test

	@DisplayName("Saludos nos devuelve hello!")
    void testSaludos() {
        assertEquals("hello!", new Saludos().getSaludo());
    }
}
