package onboarding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        HashMap<String, Integer> userTwoLetterList = new HashMap<>();
        Set<String> DuplicateNameList = new HashSet<>();

        List<String> answer = List.of("answer");
        for (List<String> form : forms) {
            makeTwoLetterList(form.get(1), userTwoLetterList);
        }
        for (Map.Entry<String, Integer> entry : userTwoLetterList.entrySet()) {
            makeDuplicateNameList(DuplicateNameList, entry);
        }



        return answer;
    }

    public static void makeTwoLetterList(String nickName, HashMap<String, Integer> twoLetterList) {
        String[] splitNickName = nickName.split("");
        for (int i = 0; i < splitNickName.length-1; i++) {
            String userTwoLetter = splitNickName[i]+splitNickName[i+1];
            twoLetterList.put(userTwoLetter, twoLetterList.getOrDefault(userTwoLetter, 0) + 1);
        }
    }

    public static void makeDuplicateNameList(Set<String> duplicateList, Map.Entry<String, Integer> entry) {
        if (entry.getValue() > 1) {
            duplicateList.add(entry.getKey());
        }
    }
}
