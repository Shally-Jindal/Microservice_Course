package com.eazybytes.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
// record is java class, which accept the parameters and make them final and have only getters, no setters
    // here we used record bcz we dont want to change parameters value at runtime
}
