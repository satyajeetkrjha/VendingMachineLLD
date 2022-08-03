public enum Coin {
    FIVE_CENTS(5),TEN_CENTS(10),TWENTY_SCENTS(20),FIFTY_SCENTS(50),HUNDRED_CENTS(100);
    final private int value;
    private Coin(int value){
      this.value = value ;
    }
    public int getValue(){
        return this.value;
    }

    public static int[] parseCoins(String coins){
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];
        for(int index=0;index<numberCoinsInText.length;index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }
}
