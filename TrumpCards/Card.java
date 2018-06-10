package myscripts.Trump.TrumpCards;

public class Card {
  //suit-set
  public/*cut it if u noed*/ static final String[] suit = {"CR", "DY", "HT", "SP", "[JOKER]"};
  static final String[] suitfull =
          {"CLUB   ", "DIAMOND", "HART   ", "SPADE  ", "[JOKER]"};

  private int cardID;

  String info() {//[suit+// num]

    if (stnum() >= 4) return suit[4];

    String numStr;
    if (num() / 10 == 0) numStr = " " + num() + "]";
    else numStr = num() + "]";

    return "[" + suit[stnum()] + numStr;
  }

  int getCardID(){
    return cardID;
  }
  void setCardID(int cardID){
    this.cardID=cardID;
  }

  int stnum() {
    return cardID / 13;
  }
  int num() {
    return cardID % 13 + 1;
  }
  void showInfo(Card card) {
    System.out.print(card.info());
  }

}
