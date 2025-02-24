package africa.semicolon;

import africa.semicolon.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Aspect Oriented Programming Comment Demo");
        comment.setAuthor("Abimbola");

        String value = service.publishComment(comment);
        logger.info(value);
    }
}