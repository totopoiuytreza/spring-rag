package fr.efrei.springrag.service;

import fr.efrei.springrag.domain.Document;
import fr.efrei.springrag.repository.DocumentRepository;
import fr.efrei.springrag.web.dto.DocumentDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {
    private final Logger log = LoggerFactory.getLogger(DocumentService.class);
    private final DocumentRepository documentRepository;
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }
    public Document buildAndSave(Document document) {
        log.debug("Request to save Document : {}", document);
        return documentRepository.save(document);
    }
    public List<Document> findAll() {
        log.debug("Request to find all Documents");
        return documentRepository.findAll();
    }
    public List<DocumentDto> findAllDTO() {
        log.debug("Request to find all Documents DTO");
        return documentRepository.findAllDocumentsDTO();
    }
    public Optional<Document> findById(Long id) {
        log.debug("Request to get Document : {}", id);
        return documentRepository.findById(id);
    }
}
