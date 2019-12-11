package helloworld.lambda.function;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface HelloworldLambdaFunctionClient {

    @Named("helloworld-lambda-function")
    Single<HelloworldLambdaFunctionResponse> apply(@Body HelloworldLambdaFunctionRequest body);

}
