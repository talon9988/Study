package com.javaex;

import java.util.ArrayList;
import java.util.Arrays;

public class Thundercracker {
	public class ArrayListSample {
		
		public static void main(String[] args) {
			
			ArrayList<Integer> members = new ArrayList<>(); //<정수>만 담을 수 있는 배열
			
			ArrayList<Integer> members10 = new ArrayList<>(10); //초기 리스트 크기는 10, 나중에 리스트가 늘어날 때 10개씩 늘어남
			
			ArrayList<Integer> members3 = new ArrayList<>(Arrays.asList(1,2,3)); // 1, 2, 3 을 담아서 3개짜리의 리스트 만듦
		
			ArrayList<Integer> membersList = new ArrayList<>(members3); //위의 리스트 중 하나로 크기설정
			
			ArrayList<String> list = new ArrayList<>(10);
			list.add("a");
			list.add("b");
			list.add("c");
			list.add("d");
			list.add("e");
			list.add("f");
			list.size(); // 리스트의 사이즈는 6 (커페시티는 10개: 나중에 리스트가 늘어날 때 10갸씩 늘어남)
			
			 System.out.println(list.get(3));
		}
	}
}
