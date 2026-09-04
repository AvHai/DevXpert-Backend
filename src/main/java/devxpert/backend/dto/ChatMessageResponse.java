package devxpert.backend.dto;

import devxpert.backend.entity.MessageRole;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public record ChatMessageResponse(
        UUID uuid,
        MessageRole role,
        String content,
        List<CitationDto> citations,
        Instant createdAt
) {
}
