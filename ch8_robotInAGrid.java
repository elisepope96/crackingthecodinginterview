public static void main (String[] args) throws java.lang.Exception
	{
	    boolean[][] maze = new boolean[4][4];
		System.out.println(robot(maze));
	}
	
	public static ArrayList<Point> robot(boolean[][] maze){
	    ArrayList<Point> path = new ArrayList<Point>();
	    if (getPath(maze, maze.length - 1, maze[0].length - 1, path)){
	        return path;
	    }
	    return null;
	    
	}
	public static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path){
	    if (row < 0 || col < 0 || !maze[row][col]){
	        return false;
	    }
	    boolean origin = false;;
	    if (row == 0 && col == 0){
	        origin = true;
	    }
	    if (origin || getPath(maze, row, col - 1, path) || getPath(maze, row - 1, col, path)){
	        Point p = new Point(row, col);
	        path.add(p);
	        return true;
	    }
	    return false;
	}
