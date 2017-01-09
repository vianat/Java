package src.main.ru.nikiforov;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class HelloWorldTest {

	@Test
    public void whenRunHelloWorldThenPrintToOut() {
    	ByteArrayOutputStream out = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(out));
    	HelloWorld.main(null);
    	assertThat(out.toString()), is("Hello World")
    }
}