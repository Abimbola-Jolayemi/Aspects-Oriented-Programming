package africa.semicolon.annotatedMethods;

import africa.semicolon.LoggingAspect;
import africa.semicolon.annotatedMethods.services.CommentServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackageClasses = {CommentServices.class})
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public africa.semicolon.LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }
}
