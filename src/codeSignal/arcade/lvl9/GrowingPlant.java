package codeSignal.arcade.lvl9;

public class GrowingPlant {
//    Better solution:
//             The height after x days (up - down) * (x - 1) + up
//             We want dh <= (u - d) * (x - 1) + u
//             (dh - u) / (u - d) + 1 <= x

//            return Math.max(0, (int) Math.ceil((double) (desiredHeight - upSpeed) / (upSpeed - downSpeed))) + 1;
    static int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int days = 0;
        int height = 0;

        while (height < desiredHeight) {
            height += upSpeed;
            days++;

            if (height >= desiredHeight) {
                break;
            }
            
            height -= downSpeed;
        }
        return days;
    }

    public static void main(String[] args){
        int upSpeed = 100;
        int downSpeed = 10;
        int desiredHeight = 910;
        System.out.println(solution(upSpeed, downSpeed, desiredHeight));
    }
}
