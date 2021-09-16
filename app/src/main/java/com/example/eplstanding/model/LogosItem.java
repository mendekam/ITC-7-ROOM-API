package com.example.eplstanding.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LogosItem{

	@SerializedName("width")
	private int width;

	@SerializedName("alt")
	private String alt;

	@SerializedName("rel")
	private List<String> rel;

	@SerializedName("href")
	private String href;

	@SerializedName("height")
	private int height;

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setAlt(String alt){
		this.alt = alt;
	}

	public String getAlt(){
		return alt;
	}

	public void setRel(List<String> rel){
		this.rel = rel;
	}

	public List<String> getRel(){
		return rel;
	}

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"LogosItem{" + 
			"width = '" + width + '\'' + 
			",alt = '" + alt + '\'' + 
			",rel = '" + rel + '\'' + 
			",href = '" + href + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}