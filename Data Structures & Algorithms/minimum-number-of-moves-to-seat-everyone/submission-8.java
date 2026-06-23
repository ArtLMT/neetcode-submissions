class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int output = 0;
        // 2 1 4 -> 1 2 4
        // 3 1 3 -> 1 3 3

        for (int n = 0; n < seats.length; n++) {
            output += Math.abs(seats[n] - students[n]);
        }
        return output;
    }
}