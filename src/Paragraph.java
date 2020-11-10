public class Paragraph implements Elements {
    public String name;
    public AlignStrategy align;
    Paragraph(String n)
    {
        name=n;
    }

    public String getName()
    {
        return this.name;
    }
    public void print()
    {
        if(align==null)
        {
            System.out.println(this.name);
        }
        else{
            align.render(this);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    public void setAlignStrategy(AlignStrategy c)
    {
        this.align=c;
    }

}