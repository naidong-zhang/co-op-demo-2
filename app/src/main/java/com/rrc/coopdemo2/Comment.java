package com.rrc.coopdemo2;

public class Comment {
    private String userName;
    private String comment;

    public Comment() {
        this.userName = "";
        this.comment = "";
    }

    public Comment(String userName, String comment) {
        this.userName = userName;
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
