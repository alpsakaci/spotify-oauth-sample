package com.example.spotifyOauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpotifyContoller {

	@Autowired
	private SpotifyApiService apiService;

	@GetMapping("/createPlaylist")
	public Object createPlaylist(@RequestParam("name") String name) {
		return apiService.createPlaylist(name);
	}

}
