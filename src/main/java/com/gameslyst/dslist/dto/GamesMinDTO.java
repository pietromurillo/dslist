package com.gameslyst.dslist.dto;


import com.gameslyst.dslist.entities.Games;

public class GamesMinDTO {
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GamesMinDTO(){
    }

    public GamesMinDTO(Games entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
