package test;

public class BooksVo {

    //題名
    private String bookName;
    //ページ数
    private int bookPages;

    //題名を取得するgetter
    public String getBookName() {
        return bookName;
    }

    //題名を設定するgetter
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //ページ数を取得するgetter
    public int getBookPages() {
        return bookPages;
    }

    //ページ数を設定するgetter
    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

}
