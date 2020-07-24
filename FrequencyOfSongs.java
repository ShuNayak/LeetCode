package com.leetcode.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfSongs {
	
	public static HashMap<String, ArrayList<String>> computeMap(HashMap<String, ArrayList<String>> user, HashMap<String, ArrayList<String>> songs){
		HashMap<String, String> songClassify = new HashMap<>();
		songs.forEach((gen, gen_songs)->gen_songs.forEach(song->songClassify.put(song, gen)));
		HashMap<String, ArrayList<String>> freq = new HashMap<String, ArrayList<String>>();
		user.forEach((user_name, songs_list)->freq.put(user_name, calculateFreq(songs_list, songClassify)));
		return freq;
	}
	
	public static ArrayList<String> calculateFreq(ArrayList<String> userSongs, HashMap<String, String> songClassify ) {
		HashMap<String, Integer> genFreq= new HashMap<String, Integer>();
		ArrayList<String> frequentGen= new ArrayList<String>();
		int max = 0;
		for(String song:userSongs) {
			String gen = songClassify.get(song);
			max = Math.max(genFreq.merge(gen, 1, (ov, nv)->ov+1), max);
			
		}
		for(Map.Entry<String, Integer> map: genFreq.entrySet()) {
			if(map.getValue()== max) {
				frequentGen.add(map.getKey());
			}
		}
		return frequentGen;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<String>> user = new HashMap<String, ArrayList<String>>();
		ArrayList<String> userSongs = new ArrayList<String>();
		userSongs.add("Hi");
		userSongs.add("bye");
		userSongs.add("Die");
		user.put("a", userSongs);
		HashMap<String, ArrayList<String>> songsGen = new HashMap<String, ArrayList<String>>();
		ArrayList<String> gen = new ArrayList<String>();
		gen.add("Hi");
		gen.add("Die");
		songsGen.put("rock",gen);
		ArrayList<String> bzz = new ArrayList<String>();
		bzz.add("bye");
		songsGen.put("jazz", bzz);
		computeMap(user, songsGen);


	}

}
