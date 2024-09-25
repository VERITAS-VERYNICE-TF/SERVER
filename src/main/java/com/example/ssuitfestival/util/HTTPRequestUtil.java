package com.example.ssuitfestival.util;

import jakarta.servlet.http.HttpServletRequest;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class HTTPRequestUtil {

    @NotNull
    public Optional<String> getAccessToken(@NotNull HttpServletRequest request) {
        final String HEADER_KEY = "Authorization";
        final String PREFIX = "Bearer";

        Optional<String> token = Optional.ofNullable(request.getHeader(HEADER_KEY));

        if (token.isPresent() && token.get().startsWith(PREFIX)) {
            return Optional.of(token.get().substring(PREFIX.length()));
        }

        return Optional.empty();
    }
}
