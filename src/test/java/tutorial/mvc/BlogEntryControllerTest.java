package tutorial.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Konstantin on 22.03.2016.
 */
public class BlogEntryControllerTest {

    @InjectMocks
    private BlogEntryController blogEntryController;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(blogEntryController).build();
    }

    @Test
    public void test() throws Exception {
//        mockMvc.perform(get("/test")).andDo(print());
        mockMvc.perform(post("/test")
                .content("{\"title\":\"Test Blog Title 2\"}")
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(jsonPath("$.title", is("Test Blog Title 2")))
                .andDo(print());
    }

}

