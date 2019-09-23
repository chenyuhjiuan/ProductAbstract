public abstract class Product {
    private String code="code from Product";
    private String description="description from Producr";
    private double price=1.0;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    abstract public double getFormattedPrice(double price);

    // Create public access for the count variable
    public  int getCount() {

        return count;
    }
}
