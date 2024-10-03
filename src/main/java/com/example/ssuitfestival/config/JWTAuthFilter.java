package com.example.ssuitfestival.config;

import com.example.ssuitfestival.service.TableService;
import com.example.ssuitfestival.service.dto.TableValidateParamDto;
import com.example.ssuitfestival.service.dto.TableValidateReturnDto;
import com.example.ssuitfestival.util.HTTPRequestUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
@Slf4j
public class JWTAuthFilter extends OncePerRequestFilter {
    private final TableService tableService;
    private final HTTPRequestUtil httpRequestUtil;

    @Override
    protected void doFilterInternal(@NotNull HttpServletRequest request,
                                    @NotNull HttpServletResponse response,
                                    @NotNull FilterChain filterChain) throws IOException, ServletException {
        try {
            Optional<String> accessToken = httpRequestUtil.getAccessToken(request);
            if (accessToken.isEmpty()) {
                throw new Exception("No access token provided.");
            }

            TableValidateParamDto tableValidateParamDto = TableValidateParamDto.builder()
                    .accessToken(accessToken.get())
                    .build();
            TableValidateReturnDto tableValidateReturnDto = tableService.tableValidate(tableValidateParamDto);

            Authentication authentication = new UsernamePasswordAuthenticationToken(tableValidateReturnDto.getTableSession(), "", List.of());
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (Exception e) {
            log.debug(e.getMessage(), e);
            SecurityContextHolder.getContext().setAuthentication(null);
        }
        filterChain.doFilter(request, response);

    }
}
