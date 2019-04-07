package com.github.dagger2.Data;

public class Hero {

    public String name, realname, team, firstappearance, createdby, publisher, imageurl, bio;

    public Hero(String name, String realname, String team, String firstappearance, String createdby,
                String publisher, String imageurl, String bio) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }

}