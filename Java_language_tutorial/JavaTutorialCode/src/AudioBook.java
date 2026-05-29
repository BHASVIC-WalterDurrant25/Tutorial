public class AudioBook extends Book {
    private int Runtime;

    AudioBook(String Title, String Author,  int runtime){
        super(Title, Author, 0);
        this.Runtime = runtime;
    }
}
