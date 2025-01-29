package fr.efrei.springrag.web.rest;

import fr.efrei.springrag.SpringragApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(classes = { SpringragApplication.class })
@AutoConfigureMockMvc
public class SampleControllerIT {

    private static final String ENTITY_API_URL = "/samples";

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MockMvc restProjectMockMvc;

    @Test
    public void sampleTest() throws Exception {
        String value = "EFREI";
        restProjectMockMvc
                .perform(get(ENTITY_API_URL + "/"+value))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"))
                .andExpect(content().string("Hello " + value + "!"));

    }

    @Test
    public void sampleJsomTest() throws Exception {
        String value = "EFREI";
        restProjectMockMvc
                .perform(get(ENTITY_API_URL + "/dto/"+value))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.value").value("Hello "+value+"!"));

    }
}