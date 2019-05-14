package com.kristogodari.tutorials.aop;

import com.kristogodari.tutorials.Result;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogRequestResponse {

    @Before("@annotation(com.kristogodari.tutorials.aop.annotation.LogRequest)")
    public void logRequest(JoinPoint joinPoint) {
        System.out.println(
                String.format(
                        "Entering the method %s, with arguments %s.",
                        joinPoint.getSignature().getName(),
                        joinPoint.getArgs().toString()
                )
        );
    }


    @AfterReturning(
        pointcut = "@annotation(com.kristogodari.tutorials.aop.annotation.LogResponse)",
        returning = "retVal"
    )
    public void logResponse(JoinPoint joinPoint, Object retVal) {

        Result<Object> result =  (Result<Object>) retVal;
        result.getException();

        System.out.println("Method Signature: " + joinPoint.getSignature());
        System.out.println("Returning:" + retVal.toString());
    }
}

