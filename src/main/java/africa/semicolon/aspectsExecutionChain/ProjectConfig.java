package africa.semicolon.aspectsExecutionChain;

import africa.semicolon.aspectsExecutionChain.servicesImpl.CommentServiceImple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackageClasses = {CommentServiceImple.class})
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggingAspects loggingAspects(){
        return new LoggingAspects();
    }

    @Bean
    public SecurityAspects securityAspects(){
        return new SecurityAspects();
    }
}
