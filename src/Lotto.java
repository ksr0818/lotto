import java.util.HashSet;

public class Lotto {

    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<>();
        for (int i=1; lotto.size() < 6; i++){
            int num = (int) (Math.random() * 45) +1;
            System.out.printf("%d번째 번호는 %d입니다.\n",i,num);
            lotto.add(num);
        }
        System.out.println(lotto);
    }
}
