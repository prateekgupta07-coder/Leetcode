class Solution {
    public boolean lemonadeChange(int[] bills) {
        int x = 0;
        int y = 0; 
        int z = 0; 

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                x++;
            } else if (bills[i] == 10) {
                if (x == 0) return false;
                x--;
                y++;
            } else {
                if (y >= 1 && x >= 1) {
                    y--;
                    x--;
                    z++;
                } else if (x >= 3) {
                    x -= 3;
                    z++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}