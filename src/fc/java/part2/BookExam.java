package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        int a;
        a = 10;
//        Book b;
//        b = new Book();
        Book b = new Book();
        b.title = "자바";
        b.company = "영진";
        b.price = 18000;
        b.writer = "김상형";
        b.page  = 700;
        b.isbn  = "123456-789";
        System.out.println(b.title+"\t"+b.company+"\t"+b.price+"\t"+b.writer+"\t"+b.page+"\t"+b.isbn);
    }
}
