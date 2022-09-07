package kr.co.springboot.user.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

// WebSecurityConfigurerAdapter 현재는 제한됨
@EnableWebSecurity // Spring Security를 적용한다는 Annotation
@Configuration
public class SecurityConfig{

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/userAccess").hasRole("USER")
                .antMatchers("/userAccess").hasRole("ADMIN")
                .antMatchers("/user/login.do", "/access_denied", "/resources/**", "/user/registPage.do").permitAll() // 로그인 권한은 누구나, Resources 파일도 모든 권한
                .and()
                .formLogin()
                .loginPage("/user/login.do")
                .loginProcessingUrl("/login_proc")
                .defaultSuccessUrl("/user/loginSuccessPage.do")
                .failureUrl("/user/loginDenied.do")
                .and().csrf().disable()
                .httpBasic();

        return http.build();
    }

/*    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails user = User.withDefaultPasswordEncoder()
        return new InMemoryUserDetailsManager(user);
    }*/
}
