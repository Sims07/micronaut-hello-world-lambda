package helloworld.lambda.function;

import java.io.IOException;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.micronaut.function.FunctionBean;
import io.micronaut.function.executor.FunctionInitializer;

@FunctionBean("helloworld-lambda-function")
public class HelloworldLambdaFunction extends FunctionInitializer
        implements Function<HelloworldLambdaFunctionRequest, HelloworldLambdaFunctionResponse> {

    private static Logger logger= LoggerFactory.getLogger(HelloworldLambdaFunction.class);

    @Override
    public HelloworldLambdaFunctionResponse apply(HelloworldLambdaFunctionRequest msg) {
        HelloworldLambdaFunctionResponse res = new HelloworldLambdaFunctionResponse();
        res.setMessage("Hello " + msg.getName());
        return res;
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar where the argument to echo is the
     * JSON to be parsed.
     */
    public static void main(String... args) throws IOException {
        logger.info(String.format("Call Lambda with:%s", args.toString()));
        HelloworldLambdaFunction function = new HelloworldLambdaFunction();
        function.run(args, (context) -> function.apply(context.get(HelloworldLambdaFunctionRequest.class)));
    }
}

