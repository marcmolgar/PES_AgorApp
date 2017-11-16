package pes.agorapp.JSONObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alex on 05-Nov-17.
 */

public class Comment {

    private int id;

    // TODO: update String to UserAgorApp class
    private String author;
    private String content;
    private Date date;
    private int reward;

    public Comment(int id, String author, String content, Date date, int reward) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.date = date;
        this.reward = reward;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public int getReward() { return reward; }

    public void setReward(int reward) { this.reward = reward; }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateString() {
        DateFormat df = new SimpleDateFormat("HH:mm dd/MM");
        return df.format(date);
    }
}
