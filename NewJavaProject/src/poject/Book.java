package poject;

public class Book {
 private int bookNo;
 private String title;
 private String  author;
 private int stateCode; //대여여부
 
 public Book(int bookNo, String title, String author){ //쓰는 생성자
	 this.bookNo = bookNo;
	 this.title = title;
	 this.author = author;
	 stateCode = 1;
 }
 
public void rent() { //대여를 하면 상태코드가 0으로 변환되게 만듦
	if(this.stateCode == 1) //반납 메서드 안쓰고 하는
		this.stateCode = 0;
	else if(this.stateCode == 0)
		this.stateCode = 1;
	 //this.print();
 }
 public void print() { //대여중인지 아닌지 출력
	 System.out.printf("%d 책제목 : %s 저자 : %s ", this.bookNo, this.title, this.author);
	 if(stateCode == 1) {
		 System.out.println("대여유무: 재고있음");
	 }
	 else  System.out.println("대여유무: 대출중");
 }
 
 //반납기능도 만들어보세용
 public void recover() { //반납를 하면 상태코드가 1으로 변환되게 만듦
	 this.stateCode = 1;
	 //this.print();
 }
 
public int getBookNo() { //게터 세터: 만들라니까 만듦
	return bookNo;
}
public void setBookNo(int bookNo) {
	this.bookNo = bookNo;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}

}
