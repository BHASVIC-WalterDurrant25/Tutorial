public class Ebook extends Book{
    private String format;

    Ebook(String Title, String Author, int PageCount, String Format){
        super(Title, Author, PageCount);
        this.format = Format;
    }

}
