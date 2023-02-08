package rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(2,4);
    }

    @Test
    void berechneFläche() {
        int umfang= rectangle.berechneUmfang();
        Assertions.assertEquals(12,umfang);
    }

    @Test
    @DisplayName("teste die Berechnung der Fläche")
    void berechneUmfang() {
        int flaeche = rectangle.berechneFlaeche();
        Assertions.assertEquals(8,rectangle.berechneFlaeche());

}}