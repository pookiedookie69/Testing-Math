import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @ParameterizedTest
    @CsvSource({
            "6, 5",
            "1.5, 3.7",
            "-3.4, -5.2",
            "-2, -4",
            "5, -6",
            "3.5, -4.3",
            "-4, 6",
            "-6.4, 5.98",
            "0, 0",
            "0, -1.4",
            "0, -4",
            "0, 1.4",
            "0, 4",
            "1, 0",
            "1, -1.4",
            "1, -4",
            "1, 1.4",
            "1, 4",
            "-1, 0",
            "-1, -1.4",
            "-1, -4",
            "-1, 1.4",
            "-1, 4",
            "0, 1",
            "-1.4, 1",
            "-4, 1",
            "1.4, 1",
            "4, 1"
    })
    public void testReciprocal(double base, double exponent) {
        double eqLeft = 1/(Math.pow(base,exponent));
        exponent *= -1;
        double eqRight = Math.pow(base,exponent);
        assertEquals(eqLeft,eqRight,"negative to fraction");


    }

    @ParameterizedTest
    @CsvSource({
            "6, 5, 17",
            "5, 2, -3",
            "3, -3, -4",
            "-7, 2, 4",
            "-4, -5, 2",
            "-7, -8, -9",
            "6.3, 5.5, 17.3",
            "5.25, 2.4, -3.2",
            "3.4, -3.3, -4.2",
            "-7.5, 2.2, 4.6",
            "-4.3, -5.2, 2.1",
            "-7.4, -8.3, -9.2"
    })
    public void testMultiplying(double base, double a, double b) {
        double eqLeft = (Math.pow(base,a)) * (Math.pow(base,b));
        double eqRight = Math.pow(base,a+b);
        assertEquals(eqLeft,eqRight,"adding exponents");
    }

    @ParameterizedTest
    @CsvSource({
            "6, 5, 17",
            "5, 2, -3",
            "3, -3, -4",
            "-7, 2, 4",
            "-4, -5, 2",
            "-7, -8, -9",
            "6.3, 5.5, 17.3",
            "5.25, 2.4, -3.2",
            "3.4, -3.3, -4.2",
            "-7.5, 2.2, 4.6",
            "-4.3, -5.2, 2.1",
            "-7.4, -8.3, -9.2"
    })
    public void testDividing(double base, double a, double b) {
        double eqLeft = (Math.pow(base,a)) / (Math.pow(base,b));
        double eqRight = Math.pow(base,a-b);
        assertEquals(eqLeft,eqRight,"subtracting exponents");
    }

    @ParameterizedTest
    @CsvSource({
            "6, 5, 17",
            "5, 2, -3",
            "3, -3, -4",
            "-7, 2, 4",
            "-4, -5, 2",
            "-7, -8, -9",
            "6.3, 5.5, 17.3",
            "5.25, 2.4, -3.2",
            "3.4, -3.3, -4.2",
            "-7.5, 2.2, 4.6",
            "-4.3, -5.2, 2.1",
            "-7.4, -8.3, -9.2"
    })
    public void testNestedPowers(double base, double a, double b) {
        double eqLeft = Math.pow(Math.pow(base,a),b);
        double eqRight = Math.pow(base,a*b);
        assertEquals(eqLeft,eqRight,"multiplying exponents");

    }


    @ParameterizedTest
    @ValueSource(doubles = {1, 5.0, 3.7, -1, -4.0, -4.9})
    public void testZeroPower(double base) {
        double eqLeft = (Math.pow(base,0));
        double eqRight = 1;
        assertEquals(eqLeft,eqRight,"power of 0");
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 5.0, 3.7, -1, -4.0, -4.9})
    public void testOnePower(double base) {
        double eqLeft = (Math.pow(base,1));
        double eqRight = base;
        assertEquals(eqLeft,eqRight,"power of 1");
    }







}
