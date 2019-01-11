package application;

public class Generate 
{
	
	public static char[] generateTarget()
    {
    	//method generates a random sequence of valid colors and returns as a char[]
    	char[] computersChoice = new char[] {' ', ' ', ' ', ' '};
    	
    	for(int i = 0 ; i < 4; i++)
    	{
    		int randomNum = (int)(Math.random() * 6) + 1;    		
    		
    		switch (randomNum) 
    		{
    			case (1):
    				computersChoice[i] = 'R';
    				break;
    			case (2):
    				computersChoice[i] = 'G';
					break;
    			case (3):
    				computersChoice[i] = 'B';
				 	break;
    			case (4):
    				computersChoice[i] = 'W';
					break;
    			case (5):
    				computersChoice[i] = 'Y';
					break;
    			case (6):
    				computersChoice[i] = 'O';
					break;    			
    		}
    	}    	
    	return computersChoice;    	
    }
	
	
	//gradeGuess compares the target and the guess and 
    // returns a peg array [0]Red pegs, [1]White pegs 
    public static int[] gradeGuess(char[] userGuess, char[] targetSequence)
    {
       int[] pegs = new int[] {0, 0};	//array to return
       
       //these arrays track if a symbol has been matched.        
       char[] playerSymbolMatched = new char[] {' ', ' ', ' ', ' '};      
       char[] targetSymbolMatched = new char[] {' ', ' ', ' ', ' '};	
       
       //First look for red pegs - compare each player guess with corresponding target
       for(int i = 0; i < 4; i++)
       {
    	   //if a match is found: mark each match array with 'M' and increment the red peg count (pegs[0]) 
    	   if (userGuess[i] == targetSequence[i])
    	   {
    		   playerSymbolMatched[i] = 'M';
    		   targetSymbolMatched[i] = 'M';
    		   pegs[0]++;
    	   }
       }               
       
       //Look for white pegs
       //compare each guess symbol with each target symbol
       for(int i = 0; i < 4; i++)	//outer loop iterates through player symbols
       {
    	   for (int j = 0; j < 4; j++)	//inner loop iterates through target symbols
    	   {
    		   //if symbol has been matched already, do nothing    		   
    		   boolean symbolTakenCondition = false;
    		       		   
    		   if (playerSymbolMatched[i] == 'M' || targetSymbolMatched[j] == 'M')
    		   {
    			   symbolTakenCondition = true;
    		   }
    		   
    		   //if there is a match and symbol has not bee taken,
    		   //increment white pegs and mark both symbols as matched.  
    		   if (userGuess[i] == targetSequence[j] && symbolTakenCondition == false) //player symbol matches a target symbol
    		   {    			  
    			   pegs[1]++;
    			   playerSymbolMatched[i] = 'M';
    			   targetSymbolMatched[j] = 'M';    			   
    		   }    		   
    	   }
       }       
       
       return pegs;
    }
    
}
