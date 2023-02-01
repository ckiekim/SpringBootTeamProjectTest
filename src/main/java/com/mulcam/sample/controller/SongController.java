package com.mulcam.sample.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mulcam.sample.entity.Song;
import com.mulcam.sample.entity.Song2;
import com.mulcam.sample.service.SongService;

@Controller
@RequestMapping("/song")
public class SongController {
	
	@Autowired private SongService songService;

	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "<h1>Hello world!!!</h1>";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Song> list = songService.getSongList();
		list.forEach(x -> System.out.println(x));
		model.addAttribute("songList", list);
		return "song/list";
	}
	
	@ResponseBody
	@GetMapping("/list2")
	public String list2(Model model) {
		List<Song2> list = songService.getSong2List();
		list.forEach(x -> System.out.println(x));
		return "";
	}
	
	@GetMapping("/insert")
	public String insertForm() {
		return "song/insert";
	}
	
	@ResponseBody
	@PostMapping("/insert")
	public String insertResult(Song song, HttpServletRequest req) {
		int sid = Integer.parseInt(req.getParameter("sid"));
		String title = req.getParameter("title");
		String lyrics = req.getParameter("lyrics");
		Song song2 = new Song(sid, title, lyrics);
		return song.toString();
	}
	
}
