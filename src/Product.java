public enum Product {
    //chips has an id of 1 and cost of 10$

    CHIPS(1,10),COKE(2,50),WATER(3,30),SANDWICH(4,150);
    final private int id ;
    final private int price ;

    Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public static Product valueOf(int productSelected){
        for(Product product: Product.values()){
            if(product.id == productSelected){
                return product;
            }
        }
        return null ;
    }
}
