package com.security.Config;

import org.springframework.context.annotation.Bean;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
public class MySecurityConfig {

    // 🔐 USERS (In-Memory)
    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails admin = User.withUsername("Ankit")
                .password("ankit123")
                .roles("ADMIN")
                .build();

        UserDetails user = User.withUsername("Shreya")
                .password("shreya123")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    // 🔐 SECURITY RULES
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable()) // API ke liye
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/user/**").hasRole("USER")
                        .requestMatchers("/users/**", "/Allusers").permitAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults()); // ✅ Spring Security 6

        return http.build();
    }

    // 🔑 PASSWORD ENCODER (Learning only)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
