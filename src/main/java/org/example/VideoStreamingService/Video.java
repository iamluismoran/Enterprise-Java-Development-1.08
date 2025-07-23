package org.example.VideoStreamingService;

public abstract class Video {
    protected String title;
    protected int duration;

    public  Video(String tittle, int duration){
        this.title = tittle;
        this.duration = duration;
    }

    public String getInfo() {
        return "Título: " + title + ", Duración: " + duration + " min";
    }
}
