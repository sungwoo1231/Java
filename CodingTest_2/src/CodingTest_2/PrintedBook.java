package CodingTest_2;

public class PrintedBook extends Book{
    int pageCount;
    boolean isLent;

    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    boolean isLent() {
        if (isLent) {
            return true;
        } else {
            return false;
        }
    }
  void lend() {
      if (isLent) {
          System.out.println(title+ " 은 이미 대출중입니다.");
      } else {
          System.out.println(title+ " 은 성공적으로 대출 처리되었습니다.");
          isLent = true;

      }
  }
    void returnBook(){
        if (!isLent) {
            System.out.println(title + " 은 대출중이 아닙니다.");
        } else {
            System.out.println(title + "은 성공적으로 반납되었습니다.");
            isLent = false;
        }
    }

    @Override
    void displayDetails() {
        System.out.println("Printed Book 제목: " + title + "," + "저자: " + author + "," + "페이지: " + pageCount +  "," + "대출여부: " + isLent);
    }
}

