// This class must have the code in the run() method, sub-program/routain to slove the maze;
//   seraches for the Java logo based on the provided path/direction algorithm

public class Direction extends Thread{

	Maze maze;
	Position location;
	
	Direction(Maze maze, Position location) {
		
		this.maze = maze;
		this.location = location;
	}
	
	// this is the code part that needs to be programmed by students to solve the maze 
	// using the provided path/direction algorithm
	public void run(){

		// this is a SAMPLE code of moving the student image in the maze,
		// and updates the information in Position.jav GUI class, append text into the JTextArea object
		// you should delete this code and start your solution, you may just keep the part of updating the information
		// in the Position.java class, appending information into the JTextArea object
		
		while(!maze.isDone()) {
			
			// on odd columns, you must move down to up
			if(maze.getCurrCol()%2==1) {
				if(this.maze.moveUp())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				else {
					// reach the top when moving up on odd columns
					 if(this.maze.getCurrRow()==0) {
						 // try to move to next row
						// if there is an obstacle when moving right, try move down then move right
						 while(!this.maze.moveRight())
						 {
							this.maze.moveDown();
						 }
					// encounter an obstacle when moving up on odd columns
					}else {
						
						 // try to move left (Move LEFT, up, up, and then right)
						 // if there is an obstacle when moving left, try move down then move left
						 while(!this.maze.moveLeft())
						 {
							 this.maze.moveDown();
							
						 }
						 
						 if(maze.isDone()) return;
						 
						 // try to move left (Move left, UP, up, and then right)
						// if there is an obstacle when moving up, try move left then move up
						 while(!this.maze.moveUp())
						 {
							 this.maze.moveLeft();
						 }
						 
						 if(maze.isDone()) return;
						 
						 // try to move left (Move left, up, UP, and then right)
						 // if there is an obstacle when moving up, try move left then move up
						 while(!this.maze.moveUp())
						 {
							 this.maze.moveLeft();
						 }
						 
						 if(maze.isDone()) return;
						 
						 // try to move left (Move left, up, up, and then right)
						 // if there is an obstacle when moving right, try move up then move right
						 while(!this.maze.moveRight())
						 {
							 this.maze.moveUp();
						 }
						
					}
					
				}
				
			}
			// On even columns, you must move up to down
			else
			{
				if(this.maze.moveDown())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				else {
					 // reach the bottom when moving down on even columns
					 if(this.maze.getCurrRow() + 1==this.maze.getHeight()) {
						 // try to move to next row
						// if there is an obstacle when moving right, try move up then move right
						 while(!this.maze.moveRight())
						 {
							 this.maze.moveUp();
						 }
					// encounter an obstacle when moving down on even columns
					}else {
						
						 // try to move right (Move RIGHT, down, down, and then left)
						 // if there is an obstacle when moving right, try move up then move right
						 while(!this.maze.moveRight())
						 {
							 this.maze.moveUp();
						 }
						 
						 if(maze.isDone()) return;
						 
						 // try to move down (Move right, DOWN, down, and then left)
						// if there is an obstacle when moving down, try move right then move down
						 while(!this.maze.moveDown())
						 {
							 this.maze.moveRight();
						 }
						 
						 if(maze.isDone()) return;
						 
						 // try to move down (Move right, down, DOWN, and then left)
						 // if there is an obstacle when moving down, try move right then move down
						 while(!this.maze.moveDown())
						 {
							 this.maze.moveRight();
						 }
						 
						 if(maze.isDone()) return;
						 
						 // try to move left (Move right, down, down, and then LEFT)
						 // if there is an obstacle when moving left, try move down then move left
						 while(!this.maze.moveLeft())
						 {
							 this.maze.moveDown();
						 }
						
					}
				}
				
			}
				
						
		}	
		
		location.textArea.append("Logo Found \n");
		
	}
   
	
}
