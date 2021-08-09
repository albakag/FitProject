package com.example.fitapplication.model;

import java.util.Date;

public class WorkOut {
    private Date date;
    private String tittle;
    private String imageURL;
    private int recordRepsCount;
    private int weight;

    public WorkOut(Date date, String tittle, String imageURL, int recordRepsCount, int weight) {
        this.date = date;
        this.tittle = tittle;
        this.imageURL = imageURL;
        this.recordRepsCount = recordRepsCount;
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getRecordRepsCount() {
        return recordRepsCount;
    }

    public void setRecordRepsCount(int recordRepsCount) {
        this.recordRepsCount = recordRepsCount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
