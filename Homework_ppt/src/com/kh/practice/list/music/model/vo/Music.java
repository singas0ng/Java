package com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class Music {

	private String title;
	private String singer;

	public Music() {
		super();
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Object o) { //위에 comparable 안쓰면 이것도 필요 없음
		// TODO Auto-generated method stub
		return 0;
	}

}
//오름차순 : +
//내림차순 : -
