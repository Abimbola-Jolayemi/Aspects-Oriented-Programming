package africa.semicolon.annotatedMethods.services;

import africa.semicolon.Comment;
import africa.semicolon.annotatedMethods.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentServices {
    private Logger logger = Logger.getLogger(CommentServices.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment comment){
        logger.info("Editing comment: " + comment.getText());
    }
}
