public class TwoCrystalBallProblem {
    
    /* 
     * You are given two crystal balls, find the optimal solution
     * to find where to drop them from where they do not shatter
    */

    public static int two_crystal_balls_solver(boolean[] breaks) {
        int jmpAmount = (int) Math.sqrt(breaks.length);

        int i = jmpAmount;
        for (; i < breaks.length; i += jmpAmount) {
            if (breaks[i]) {
                break;
            }
        }

        i -= jmpAmount;

        for (int j = 0; j < jmpAmount && i < breaks.length; ++j, ++i) {
            if (breaks[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        boolean[] breaks = {false, // Floor 0
                            false, // Floor 1
                            false, // Floor 2
                            false, // Floor 3
                            false, // Floor 4
                            false, // Floor 5
                            false,  // Floor 6
                            true,  // Floor 7
                            true,  // Floor 8
                            true   // Floor 9
                            };

        System.out.println(two_crystal_balls_solver(breaks));
    }
}
