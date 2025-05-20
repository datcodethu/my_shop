package com.datcoder.my_shop.entity.auth;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "accounts",
        indexes = {
                @Index(name = "idx_accounts_email", columnList = "email"),
                @Index(name = "idx_accounts_username", columnList = "username")
        })
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "username", nullable = false, unique = true)
    String username;
    @Column(name = "password",nullable = false)
    String password;
    @Column(name = "email", nullable = false, unique = true)
    String email;
    @Column(name = "avatar", columnDefinition = "VARCHAR(255) DEFAULT 'https://dongvat.edu.vn/upload/2025/01/ronaldo-meme-29.webp'")
    String avatar;
    @Column(name = "is_active", nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
    boolean isActive;
    @Column(name = "disable_account", columnDefinition = "BOOLEAN DEFAULT FALSE")
    boolean disableAccount;
    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    LocalDateTime updatedAt;
}
