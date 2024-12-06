package CodingTest_2;

public class EBook extends Book{
  double fileSize;
  int accessCount;

    public EBook(String author, String title, double fileSize) {
        super(author, title);
        this.fileSize = fileSize;
    }
    void access(){
     accessCount = accessCount + 1;
      System.out.println(title);
    }

    @Override
    void displayDetails() {
      System.out.println("EBook - 제목 :" + title + "," + "저자:" + author + "파일 사이즈: " + fileSize + "," + "조회횟수: " + accessCount);
    }
}
