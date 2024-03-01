package com.issuer;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class HelloWorldLambda implements RequestHandler<Object, String>
{
    @Override
    public String handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input);
        return input.toString();
    }
}
