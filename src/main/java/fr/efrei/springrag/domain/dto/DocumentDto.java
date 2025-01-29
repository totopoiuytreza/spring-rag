package fr.efrei.springrag.domain.dto;

/**
 * A DTO representing a document's metadata.
 * The content is not included to limit the load of the response.
 */
public record DocumentDto(Long id, String title, String description, String author, String publisher, String publishedDate, String contentType) {
}
