package resheto;
import java.util.ArrayList;
public class Resheto {

    public static void main(String[] args) {
        int N;
        N = Integer.parseInt(args[0]);
        System.out.println(N);
        ArrayList Res = new ArrayList();
        for (int i=2; i<=N; i++)
        {
            Res.add(i);
        }
        System.out.print(Res);
    }
    
}
