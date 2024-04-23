public class Book extends LibraryItem{
    public int pages;
    public Book(int newPages, String name){
        super(name);
        pages = newPages;
    }
    public void read(){
        if (reserved){
            System.out.println( "even though it has " + pages + " you have read " + itemName );
        } else {
            throw new IllegalOperationException("you can't read a book you haven't reserved");
        }
    }
}
