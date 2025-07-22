package org.example.VideoStreamingService;

public class TvSeries extends Video{
    private int episodes;

    public TvSeries(String tittle, int duration, int episodes) {
        super(tittle, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Episodies: " + episodes;
    }
}
