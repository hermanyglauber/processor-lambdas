package com.issuer;

import software.amazon.awscdk.Duration;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class InfraStack extends Stack {
    public InfraStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public InfraStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        Function.Builder.create(this, "hello-world-lambda")
                .runtime(Runtime.JAVA_11)
                .handler("com.issuer.HelloWorldLambda")
                .memorySize(128)
                .timeout(Duration.seconds(300))
                .functionName("hello-world-lambda")
                .code(Code.fromAsset("../assets/original-functions.jar"))
                .build();
    }
}
