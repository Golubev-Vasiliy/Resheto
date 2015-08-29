package resheto;
import java.util.ArrayList;
public class Resheto {

    public static void main(String[] args) {
        int N, p, k=0;
        N = Integer.parseInt(args[0]);
        System.out.println("Простые числа в промежутке от 2 до " + N);
        ArrayList<Integer> Res = new ArrayList();
        for (int i=2; i<=N; i++)
            Res.add(i);
        while(Res.get(k)*Res.get(k)<N)
        {
            p=Res.get(k)*Res.get(k);
            for (int i=Res.indexOf(p); i<Res.size(); i++)
                if(Res.get(i) % Res.get(k) ==0)
                    Res.remove(i);
            k++;
        }
        System.out.print(Res);
    }
    
}
