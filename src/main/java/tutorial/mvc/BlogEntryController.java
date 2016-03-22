package tutorial.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tutorial.entities.BlogEntry;

@Controller
public class BlogEntryController {
//    @RequestMapping("/test")
//    public ResponseEntity<Object> test() {
//        BlogEntry blogEntry = new BlogEntry();
//        blogEntry.setTitle("Test Blog Entry");
//        return new ResponseEntity<Object>(blogEntry, HttpStatus.OK);
//    }
    @RequestMapping("/test")
    public @ResponseBody BlogEntry test() {
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setTitle("Test Blog Entry");
        return blogEntry;
    }
}
