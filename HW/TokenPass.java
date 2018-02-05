// CONSTRUCTOR

public TokenPass(int playerCount) {
  board = new int[playercount];
  for(int i = 0; i < board.length; i++)
    board[i] = (int)(Math.random()*10+1);
  currentPlayer = (int)(Math.random()*(playerCount-1));
}

public void distributeCurrentPlayerTokens(){
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int targetIndex = currentPlayer + 1;
        
        while(tokens > 0) {
            if(targetIndex == board.length)
                targetIndex = 0;
            
            board[targetIndex]++;
            tokens--;
            targetIndex++;
        }
}
