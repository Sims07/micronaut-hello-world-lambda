package helloworld.lambda.function;

import java.io.Serializable;
import io.micronaut.core.annotation.*;

@Introspected
public class HelloworldLambdaFunctionRequest implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

