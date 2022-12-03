import java.util.Random;
public class TestQueue {
    public static void main(String[] args) {
        Queue test = new Queue();

        for(int j=0;j<20;j++){
        String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
        StringBuilder s = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            int ch = (int) (AlphaNumericStr.length() * Math.random());
            s.append(AlphaNumericStr.charAt(ch));

        }
        test.enqueue((s.toString()));
    }

    for(int i=0;i<20;i++)
        System.out.println(test.dequeue());
    }
}
