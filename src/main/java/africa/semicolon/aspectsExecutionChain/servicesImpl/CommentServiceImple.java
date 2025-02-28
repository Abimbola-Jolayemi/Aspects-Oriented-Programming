package africa.semicolon.aspectsExecutionChain.servicesImpl;

import africa.semicolon.Comment;
import africa.semicolon.aspectsExecutionChain.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentServiceImple {

    private Logger logger = Logger.getLogger(CommentServiceImple.class.getName());

    @ToLog
    public String publishComment(Comment comment){
        logger.info("Publishing comments: " + comment.getText());
        return "SUCCESS";
    }
}
