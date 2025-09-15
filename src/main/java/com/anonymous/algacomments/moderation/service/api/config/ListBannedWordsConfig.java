package com.anonymous.algacomments.moderation.service.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ListBannedWordsConfig {

    @Bean
    @ConfigurationProperties(prefix = "app")
    public ListBannedWords listBannedWords() {
        return new ListBannedWords();
    }

    @Bean
    public List<String> fixedValues(ListBannedWords props) {
        return List.copyOf(props.getBannedWords());
    }
}
