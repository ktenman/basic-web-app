package tutorial.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tutorial.entities.BlogEntry;

@Controller
public class BlogEntryController {
    @RequestMapping("/test")
    public ResponseEntity<Object> test() {
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setTitle("Test Blog Entry");
        return new ResponseEntity<Object>(blogEntry, HttpStatus.OK);
    }
}
