import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int count = 0;
        int count2 = 0;

        for (int i = 0; i < goal.length; i++) {

            if (cards1.length > count && goal[i].equals(cards1[count]))
            {
                count++;
            }
            else if (cards2.length> count2 && goal[i].equals(cards2[count2]))
            {
                count2++;
            }
            else
            {
                answer = "No";
                return answer;
            }
        }

        return answer;
    }
}
