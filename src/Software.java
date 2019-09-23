public class Software extends Product {
    //override field of programmer in parent Product
    private String programmer="programmer from child class Software";
    private String platform; // linux, mac, or pc
    private String os;

    public String getProgrammer(){
        return programmer;
    }
    public void setProgrammer(String programmer){
        this.programmer=programmer;
    }
    //implement parent's abstract method
    public double getFormattedPrice(double price) {
        return 0;
    }

    public static void main(String args[]){

        //will call the public or protected fields and methods in parent Product
        Software sobj= new Software();
        System.out.println("toString method from Product: "+sobj.toString());
        System.out.println("getFormattedPrice method from Product: "+sobj.getFormattedPrice(10.0));
        System.out.println("getCount method from Product"+sobj.getCount());
        System.out.println(sobj.getProgrammer());
    }

}
