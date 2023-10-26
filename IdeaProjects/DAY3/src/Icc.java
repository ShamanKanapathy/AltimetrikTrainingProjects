import java.util.*;
public class Icc {

        public void getPlayerInfo(Players[] players) {

            for(Players  player: players) {
                System.out.println(player.getPlayerId());
                System.out.println(player.getPlayerName());
                System.out.println(player.getPlayerTeam());
                System.out.println(player.getTotalScore());

            }
        }

    }

