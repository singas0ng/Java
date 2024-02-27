package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{ //구체화시키고 있음
	
	//곡 명을 오름 차순 정렬의 기준을 제공하는 메소드
	@Override
	public int compare(Music o1, Music o2) {
		int result = o1.getTitle().compareTo(o2.getTitle());
		return result;
	}
}
