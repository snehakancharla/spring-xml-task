package com.stackroute.domain.config;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurations {
    @Bean(name="movie")
    public Movie getMovieBean()
    {
        return new Movie(new Actor("Prabhas","male",30));
    }

    @Bean(name="actor")
    public Actor getBeanActor()
    {
        return new Actor("Sneha","female",22);
    }
}