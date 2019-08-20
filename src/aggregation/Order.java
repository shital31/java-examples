package aggregation;

public class Order {
   int id;
   String order_id;
   String productName;
   int productQuantity;
   double productTotal;
   double productAmount;
   static User user;

   public Order(int id , String order_id,String productName,int productQuantity,double productTotal,double productAmount, User user){
       this.id = id;
       this.order_id = order_id;
       this.productName = productName;
       this.productQuantity = productQuantity;
       this.productTotal = productTotal;
       this.productAmount = productAmount;
       this.user = user;
   }

   void displayData(){
       System.out.println(
               "id: "+id+"\n"+
                       "order id :"+order_id+"\n"+
                       "product Name:"+productName+"\n"+
                       "product Quantity :"+productQuantity+"\n"+
                       "product total: "+ productTotal+"\n" +
                       " product amount : "+ productAmount+"\n"+
                       "cust.name : "+user.name+"\n"+
                       "cust. address : "+user.address+"\n"+
                       "cust.mobile number : "+user.mobilenumber);
   }
   public static void main(String args[]){
       User user= new User("Shital", 01,"sangvi", "7219468880");
       Order order = new Order(1,String.valueOf(System.currentTimeMillis() ),"Pears",6,63.00,10.50,user);
       order.displayData();
   }



}
