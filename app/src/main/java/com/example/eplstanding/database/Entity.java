package com.example.eplstanding.database;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

@androidx.room.Entity(tableName = "EPL")
public class Entity {
    public static final String TABLE_NAME = "EPL";
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "team")
    private String nama;
    @ColumnInfo(name = "win")
    private String win;
    @ColumnInfo(name = "lose")
    private String lose;
    @ColumnInfo(name = "draw")
    private String draw;
    @ColumnInfo(name = "rank")
    private int rank;
    @ColumnInfo(name = "points")
    private String points;
    @ColumnInfo(name = "logo")
    private String logo;

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getWin() {
        return win;
    }

    public String getLose() {
        return lose;
    }

    public String getDraw() {
        return draw;
    }

    public int getRank() {
        return rank;
    }

    public String getPoints() {
        return points;
    }

    public String getLogo() {
        return logo;
    }

    public Entity(int id, String nama, String win, String lose, String draw, int rank, String points, String logo) {
        this.id = id;
        this.nama = nama;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
        this.rank = rank;
        this.points = points;
        this.logo = logo;
    }
}

