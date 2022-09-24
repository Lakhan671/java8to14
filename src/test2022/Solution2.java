package test2022;

public class Solution2 {
    public static String maxAreaOfIsland(int[][] grid) {
        String str = "";
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[0][j] == 0) {
                continue;
            }
            str += AreaOfIsland(grid, 0, j, "");
            return str;
        }
        return  str;
    }



    public static String AreaOfIsland(int[][] grid, int i, int j,String str){
        if( i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
            int a=i*grid[0].length+j+1;
            grid[i][j] = 0;
            return a +" " +
                    AreaOfIsland(grid, i, j+1,str)+
                    AreaOfIsland(grid, i+1, j,str)+
                    AreaOfIsland(grid, i-1, j,str) +
                    AreaOfIsland(grid, i, j-1,str) ;

        }
        return str;
    }

    public static void main(String[] args) {
        int[][] mat=new int[][]{
                {1,1,0,0,0,1,1,1,1},
                {0,1,1,0,0,1,0,0,0},
                {0,0,1,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0}

        };
        System.out.println(maxAreaOfIsland(mat));
    }
}
