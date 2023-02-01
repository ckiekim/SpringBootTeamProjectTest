package com.mulcam.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mulcam.sample.entity.Song;
import com.mulcam.sample.entity.Song2;

@Service
public interface SongService {

	List<Song> getSongList();
	
	List<Song2> getSong2List();
	
}
