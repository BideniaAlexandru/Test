public class StatisticsCommand implements Command{
    public void execute(){
        Book b=DocumentManager.getInstance().getBook();
        if(b!=null){
            BookStatistics stats =new BookStatistics();
            b.accept(stats);
            stats.printStatistics();
        }
        System.out.println("Statistics");
    }
}