

public interface VendingMachine {
  void displayProducts();
  void selectProduct(int productId);
  void displayEnterCoinsMessage();
  void enterCoins(int... coins);
  void displayChange();
}
