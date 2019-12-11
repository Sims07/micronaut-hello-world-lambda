package helloworld.lambda.function;

import java.io.Serializable;
import io.micronaut.core.annotation.Introspected;

/**
 * @author djz4712
 */
@Introspected
public class HelloworldLambdaFunctionResponse implements Serializable {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
