package com.pm.stack;
import software.amazon.awscdk.Stack;
public class LocalStack extends Stack{

    public LocalStack(final App score, final String id, final StackProps props){
        super(score, id, props);
    }

}
