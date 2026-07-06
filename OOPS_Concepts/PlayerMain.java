import java.util.*;

public class PlayerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int runs = Integer.parseInt(sc.nextLine());
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            players[i] = new Player(id, name, runs, playerType, matchType);
        }

        String searchPlayerType = sc.nextLine();
        String searchMatchType = sc.nextLine();

        int result = findPlayerWithLowestRuns(players, searchPlayerType);

        if (result > 0)
            System.out.println(result);
        else
            System.out.println("No such player");

        Player[] ans = findPlayerByMatchType(players, searchMatchType);

        if (ans == null)
            System.out.println("No Player with given matchType");
        else {
            for (Player p : ans)
                System.out.println(p.getPlayerId());
        }

    }

    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {

        int min = Integer.MAX_VALUE;

        for (Player p : players) {
            if (p.getPlayerType().equalsIgnoreCase(playerType)) {
                if (p.getRuns() < min)
                    min = p.getRuns();
            }
        }

        if (min == Integer.MAX_VALUE)
            return 0;

        return min;
    }

    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {

        ArrayList<Player> list = new ArrayList<>();

        for (Player p : players) {
            if (p.getMatchType().equalsIgnoreCase(matchType))
                list.add(p);
        }

        if (list.size() == 0)
            return null;

        Collections.sort(list, new Comparator<Player>() {
            public int compare(Player p1, Player p2) {
                return p2.getPlayerId() - p1.getPlayerId();
            }
        });

        Player[] res = new Player[list.size()];

        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);

        return res;
    }
}

class Player {

    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}