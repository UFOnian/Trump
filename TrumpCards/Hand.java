package myscripts.Trump.TrumpCards;

public class Hand {
  private static int IDUsed =0;//player cnt
  private int ID;
  private Card[] card;

  // TODO: 2018/06/05 何入れたいのよ？
  void draw(Trump where,int num) {
    Card[] cardsTmp =new Card[card.length+num];

  //System.arraycopy(source, CopyFromNum, copyTo, copyToBeginFrom, hawMany)
    System.arraycopy(card,0,cardsTmp,0, card.length);
    System.arraycopy(where.give(num),0,cardsTmp, card.length,cardsTmp.length);

    card =cardsTmp;
  }
  void draw(Trump where){
    draw(where,1);
  }

  static void resetIDused(){// ! Call me when reset game
    IDUsed =0;
  }

  Hand(){
    IDUsed++;
    ID= IDUsed;
    card =new Card[0];
  }
}

