public class DVD extends LibraryItem{
    public int watchMinutes;
    public DVD(int newWatchMinutes, String name){
        super(name);
        watchMinutes = newWatchMinutes;
    }
    public void watch(){
        if (reserved){
            System.out.println( "you watched the " + itemName + " in " + watchMinutes + "minutes" );
        } else {
            throw new IllegalOperationException("you can't watch a DVD you haven't reserved");
        }
    }
}
