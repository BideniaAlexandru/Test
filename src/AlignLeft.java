public class AlignLeft implements AlignStrategy {

    public void print(String name) {
        System.out.println("Paragraph " +name);
    }



    public void render(Paragraph p) {
        System.out.println("...."+p.getName() );
    }
}