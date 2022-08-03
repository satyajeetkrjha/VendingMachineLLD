public class CoinBundle {
    public int number5CentCoins;
    public int number10CentCoins;
    public int number20CentCoins;
    public int number50CentCoins;
    public int number100CentCoins;

    public CoinBundle(int... enteredCoins){
        System.out.println(enteredCoins);
        this.number5CentCoins = enteredCoins[0];
        this.number10CentCoins = enteredCoins[1];
        this.number20CentCoins = enteredCoins[2];
        this.number50CentCoins = enteredCoins[3];
        this.number100CentCoins = enteredCoins[4];

    }
    public int getTotal(){
        int total = 0;
        total += this.number5CentCoins *Coin.FIVE_CENTS.getValue();
        total = total+this.number10CentCoins*Coin.TEN_CENTS.getValue();
        total = total+this.number20CentCoins*Coin.TWENTY_SCENTS.getValue();
        total = total+this.number50CentCoins*Coin.FIFTY_SCENTS.getValue();
        total = total+this.number100CentCoins*Coin.HUNDRED_CENTS.getValue();
        return total;
    }


}
