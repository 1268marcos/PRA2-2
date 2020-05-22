package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "poems")

public class Poem {

   
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "poemId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "poemTitle")
    private String mTitle;

    private String mAuthor;

    public Poem(@Nullable String title, String author, int score, String creationDate) {
        mTitle = title;
        mAuthor = author;
        mScore = score;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mScore;
    private String mCreationDate;

}

//muito bem!!!
