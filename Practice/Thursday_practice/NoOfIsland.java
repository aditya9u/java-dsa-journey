public class NoOfIsland {    
        // Implement this: return the number of islands in the input grid.
        // grid is a 2D char array with '1' for land and '0' for water.
        static int numIslands(char[][] grid) {
            // TODO: implement
            if (grid == null || grid.length == 0) {
                return 0;
            }
            int count=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]=='1'){
                        dfs(grid,i,j);
                        count++;
                    }
                }
            }

            return count;
        }
    
        // Helper to mark/visit the entire island starting at (r, c).
        // Use DFS or BFS. Modify grid (e.g., mark visited cells as '0') or
        // maintain a visited array.
        private static void dfs(char[][] grid, int r, int c) {
            // TODO: implement
            if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0'){
                return;
            }
            if(grid[r][c]=='1') grid[r][c]='0';
            dfs(grid,r+1,c);
            dfs(grid,r-1,c);
            dfs(grid,r,c+1);
            dfs(grid,r,c-1);
            
        }
    
        public static void main(String[] args) {
            // Example 1
            char[][] grid1 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
            };
            System.out.println("Expected 1, got: " + numIslands(grid1));
    
            // Example 2
            char[][] grid2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
            };
            System.out.println("Expected 3, got: " + numIslands(grid2));
    
            // Extra tests
            char[][] grid3 = {
                {'1','0','1'},
                {'0','1','0'},
                {'1','0','1'}
            };
            System.out.println("Expected 5, got: " + numIslands(grid3));
    
            char[][] grid4 = {
                {'0','0','0'},
                {'0','0','0'}
            };
            System.out.println("Expected 0, got: " + numIslands(grid4));
        }
    }
