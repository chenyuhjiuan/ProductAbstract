public class Bookchild extends Book{
    private String bookname;

    public static void main(String args[]){
        Bookchild bcojb=new Bookchild();
        //Bookchild inherits Book's 2.0 price, not 0.9 price from Product
        System.out.println(bcojb.getFormattedPrice(20.0));
    }

}
