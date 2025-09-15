package com.anonymous.algacomments.moderation.service.api.controller;

import com.anonymous.algacomments.moderation.service.api.model.ModerationInput;
import com.anonymous.algacomments.moderation.service.api.model.ModerationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/moderate")
@RequiredArgsConstructor
public class ModerationController {

    private final List<String> bannedWords;

    @PostMapping
    public ModerationOutput moderate(@RequestBody ModerationInput moderationInput) {
        boolean containsBannedWords = bannedWords.stream()
                .anyMatch(moderationInput.getText().toLowerCase()::contains);

        if (containsBannedWords) {
            return ModerationOutput.builder()
                    .approved(false)
                    .reason("This commentary is nok!")
                    .build();
        }

        return ModerationOutput.builder()
                .approved(true)
                .reason("This commentary is ok!")
                .build();
    }
}
