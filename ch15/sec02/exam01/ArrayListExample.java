package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>(); //어레이리스트 생성
	
		//객체 추가
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5")); //배열처럼 무조건 크기를 미리 정해놓지 않아도 됨!
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();		
		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2); //인덱스 넘버
		System.out.println(board.getSubject() + "\t" + board.getContent() + 
													"\t" + board.getWriter());
		System.out.println();
		
		//모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) { 
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + 
													"\t" + b.getWriter());
		}		
		System.out.println();
		
		//객체 삭제
		list.remove(2); //인덱스의 내용 빼고 순서가 하나씩 앞으로 당겨짐
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + 
													"\t" + b.getWriter());
		}
		System.out.println();
		
		list.remove(2);
		
		//향상된 for문으로 모든 객체를 하나씩 가져오기
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + 
													"\t" + b.getWriter());
		}
	}
}

