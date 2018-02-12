// This class must have the code in the run() method, sub-program/routain to slove the maze;
//   seraches for the Java logo based on the provided path/direction algorithm

public class Direction extends Thread{

	Maze maze;
	Position location;
	
	Direction(Maze maze, Position location) {
		
		this.maze = maze;
		this.location = location;
	}
	
	public void run(){
		while(!maze.isDone()) 
		{
			while (maze.getCurrCol()%2==0)
			{
				if(this.maze.moveDown())
				{
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					if (maze.isDone())return;
				}
				else 
				{
					this.maze.moveRight();{
						if (maze.isDone())return;
					}
				    this.maze.moveDown();{
				    	if (maze.isDone())return;
				    }
				    this.maze.moveDown();{
				    	if (maze.isDone())return;
				    }
				    this.maze.moveLeft();{
				    	if (maze.isDone())return;
				    }
				}
				if( maze.getCurrRow() == 4)
				{
					if(this.maze.moveRight()) 
					{
						location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					if (maze.isDone())return;
					
				    }
			 }
		}		
			while(maze.getCurrCol()%2 == 1 )
			{
				if(this.maze.moveUp())
				{
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					if (maze.isDone())return;
				}
				else {
					this.maze.moveLeft();
					{
						if (maze.isDone())return;
						}
					this.maze.moveUp();
					{
						if (maze.isDone())break;}
					this.maze.moveUp();
					{
						if (maze.isDone())return;
					}
					this.maze.moveRight();
					{
						if (maze.isDone())return;
					}
				}
					
					while( maze.getCurrRow() == 0 && maze.getCurrCol()%2==1)
					{
						if(this.maze.moveRight()) 
						{
							location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
							if (maze.isDone())return;
						}
					}
				}
					
			}

		location.textArea.append("Logo Found \n");
	}
   
	
}
