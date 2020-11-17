public class DocumentManager {
    public static DocumentManager instance;
    private static Book instanced_book;
    private DocumentManager(){

    }
    public static DocumentManager getInstance(){
        if(instance==null){
            instance=new DocumentManager();
        }
        return instance;
    }

    public static Book getBook()
    {
        return instanced_book;
    }
    public static void setBook(Book b)
    {
        instanced_book=b;
    }
}