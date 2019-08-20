package aggregation;

public class Address {
    int RoomNo;
    String city;
    String state;
    String country;
    Address(int RoomNo , String city, String state, String country){
       this.RoomNo = RoomNo;
       this.city = city;
       this.state = state;
       this.country = country;
    }
    public static void main(String args[]){
        Address add = new Address(101,"Pune","Maharashtra","India");
        System.out.println("Address :" +add.RoomNo+ " "+ add.city+" "+add.state+" "+ add.country);

    }
}
