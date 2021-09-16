package com.example.eplstanding.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("name")
	private String name;

	@SerializedName("season")
	private int season;

	@SerializedName("abbreviation")
	private String abbreviation;

	@SerializedName("seasonDisplay")
	private String seasonDisplay;

	@SerializedName("standings")
	private List<StandingsItem> standings;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSeason(int season){
		this.season = season;
	}

	public int getSeason(){
		return season;
	}

	public void setAbbreviation(String abbreviation){
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation(){
		return abbreviation;
	}

	public void setSeasonDisplay(String seasonDisplay){
		this.seasonDisplay = seasonDisplay;
	}

	public String getSeasonDisplay(){
		return seasonDisplay;
	}

	public void setStandings(List<StandingsItem> standings){
		this.standings = standings;
	}

	public List<StandingsItem> getStandings(){
		return standings;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"name = '" + name + '\'' + 
			",season = '" + season + '\'' + 
			",abbreviation = '" + abbreviation + '\'' + 
			",seasonDisplay = '" + seasonDisplay + '\'' + 
			",standings = '" + standings + '\'' + 
			"}";
		}
}