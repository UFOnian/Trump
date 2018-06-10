package myscripts.Trump.TrumpCards;

import java.util.Random;

public class Trump {

  //members(and member-like methods)
  private int[] suitStrength = {1, 2, 3, 4};  //bigger is stronger

  //枚数
  private int joker;
  int all() {
    return 52 + joker;
  }
  int remain() {
    return all() - nextCard;
  }

  //山札関連
  private Card[] cards;    //カードセット
  private int nextCard;   //山の一番上（次にでるカードの場所（兼使用済みカード枚数）


  //methods
  void setJoker(int joker) {
    this.joker = joker;
  }

  void setSuitStrength(int[] suitStrength) {
    this.suitStrength = suitStrength;
  }

  void shuffle() {
    Random rand = new Random();
    resetCards();
    for (int i = 0; i < all(); i++) {
      int swap = rand.nextInt(all());

      Card tmp = cards[i];
      cards[i] = cards[swap];
      cards[swap] = tmp;
    }
  }

  void shuffleRemain() {
    Random rand = new Random();
    for (int i = nextCard; i < all(); i++) {
      int swap = rand.nextInt(remain()) + nextCard;

      Card tmp = cards[i];
      cards[i] = cards[swap];
      cards[swap] = tmp;
    }
  }

  void resetCards() {
    cards = new Card[all()];
    for (int i = 0; i < all(); i++) cards[i].setCardID(i);
  }

  //draw
  Card[] give(int num) {
    if (num < 1) return null;
    Card[] give = new Card[num];
    int i;
    for (i = 0; i < num; i++) {
      give[i] = cards[nextCard + i];
    }
    nextCard += i;

    return give;
  }

  Card[] give() {
    return give(1);
  }


//print

//constructor

  Trump(int joker) {
    this.joker = joker;
    this.nextCard = 0;
    this.resetCards();
  }

  Trump() {
    this(1);
  }

//

}

