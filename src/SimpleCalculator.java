public class SimpleCalculator implements Calculator{
    public SimpleCalculator() {
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
    public int calculateTotal(CoinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        change.number100CentCoins = remainingAmount / Coin.HUNDRED_CENTS.getValue();
        remainingAmount = remainingAmount % Coin.HUNDRED_CENTS.getValue();

        change.number50CentCoins = remainingAmount / Coin.FIFTY_SCENTS.getValue();
        remainingAmount = remainingAmount % Coin.FIVE_CENTS.getValue();

        change.number20CentCoins = remainingAmount / Coin.TWENTY_SCENTS.getValue();
        remainingAmount = remainingAmount %  Coin.TWENTY_SCENTS.getValue();

        change.number10CentCoins = remainingAmount / Coin.TEN_CENTS.getValue();
        remainingAmount = remainingAmount % Coin.TEN_CENTS.getValue();

        change.number5CentCoins = remainingAmount / Coin.FIVE_CENTS.getValue();

        return change ;
    }
}
