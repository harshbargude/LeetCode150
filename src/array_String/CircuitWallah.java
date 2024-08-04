package array_String;

public class CircuitWallah {
    public static void main(String[] args) {
        // int[] gas = {3,1,1};
        // int [] cost = {1,2,2}; //0

        int[] gas = {2,3,4};
        int [] cost = {3,4,3}; // -1

        // int[] gas = {1,2,3,4,5};
        // int [] cost = {3,4,5,1,2}; //3

        // int[] gas = {5,8,2,8};
        // int [] cost = {6,5,6,6}; //3

        // int[] gas = {4,5,3,1,4};
        // int [] cost = {5,4,3,4,2}; //-1

        // int[] gas = {1,2,3,4,5,5,70};
        // int [] cost = {2,3,4,3,9,6,2}; //6

        // int[] gas = {7,1,0,11,4};
        // int [] cost = {5,9,1,2,5}; //3

        // int[] gas = { 5 };
        // int[] cost = { 3 }; // 0

        Solution solution = new Solution();
        // int ans = solution.canCompleteCircuit(gas, cost);
        int ans = solution.canCompleteCircuit2(gas, cost);
        System.out.println("The best rout is at index: " + ans);
    }

    public static class Solution {
      /*   public int canCompleteCircuit(int[] gas, int[] cost) {

            int tank = 0;
            for (int i = 0; i < gas.length; i++) {
                // tank = gas[i];

                if (gas.length == 1)
                    return 0;
                tank = tank + gas[(i)] - cost[i];
                if (tank <= 0) {
                    tank = 0;
                    continue;
                }
                // int[] gas = {2,3,4};
                // int [] cost = {3,4,3};
                // j
                // int stop1 =0;
                int stop = i;
                // int stop = i;
                if (i == 0) {
                    stop = gas.length - 1;
                } else {
                    stop = stop - 1;
                }
                int j = i + 1;
                boolean tankFull = true;
                while (tankFull == true && j != i) {
                    j %= (gas.length);
                    tank = tank + gas[j] - cost[j];
                    if (tank <= 0) {
                        if (tank == 0 && j == stop) {
                            return i;
                        }
                        // i++;
                        tankFull = false;
                        tank = 0;
                        continue;
                    }
                    j++;
                }
                if (i <= gas.length - 1) {
                    if (i == j) {
                        return i;
                    }
                    continue;
                }
                continue;
            }

            return -1;
        }
            
        */

        public int canCompleteCircuit2(int[] gas, int[] cost) {
            int totalGas = 0;
            int totalCost = 0;
            int tank = 0;
            int start = 0;

            for (int i = 0; i < gas.length; i++) {
                totalGas += gas[i];
                totalCost += cost[i];
                tank += gas[i] - cost[i];
                if (tank < 0) {
                    start = i + 1;
                    tank = 0;
                }
            }

            if (totalGas < totalCost) {
                return -1;
            } else {
                return start;
            }
        }
    }
}
