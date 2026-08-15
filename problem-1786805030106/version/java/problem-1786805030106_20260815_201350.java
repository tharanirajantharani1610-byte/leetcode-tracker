// Last updated: 15/08/2026, 20:13:50
1class Solution {
2    public int elevatorRequests(int n, int[] requests) {
3        int currentFloor = 0;
4        int totalTime = 0;
5        for(int floor : requests){
6            totalTime += Math.abs(currentFloor - floor);
7            currentFloor = floor;
8        }
9        return totalTime;
10    }
11}