package phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        String[] votes = {"victor", "veronica", "ryan", "dave", "Maria", "Maria","farah", "farah","varonica", "ryan"};
//        System.out.println(electionWinner(votes));
        electionWinner(votes);
    }
    
    static String electionWinner(String[] votes) {
        int numberOfVotes = votes.length - 1;
        SortedSet contestant = new TreeSet();
        int maxVote = 0;
        Map<String, Integer> voteMap = new HashMap(numberOfVotes);
        
        if (numberOfVotes > 0) {
            for (int i = 1; i <= numberOfVotes; i++) {
                if (voteMap.get(votes[i]) == null) {
                    voteMap.put(votes[i], 1);
                } else {
                    int voteCount = voteMap.get(votes[i]);
                    voteMap.put(votes[i], voteCount+1);
                }
            }
            for (int i = 1; i <= numberOfVotes; i++) {
                
                
                if (voteMap.get(votes[i]) >= maxVote) {
                    contestant.add(votes[i]);
                    maxVote = voteMap.get(votes[i]);
                }
            }
            
            Object[] allFinalist = contestant.toArray();
            for (Object string : allFinalist) {
                System.out.println(string);
            }
            
            return (String) contestant.toArray()[contestant.size() - 1];
        }
        return null;
    }
    
}
