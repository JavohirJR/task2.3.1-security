package com.javohir.task2.config;


import com.javohir.task2.enums.Roles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("super-admin").password(passwordEncoder().encode("admin123")).roles(Roles.SUPER_ADMIN.name())
                .and()
                .withUser("moderator").password(passwordEncoder().encode("moderator123")).roles(Roles.MODERATOR.name())
                .and()
                .withUser("operator").password(passwordEncoder().encode("operator123")).roles(Roles.OPERATOR.name());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http

        //        SUPER_ADMIN, MODERATOR va OPERATOR rollari bo’lsin.
        //       ----- SUPER_ADMIN har qanday ishni qila oladi;
        //        MODERATOR mahsulot qo’sha oladi va tahrirlay oladi ,ammo o’chira olmaydi;
        //        OPERATOR buyurtmalar bilan ishlaydi, mahsulotni o'chira olmaydi va tahrirlay olmaydi.

                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/product/**").hasAnyRole(Roles.MODERATOR.name(), Roles.SUPER_ADMIN.name(), Roles.OPERATOR.name())
                .antMatchers(HttpMethod.PATCH, "/api/product/**").hasAnyRole(Roles.MODERATOR.name(), Roles.SUPER_ADMIN.name())
                .antMatchers(HttpMethod.POST, "/api/product/**").hasAnyRole(Roles.MODERATOR.name(), Roles.SUPER_ADMIN.name())
                .antMatchers("/api/order/**").hasAnyRole(Roles.SUPER_ADMIN.name(), Roles.OPERATOR.name())
                .antMatchers("/api/**").hasRole(Roles.SUPER_ADMIN.name())
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
