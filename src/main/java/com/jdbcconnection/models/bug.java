package com.jdbcconnection.models;

public class bug {
    private int id;
    private String title;
    private String description;
    private String status;
   // Dummy constructor to avoid id issues;
    public bug() {
    }
   public bug( String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return status;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
