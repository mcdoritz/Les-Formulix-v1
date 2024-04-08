package fr.lesformulix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class Security {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers( "/", "/loginSignup", "/css/*", "/js/*").permitAll();
                    auth.requestMatchers("/app").authenticated();
                    auth.anyRequest().authenticated();
                })
                .formLogin(
                        form -> form
                                .loginPage("/loginSignup")
                                .loginProcessingUrl("/loginSignup")
                                .usernameParameter("username")
                                .defaultSuccessUrl("/app", true)
                                .permitAll()
                )
                .logout(
                        logout -> logout
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                                .permitAll()

                )

        ;
        return http.build();
    }

}
