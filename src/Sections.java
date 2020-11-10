import java.io.IOException;
import java.util.ArrayList;

public class Sections implements Elements {
    public String title;
    public ArrayList<Elements> content=new ArrayList<>();

    Sections(String t)
    {
        title=t;
    }

    public void add(Elements elm)
    {
        content.add(elm);
    }

    public void remove(Elements elm)
    {
        content.remove(elm);
    }

    public Elements getElement(int index){
        return content.get(index);
    }

    public void print() throws IOException {
        System.out.println(title);
        for(Elements e:content)
        {

            e.print();
        }
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
        for(Elements elem : content){
            elem.accept(visitor);
        }
    }
}