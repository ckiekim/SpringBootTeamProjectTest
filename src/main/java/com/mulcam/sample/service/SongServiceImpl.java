package com.mulcam.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.sample.dao.SongDao;
import com.mulcam.sample.entity.Song;
import com.mulcam.sample.entity.Song2;

@Service
public class SongServiceImpl implements SongService {
	
	@Autowired private SongDao songDao;

	@Override
	public List<Song> getSongList() {
		List<Song> list = songDao.getSongList();
		return list;
	}

	@Override
	public List<Song2> getSong2List() {
		List<Song2> list = songDao.getSong2List();
		return list;
	}

	@Override
	public void insertSong(Song song) {
		songDao.insertSong(song);
	}

}
