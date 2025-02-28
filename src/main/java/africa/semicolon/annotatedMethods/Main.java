package africa.semicolon.annotatedMethods;

import africa.semicolon.AppConfig;
import africa.semicolon.Comment;
import africa.semicolon.annotatedMethods.services.CommentServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var service = context.getBean(CommentServices.class);

        Comment comment = new Comment();
        comment.setText("Aspect Oriented Programming Comment Demo");
        comment.setAuthor("Abimbola");

//        String value = service.deleteComment(comment);
    }
}