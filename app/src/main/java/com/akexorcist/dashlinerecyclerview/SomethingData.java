package com.akexorcist.dashlinerecyclerview;

/**
 * Created by Akexorcist on 12/4/2016 AD.
 */

public class SomethingData {
    private String title;
    private String content;
    private String releaseDate;

    public SomethingData() {
    }

    public SomethingData(String title, String content, String releaseDate) {
        this.title = title;
        this.content = content;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public SomethingData setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public SomethingData setContent(String content) {
        this.content = content;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
