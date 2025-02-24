package africa.semicolon;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution (* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{

        //get the name and parameters of the intercepted method
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        //Log the name and parameters of the intercepted method
        logger.info("Method name: " + methodName + " with parameters: " + Arrays.asList(arguments) + " will execute");

        //Call the intercepted method
        Object returnByMethod = joinPoint.proceed();

        logger.info("Method executed and returned: " + returnByMethod);

        return returnByMethod;

    }
}
