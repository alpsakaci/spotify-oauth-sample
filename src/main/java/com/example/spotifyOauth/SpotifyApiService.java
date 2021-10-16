package com.example.spotifyOauth;

import java.util.HashMap;
import java.util.Map;

public class SpotifyApiService extends ApiBinding {

	public SpotifyApiService(String accessToken) {
		super(accessToken);
	}

	public Object createPlaylist(String name) {
		Map<String, String> playlist = new HashMap<String, String>();
		playlist.put("name", name);

		Object response = this.restTemplate.postForObject("https://api.spotify.com/v1/me/playlists", playlist,
				Object.class);

		return response;
	}

}
