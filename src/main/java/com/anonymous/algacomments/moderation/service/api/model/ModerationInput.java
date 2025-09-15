package com.anonymous.algacomments.moderation.service.api.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ModerationInput {
    private UUID commentId;
    private String text;
}
