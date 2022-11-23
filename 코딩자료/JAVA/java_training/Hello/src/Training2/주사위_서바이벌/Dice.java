package Training2.주사위_서바이벌;

import java.util.ArrayList;

public class Dice {
    String name;
    int planeNum;
    int resultNum;

    Dice(String name, int planeNum) {
        this.name = name;
        this.planeNum = planeNum;
    }

    int roll() {
        return resultNum = (int) (Math.random() * planeNum) + 1;
    }

    public String toString() {
        return "Dice [name=" + name + ", planeNum=" + planeNum + ", resultNum=" + resultNum + "]";
    }
    public boolean isAlive() {
        return resultNum % 2 == 0;
    }

    public static void main(String[] args) {
        Dice[] dices = new Dice[12];
        dices[0] = new Dice("쥐", 2);
        dices[1] = new Dice("소", 3);
        dices[2] = new Dice("호랑이", 4);
        dices[3] = new Dice("토끼", 5);
        dices[4] = new Dice("용", 6);
        dices[5] = new Dice("뱀", 7);
        dices[6] = new Dice("말", 8);
        dices[7] = new Dice("양", 9);
        dices[8] = new Dice("원숭이", 10);
        dices[9] = new Dice("닭", 11);
        dices[10] = new Dice("개", 12);
        dices[11] = new Dice("돼지", 13);
        
        ArrayList<Dice> survivor = new ArrayList<>();
        for (Dice d : dices){
            survivor.add(d);
        }
        for (int i = 0; i < survivor.size(); i++) {
            Dice d = survivor.get(i);
            d.roll();
            if (d.isAlive()) {
                System.out.println(d.toString());
            }
            else{
                survivor.remove(i--);
            }
        }
    }
}
