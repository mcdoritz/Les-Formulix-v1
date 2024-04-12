package fr.lesformulix.config;

import fr.lesformulix.services.UserLoginService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static fr.lesformulix.utils.DebugUtil.prln;

@Configuration
public class Security {

    @Bean
    public UserLoginService userDetailsService() {
        return new UserLoginService();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> {
                    //auth.requestMatchers( "/", "/loginSignup", "/signup", "/login", "/app", "/login-error", "/img/*", "/css/*", "/js/*", "/js/app/*").permitAll();
                    //auth.requestMatchers("/appede").authenticated();
                    auth.requestMatchers("/**").permitAll();
                    auth.anyRequest().authenticated();
                })
                .formLogin(
                        form -> form
                                .loginPage("/loginSignup")
                                .loginProcessingUrl("/login")
                                .usernameParameter("username")
                                .passwordParameter("password")
                                .defaultSuccessUrl("/app", true)
                                .failureUrl("/login-error")
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