package Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                .antMatcher("/nihao/**")
                .authorizeRequests()
                .anyRequest().hasRole("yinongxia")
                .and()
                .httpBasic();
    }

//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web
//                .ignoring()
//                .antMatchers("/nihao/welcome");
//    }

    @Autowired

    public void configureGlobal(AuthenticationManagerBuilder anth) throws Exception{
        anth.inMemoryAuthentication().withUser("yinongx1").password("summer").roles("yinongxia");
    }

}
