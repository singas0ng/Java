package com.kh.practice.list.music.controller;


import com.kh.practice.list.music.view.MusicView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> musiclist = new ArrayList<Music>(); //vo를 가지고 있고 여기있는 메소드 호출

	public int addList(Music music) {
		musiclist.add(music);
		return 0 ; 

	}

	public int addAtZero(Music music) {
		musiclist.add(music);
		return 0;

	}

	public List printAll() {

		return (ArrayList<Music>) musiclist;

	}

	public Music searchMusic(String title) {
		return null;

	}

	public Music removeMusic(String title) {
		
		public boolean removeMusic(String title) {
			for (int i = 0; i < musiclist.size(); i++) {
				Music haveList = musiclist.get(i);
				if (haveList.getTitle().contains(title)) {
					musiclist.remove(i);
					return null;

				}
				return false;
			}
			
		}

	}

	public Music setMusic(String title, Music music) {

		//리스트 모양의 매개인자를 설정, extends
		
		
		return music;
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
	}

	public int ascTitle() {
		
		
		
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		Collections.sort(musiclist, new AscTitle()); 
		
		return 1;
	}

	public int descSinger() {
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		
		Collections.sort(musiclist);
		//sort는 () 에 있는 자료형이 comparable 의 compareTo를 가지고 있어야 sort 해달라고 했을때
		//music 에 들어있는 값들을 보면서 compareTo 메소드를 호출해서 정렬해주겠다
			
		return 1;

	}

}
