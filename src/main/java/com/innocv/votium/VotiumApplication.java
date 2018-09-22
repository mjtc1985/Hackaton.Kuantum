package com.innocv.votium;

import com.ccl.architecture.jdbc.EnableJdbcRepositories;
import com.ccl.architecture.security.ldap.annotations.EnableLdapSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@EnableJdbcRepositories
@EnableLdapSecurity
public class VotiumApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VotiumApplication.class, args);
    }
}
