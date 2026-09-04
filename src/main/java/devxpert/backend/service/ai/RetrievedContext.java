package devxpert.backend.service.ai;

import java.util.List;

import devxpert.backend.dto.CitationDto;

public record RetrievedContext(
        List<CitationDto> citations,
        String contextText) {
}