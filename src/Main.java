//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Book book1 = new Book(50, "java textbook");
//        book1.read();
        book1.reserveItem();
        book1.read();

        DVD dvd = new DVD(80, "metal concert");
        dvd.reserveItem();
        dvd.watch();

        dvd.returnItem();
    }
}