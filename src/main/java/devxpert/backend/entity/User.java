package devxpert.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false, unique = true, name = "github_id")
    private Long githubId;
    @Column(nullable = false , name = "github_username", length = 100)
    private String githubUsername;
    @Column(nullable = false, name = "display_name", length = 200)
    private String displayName;
    @Column(name = "avatar_url")
    private String avatarUrl;
    @Column(name = "access_token", nullable = false, columnDefinition = "TEXT")
    private String accessToken;
    @Column(name = "token_scopes")
    private String tokenScopes;
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @PrePersist
    void onCreate(){
        if(createdAt == null){
            createdAt = Instant.now();
        }
    }
}
