package G2T6.G2T6.G2T6.options;

import java.util.List;

import javax.validation.Valid;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

public class OptionController {
    private OptionService optionService;

    public OptionController(OptionService qs){
        this.optionService = qs;
    }

    @GetMapping("/options")
    public List<Option> getOption() {
        return optionService.listOptions();
    }

    @GetMapping("/options/{id}")
    public Option getOption(@PathVariable Long id) {
        Option question = optionService.getOption(id);

        if(question == null) throw new OptionNotFoundException(id);
        return optionService.getOption(id);
    }
}
