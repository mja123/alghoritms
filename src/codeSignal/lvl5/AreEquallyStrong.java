package codeSignal.lvl5;

public class AreEquallyStrong {
    boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return (((yourLeft == friendsLeft) || (yourLeft == friendsRight)) && ((yourRight == friendsLeft) || (yourRight == friendsRight)));
    }

}
