public class Book {
    private String title;
    private String author;
    private int pageCount;

    Book(String Title, String Author, int PageCount){
        this.title = Title;
        this.author = Author;
        this.pageCount = PageCount;
    }

    public String toString(){
        return String.format("%s by %s",this.title, this.author);
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }
}
