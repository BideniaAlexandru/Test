import java.io.IOException;
import java.util.ArrayList;

class Book {
    public String title;
    public Author author;
    public ArrayList<Elements> content=new ArrayList<>();
    Book(String t)
    {
        title=t;
    }
    public void addAuthor(Author a)
    {
        author=a;
    }

    public void addContent(Elements elm)
    {
        content.add(elm);
    }
    public void print() throws IOException {
        System.out.println("Book:"+title);
        System.out.println("Author:"+author.name);
        for(Elements e: content
        ) {e.print();}
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
        for(Elements elem : content){
            elem.accept(visitor);
        }
    }


}