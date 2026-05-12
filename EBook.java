package day10;
class Book {
	private String title;
	protected Book(String title) { this.title = title; }
	protected String getTitle() { return title; }
}



public class EBook extends Book {
	private int size; // 전자책 크기(인치)
	public EBook(String title, int size) {
		super(title);
		this.size = size;
	}

	public void printInfo() {
		System.out.println(getTitle() + "은 " + size + "인치 전자책입니다.");
	}
	
	public void text2Speech(int page) {
		System.out.println(page + "페이지의 텍스트를 음성으로 출력합니다.");
	}
	
	public static void main(String[] args) {
		EBook javaBook = new EBook("자바에센셜-전자책", 14); // 14인치 전자책
		javaBook.printInfo();
		javaBook.text2Speech(3);
	}

}
