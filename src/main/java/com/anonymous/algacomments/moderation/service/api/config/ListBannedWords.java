package com.anonymous.algacomments.moderation.service.api.config;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListBannedWords {
    private List<String> bannedWords;
}
