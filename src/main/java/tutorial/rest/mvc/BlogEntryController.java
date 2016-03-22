package tutorial.rest.mvc;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tutorial.core.entities.BlogEntry;
import tutorial.core.services.BlogEntryService;
import tutorial.rest.resources.BlogEntryResource;
import tutorial.rest.resources.asm.BlogEntryResourceAsm;

@Controller
public class BlogEntryController {

    private BlogEntryService blogEntryService;

    public BlogEntryController(BlogEntryService blogEntryService){
        this.blogEntryService = blogEntryService;
    }

    @RequestMapping(value = "/rest/blog-entries/{blogEntryId}", method = RequestMethod.GET)
    public ResponseEntity <BlogEntryResource> getBlogEntry(
        @PathVariable Long blogEntryId){
        BlogEntry blogEntry = blogEntryService.find(blogEntryId);
        BlogEntryResource blogEntryResource = new BlogEntryResourceAsm().toResource(blogEntry);
        return new ResponseEntity<BlogEntryResource>(blogEntryResource, HttpStatus.OK);
    }
}