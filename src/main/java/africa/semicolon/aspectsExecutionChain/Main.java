package africa.semicolon.aspectsExecutionChain;

import africa.semicolon.Comment;
import africa.semicolon.aspectsExecutionChain.servicesImpl.CommentServiceImple;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentServiceImple.class);

        Comment comment = new Comment();
        comment.setText("Aspect Oriented Programming Comment Demo");
        comment.setAuthor("Abimbola");

        String value = service.publishComment(comment);
        logger.info(value);
    }
}