package Training2.소개팅_매칭;

public class Mating {
    public static void main(String[] args) {
        User1[] users = new User1[10];
        users[0] = new User1("소희", false);
        users[1] = new User1("영수", true);
        users[2] = new User1("영희", false);
        users[3] = new User1("철수", true);
        users[4] = new User1("철희", false);
        users[5] = new User1("짱구", true);
        users[6] = new User1("짱아", false);
        users[7] = new User1("원장", true);
        users[8] = new User1("맹구", true);
        users[9] = new User1("설민", true);

        for(int i=0;i<users.length;i++){
            for(int j=0;j<users.length;j++){
                User1 source = users[i];
                User1 target = users[j];
                if(source.isMale != target.isMale){
                    if(Math.abs(source.point-target.point)<0.8){
                        System.out.println(source.toString() + " - " + target.toString());
                    }
                }
            }
        }
    }
}
