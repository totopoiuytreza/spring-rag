package fr.efrei.springrag.web.controller;

import fr.efrei.springrag.service.AssistanceAiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class AssistantController {

    private final Logger log = LoggerFactory.getLogger(AssistantController.class);

    private final AssistanceAiService assistanceAiService;

    public AssistantController(AssistanceAiService assistanceAiService) {
        this.assistanceAiService = assistanceAiService;
    }

    @PostMapping("/assistant/chat")
    public String chat(@RequestBody String query) {
        log.info("REST request to chat with assistant : {}", query);
        return assistanceAiService.chat(query);
    }
}

