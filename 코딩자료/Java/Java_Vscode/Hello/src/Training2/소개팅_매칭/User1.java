package Training2.소개팅_매칭;

public class User1 {
    String name;
    boolean isMale;
    double point;

    public User1(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
        this.point = Math.random() * 5;
    }
    public String toString() {
        String a;
        if(isMale == false){
            a = "여자";
        }
        else{
            a = "남자";
        }
        return String.format("%s(%s: %.1f)\n", name, a, point);
    }
}
