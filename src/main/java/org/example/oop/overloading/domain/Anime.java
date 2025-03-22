package org.example.oop.overloading.domain;

public class Anime {
    private String name;
    private String type;
    private int episode;
    private String status;

    // Overloading here
    public void init(String name, String type, int episode) {
        this.name = name;
        this.type = type;
        this.episode = episode;
    }

    public void init(String name, String type, int episode, String status) {
        this.name = name;
        this.type = type;
        this.episode = episode;
        this.status = status;
    }

    

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episode);
        System.out.println(this.status);

        
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getEpisode() {
        return episode;
    }
    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

}
