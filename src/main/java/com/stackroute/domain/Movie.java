package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie {

    private Actor actor;

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor()
    {
        return actor;
    }

    public void setActor(Actor actor)
    {
        this.actor = actor;
    }
    public void message()

    {
        System.out.println("hi"+actor.getName());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
