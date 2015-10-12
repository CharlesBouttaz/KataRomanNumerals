package roman;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class RomanConverterTest {

    @Test
    @Parameters({
            "0, ",
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "11, XI",
            "20, XX",
            "40, XL",
            "50, L",
            "846, DCCCXLVI",
            "1999, MCMXCIX",
            "2008, MMVIII"
    })
    public void shouldConvertToRomanNumber(int arabicNb, String res) throws Exception {
        RomanConverter romanConverter = new RomanConverter();
        Assertions.assertThat(romanConverter.convert(arabicNb)).isEqualTo(res);
    }
}