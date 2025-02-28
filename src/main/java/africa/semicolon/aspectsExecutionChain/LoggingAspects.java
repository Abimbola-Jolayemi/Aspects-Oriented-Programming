package africa.semicolon.aspectsExecutionChain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspects {
    private Logger logger = Logger.getLogger(LoggingAspects.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Logging aspects: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Logging aspect: Method executed and returned " + returnedValue);

        return returnedValue;
    }
}
