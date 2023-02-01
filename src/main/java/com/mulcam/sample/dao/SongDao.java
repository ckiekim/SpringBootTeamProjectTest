package com.mulcam.sample.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mulcam.sample.entity.Song;
import com.mulcam.sample.entity.Song2;

@Mapper
public interface SongDao {

	@Select("select * from song")
	public List<Song> getSongList();
	
	@Select("select sid ssid, title, lyrics from song")
	public List<Song2> getSong2List();
	
}
