package Arrays;

import java.util.List;

public class CountItem {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int match = 0;
        int n = items.size();
        for (int i = 0; i < n; i++) {
            // items.get(i).get(0) => get the ith list and get the type element of that list
            // index for type is 0
            // index for color is 1
            // index for name is 2
            if (ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))) {
                match++;
            } else if (ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))) {
                match++;
            } else if (ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))) {
                match++;
            }
        }
        return match;
    }
}
