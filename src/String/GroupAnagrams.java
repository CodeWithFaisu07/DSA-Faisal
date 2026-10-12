package String;

    
import java.util.*;

public class GroupAnagrams {

        public static List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();

            for (String str : strs) {

                // Convert the string into a character array
                char[] chars = str.toCharArray();

                // Sort characters to create a common key
                Arrays.sort(chars);
                String key = new String(chars);

                // Create a group if the key does not exist
                map.putIfAbsent(key, new ArrayList<>());

                // Add the original string to its group
                map.get(key).add(str);
            }

            return new ArrayList<>(map.values());
        }

        public static void main(String[] args) {

            String[] strs = {
                    "eat", "tea", "tan", "ate", "nat", "bat"
            };

            System.out.println(groupAnagrams(strs));
        }
    }
