package com.cc;

public class Video {
    private String url;
    private String desc;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Video{" +
                "url='" + url + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
