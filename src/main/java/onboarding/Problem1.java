package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int pobiScore;
        int crongScore;

        pobiScore = Math.max(howManyScore(pobi.get(0)), howManyScore(pobi.get(1)));
        crongScore = Math.max(howManyScore(crong.get(0)), howManyScore(crong.get(1)));

        return Result(pobiScore, crongScore);
    }

    public static int Result(int pobiScore, int crongScore) {
        if (pobiScore > crongScore) return 1;
        if (pobiScore < crongScore) return 2;
        return 0;
    }

    public static int howManyScore(int num) {
        return Math.max(plusDigits(num), multiFlyDigits(num));
    }

    public static int plusDigits(int num) {
        if (num >= 100) {
            return num / 100 + (num % 100 + 1)/10 - 1 + num % 10;
        }
        return num / 10 + num % 10;
    }

    public static int multiFlyDigits(int num) {
        if (num >= 100) {
            return num / 100 * ((num % 100 + 1)/10 - 1) * num % 10;
        }
        return (num / 10) * (num % 10);
    }
}
