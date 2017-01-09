package src.main.ru.nikiforov;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* cout ("hello")
* @author nikiforov
* @since 21.12.2016
* @version 1.0
*/

public class CalculateTest{

	@Test
	public void whenSet10and10ReturnSumm20() {
        calculate calc = new Calculate();
        String result = calc.echo(20);
        assertThat(result, is(20));
    }
}


/*      ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(
                out.toString(),
                is(
                    String.format(
                        "Hello world%s",
                        System.getProperty("line.separator")
                    )
                )
        );*/