package com.example.eplstanding.model;

import com.google.gson.annotations.SerializedName;

public class Note{

	@SerializedName("color")
	private String color;

	@SerializedName("description")
	private String description;

	@SerializedName("rank")
	private int rank;

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public int getRank(){
		return rank;
	}

	@Override
 	public String toString(){
		return 
			"Note{" + 
			"color = '" + color + '\'' + 
			",description = '" + description + '\'' + 
			",rank = '" + rank + '\'' + 
			"}";
		}
}