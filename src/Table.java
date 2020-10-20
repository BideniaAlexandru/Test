public class Table implements  Elements {
    public String name;
    Table(String n)
    {
        name=n;
    }
    public void print()
    {
        System.out.println("Table "+name);
    }
}