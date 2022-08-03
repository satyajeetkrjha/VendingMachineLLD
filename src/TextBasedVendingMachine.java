
public class TextBasedVendingMachine implements  VendingMachine{

    private int selectedProduct ;
    private CoinBundle change ;
    public TextBasedVendingMachine() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void displayProducts() {

        System.out.println("Welcome to Vending Machine");
        for(Product product: Product.values()){
            System.out.println("Id is "+product.getId() + "  "+ product.name()+ "  "+ product.getPrice());
        }

        System.out.println("............................");
        System.out.println("PLese select your Product ");

    }

    @Override
    public void selectProduct(int productId) {
        this.selectedProduct = productId;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println(" Please enter coins as follows: ");
        System.out.println(" num of 5 cents coins,num of 10 cents coins,num of 20 cents coins,num of 50 cents coins,num of 100 cents coins  ");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 ten cents coins: 0,2,0,0,0");
        System.out.println("Plese enter coins:");
    }

    @Override
    public void enterCoins(int... coins) {
        Calculator calculator = new SimpleCalculator();
        Product product = Product.valueOf(selectedProduct);
        int total = calculator.calculateTotal(new CoinBundle(coins));
        int changeAmount = total - product.getPrice();
        this.change =calculator.calculateChange(changeAmount);
    }

    @Override
    public void displayChange() {

        System.out.println("                                              ");
        System.out.println("Your change is :"+ change.getTotal()+"cents splitted as follows: ");
        System.out.println("    100 cents coins: "+ change.number100CentCoins);
        System.out.println("    50 cents coins: "+ change.number50CentCoins);
        System.out.println("    20 cents coins: "+ change.number20CentCoins);
        System.out.println("    10 cents coins: "+ change.number10CentCoins);
        System.out.println("    5 cents coins: "+ change.number5CentCoins);

    }
}
