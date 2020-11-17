public class BookStatistics implements Visitor{
    private  int imagesCounter=0;
    private int tablesCounter=0;
    private int paragraphCounter=0;
    private int sectionCounter=0;

    @Override
    public void visit(Image image) {imagesCounter++;}
    @Override
    public void visit(ImageProxy imageProxy) {imagesCounter++;}
    @Override
    public void visit(Paragraph paragraph) {paragraphCounter++;}
    @Override
    public void visit(Table table) {tablesCounter++;}

    @Override
    public void visit(Sections section){
        sectionCounter ++;
    }

    @Override
    public void visit(Book book) {

    }

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("*** NUmber of images: " + imagesCounter);
        System.out.println("*** NUmber of tables: " + tablesCounter);
        System.out.println("*** NUmber of paragraphs: " + paragraphCounter);
        System.out.println("*** NUmber of sections: " + sectionCounter);
    }
}