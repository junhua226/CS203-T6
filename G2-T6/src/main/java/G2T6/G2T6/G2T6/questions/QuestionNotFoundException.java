package G2T6.G2T6.G2T6.questions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class QuestionNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public QuestionNotFoundException(Long id) {
        super("Could not find question " + id);
    }
}