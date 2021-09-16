package com.example.eplstanding.model;

import com.google.gson.annotations.SerializedName;

public class StatsItem{

	@SerializedName("shortDisplayName")
	private String shortDisplayName;

	@SerializedName("summary")
	private String summary;

	@SerializedName("displayValue")
	private String displayValue;

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private String id;

	@SerializedName("abbreviation")
	private String abbreviation;

	@SerializedName("type")
	private String type;

	@SerializedName("value")
	private int value;

	public void setShortDisplayName(String shortDisplayName){
		this.shortDisplayName = shortDisplayName;
	}

	public String getShortDisplayName(){
		return shortDisplayName;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setDisplayValue(String displayValue){
		this.displayValue = displayValue;
	}

	public String getDisplayValue(){
		return displayValue;
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

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
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

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"StatsItem{" + 
			"shortDisplayName = '" + shortDisplayName + '\'' + 
			",summary = '" + summary + '\'' + 
			",displayValue = '" + displayValue + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",abbreviation = '" + abbreviation + '\'' + 
			",type = '" + type + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}