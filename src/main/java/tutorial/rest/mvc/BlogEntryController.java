package tutorial.rest.mvc;

import org.springframework.stereotype.Controller;
import tutorial.core.services.BlogEntryService;

@Controller
public class BlogEntryController {

    private BlogEntryService blogEntryService;

    public BlogEntryController(BlogEntryService blogEntryService){
        this.blogEntryService = blogEntryService;
    }
}