package com.example.eplstanding.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class StandingsItem{

	@SerializedName("note")
	private Note note;

	@SerializedName("stats")
	private List<StatsItem> stats;

	@SerializedName("team")
	private Team team;

	public void setNote(Note note){
		this.note = note;
	}

	public Note getNote(){
		return note;
	}

	public void setStats(List<StatsItem> stats){
		this.stats = stats;
	}

	public List<StatsItem> getStats(){
		return stats;
	}

	public void setTeam(Team team){
		this.team = team;
	}

	public Team getTeam(){
		return team;
	}

	@Override
 	public String toString(){
		return 
			"StandingsItem{" + 
			"note = '" + note + '\'' + 
			",stats = '" + stats + '\'' + 
			",team = '" + team + '\'' + 
			"}";
		}
}