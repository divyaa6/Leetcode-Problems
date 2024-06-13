class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        
        Arrays.sort(seats);
        Arrays.sort(students);
        int count=0;
        for(int i=0;i<seats.length;i++)
        {
            while(seats[i]!=students[i])
            {
                if(students[i]>seats[i])
                {
                    students[i]--;
                }
                else
                {
                    students[i]++;
                }
                count++;
            }
        }
        return count;
    }
}