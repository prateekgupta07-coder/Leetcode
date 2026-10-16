class Solution {
    public double largestTriangleArea(int[][] p) {
        double res = 0;

        for (int[] i : p) {
            for (int[] j : p) {
                for (int[] k : p) {
                    res = Math.max(res, 0.5 * Math.abs(
                        i[0] * j[1] + j[0] * k[1] + k[0] * i[1]
                        - i[1] * j[0] - j[1] * k[0] - k[1] * i[0]
                    ));
                }
            }
        }

        return res;
    }
}