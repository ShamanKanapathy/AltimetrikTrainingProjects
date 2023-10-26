import java.util.*;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of players:");
        int no=sc.nextInt();

        Players [] pList =new Players[no];
        for (int i = 0;i <no ; i++) {


            System.out.println("enter player name:");
            String pn = sc.next();

            System.out.println("Player ID:");
            int pid= sc.nextInt();

            System.out.println("enter player team:");
            String pt = sc.next();

            System.out.println("TotalScore:");
            int ts = sc.nextInt();
            Players p = new Players();
            p.setPlayerName(pn);
            p.setPlayerId(pid);
            p.setPlayerTeam(pt);
            p.setTotalScore(ts);
            pList[i]=p;
        }
            Icc icc = new Icc();
            icc.getPlayerInfo(pList);
        }
    }

