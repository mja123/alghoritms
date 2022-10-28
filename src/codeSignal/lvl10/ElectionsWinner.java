package codeSignal.lvl10;

public class ElectionsWinner {
    int solution(int[] votes, int k) {
        int maxVotes = 0;
        int secondMax = 0;

        for (int j : votes) {
            if (maxVotes <= j) {
                secondMax = maxVotes;
                maxVotes = j;
            }
        }

        int possibleWinners;

        if ((secondMax != maxVotes) && (k == 0)) {
            possibleWinners = 1;
        } else {
            possibleWinners = 0;
        }


        for (int vote : votes) {
            if ((vote + k) > (maxVotes)) {
                possibleWinners++;
            }
        }

        return possibleWinners;
    }

}
