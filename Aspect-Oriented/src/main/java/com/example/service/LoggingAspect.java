package com.example.service;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.service.UserService.getUser(..))")
    public void logBeforeMethod() {
        System.out.println("Logging: Method getUser() is about to be called.");
    }


    // Before Advice - Executes before the method
    @Before("execution(* com.example.service.UserService.getUser(..))")
    public void beforeAdvice() {
        System.out.println("Before Advice: Method getUser() is about to be executed.");
    }

    // After Advice - Executes after the method (regardless of success or failure)
    @After("execution(* com.example.service.UserService.getUser(..))")
    public void afterAdvice() {
        System.out.println("After Advice: Method getUser() has executed.");
    }

    // After Returning Advice - Executes only if the method returns successfully
    @AfterReturning(pointcut = "execution(* com.example.service.UserService.getUser(..))", returning = "result")
    public void afterReturningAdvice(String result) {
        System.out.println("After Returning Advice: Method executed successfully. Returned: " + result);
    }

    // After Throwing Advice - Executes if the method throws an exception
    @AfterThrowing(pointcut = "execution(* com.example.service.UserService.getUser(..))", throwing = "ex")
    public void afterThrowingAdvice(Exception ex) {
        System.out.println("After Throwing Advice: Exception occurred - " + ex.getMessage());
    }

    // Around Advice - Executes before and after the method
    @Around("execution(* com.example.service.UserService.getUser(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around Advice: Before executing method...");
        try {
            Object result = joinPoint.proceed();
            System.out.println("Around Advice: After executing method successfully.");
            return result;
        } catch (Exception e) {
            System.out.println("Around Advice: Exception occurred - " + e.getMessage());
            throw e;
        }
    }
}