package aggregation;

public class User {
    String name;
    int user_id;
    String address;
    String mobilenumber;
    User(String name, int user_id , String address, String mobilenumber){
        this.name = name;
        this.user_id = user_id;
        this.address = address;
        this.mobilenumber = mobilenumber;
    }
    public static void main(String args[]){
       /* User user1= new User("Shital", 01,"sangvi", "7219468880");
        User user2 = new User("Swapnil",02,"sangvi", "8390333150");
        System.out.println("User : "+ user1.name+" "+user1.user_id+" "+user1.address+" "+user1.mobilenumber);
        System.out.println("User :  "+user2.name+" "+user2.user_id+" "+user2.address+" "+user2.mobilenumber);*/
    }
}

