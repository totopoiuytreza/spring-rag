package fr.efrei.springrag.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AssistanceAiService {

    @SystemMessage(fromResource = "/prompts/system.st")
    String chat(String userMessage);

}

