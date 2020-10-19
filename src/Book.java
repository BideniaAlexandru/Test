import java.util.ArrayList;

class Book {
    public String title;
    public Author author;
    public ArrayList<Chapter> chapters=new ArrayList<>();
    Book(String t)
    {
        title=t;
    }
    public void addAuthor(Author a)
    {
        author=a;
    }

    public int createChapter(String c)
    {
        Chapter chapter= new Chapter(c);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int n)
    {
        return chapters.get(n);
    }


}