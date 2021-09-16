package com.example.eplstanding.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Team{

	@SerializedName("shortDisplayName")
	private String shortDisplayName;

	@SerializedName("uid")
	private String uid;

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("name")
	private String name;

	@SerializedName("location")
	private String location;

	@SerializedName("id")
	private String id;

	@SerializedName("abbreviation")
	private String abbreviation;

	@SerializedName("isActive")
	private boolean isActive;

	@SerializedName("logos")
	private List<LogosItem> logos;

	public void setShortDisplayName(String shortDisplayName){
		this.shortDisplayName = shortDisplayName;
	}

	public String getShortDisplayName(){
		return shortDisplayName;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public String getUid(){
		return uid;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setAbbreviation(String abbreviation){
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation(){
		return abbreviation;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setLogos(List<LogosItem> logos){
		this.logos = logos;
	}

	public List<LogosItem> getLogos(){
		return logos;
	}

	@Override
 	public String toString(){
		return 
			"Team{" + 
			"shortDisplayName = '" + shortDisplayName + '\'' + 
			",uid = '" + uid + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",name = '" + name + '\'' + 
			",location = '" + location + '\'' + 
			",id = '" + id + '\'' + 
			",abbreviation = '" + abbreviation + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",logos = '" + logos + '\'' + 
			"}";
		}
}