package com.issuer;

import software.amazon.awscdk.App;
import software.amazon.awscdk.StackProps;

public class InfraApp {
    public static void main(final String[] args) {
        App app = new App();

        new InfraStack(app, "LambdaStack", StackProps.builder()
                .build());

        app.synth();
    }
}

