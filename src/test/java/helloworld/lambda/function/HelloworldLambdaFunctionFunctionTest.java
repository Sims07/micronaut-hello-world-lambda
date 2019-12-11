package helloworld.lambda.function;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class HelloworldLambdaFunctionFunctionTest {

    @Inject
    HelloworldLambdaFunctionClient client;

    @Test
    public void testFunction() throws Exception {
    	HelloworldLambdaFunctionRequest body = new HelloworldLambdaFunctionRequest();
    	body.setName("helloworld-lambda-function");
        assertEquals("Hello helloworld-lambda-function", client.apply(body).blockingGet().getMessage());
    }
}
