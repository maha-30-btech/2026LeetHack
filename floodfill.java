class Solution {
    int newColor;
    int oldColor;
    int[][] dir = {
        {-1,0},
        {1,0},
        {0,-1},
        {0,1}
    };
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        newColor = color;
        oldColor = image[sr][sc];
        if(oldColor != newColor){
            dfs(image, sr, sc);
        }
        return image;
    }
    public void dfs(int[][] image, int r, int c){
        if(r < 0 || c < 0 ||
           r >= image.length ||
           c >= image[0].length ||
           image[r][c] != oldColor){
            return;
        }
        image[r][c] = newColor;
        for(int[] d : dir){
            dfs(image, r + d[0], c + d[1]);
        }
    }
}
