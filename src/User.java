public class User{
    String name;
    int user_id;
    String address;
    User(String name,int user_id , String address){
        this.name = name;
        this.user_id = user_id;
        this.address = address;
    }
    public static void main(String args[]){
        User user1= new User("Shital", 01,"sangvi");
        User user2 = new User("Swapnil",02,"sangvi");
        System.out.println("User : "+ user1.name+" "+user1.user_id+" "+user1.address);
        System.out.println("User :"+user2.name+" "+user2.user_id+" "+user2.address);
    }
}

