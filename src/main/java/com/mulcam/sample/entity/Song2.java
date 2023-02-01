package com.mulcam.sample.entity;

public class Song2 {
	private int ssid;
	private String title;
	private String lyrics;
	
	public Song2() { }
	public Song2(int sid, String title, String lyrics) {
		super();
		this.ssid = sid;
		this.title = title;
		this.lyrics = lyrics;
	}
	
	@Override
	public String toString() {
		return "Song [sid=" + ssid + ", title=" + title + ", lyrics=" + lyrics + "]";
	}
	
	public int getSsid() {
		return ssid;
	}
	public void setSsid(int ssid) {
		this.ssid = ssid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
}
