public class LibraryItem {
    public boolean reserved;
    public String itemName;
    public LibraryItem(String newItemName){
        reserved = false;
        itemName = newItemName;
    }
    public void reserveItem(){
        if (reserved){
            throw new ReservationException(itemName + " is already reserved");
        } reserved = true;
        System.out.println(itemName + " has been reserved");
    }
    public void returnItem(){
        if (!reserved){
            throw new ReservationException(itemName + " is already available");
        } reserved = false;
        System.out.println(itemName + " has been returned");
    }
}
