class gameEntry {
    private String Name ;
    private int Score ;
    public gameEntry(String Name,int Score){
        this.Name=Name;
        this.Score=Score;
    }
    public int getScore(){
        return Score;
    }
    public String getName(){
        return Name;
    }
    public String gameEntryCard(){
        return "Name : "+Name+" Score : "+Score ;
    } 
}

class scoreCard {
    private int entryCounter = 0;
    gameEntry board[];
    public scoreCard(int Capacity){
        board=new gameEntry[Capacity];
    }
    public void addScore(gameEntry entry){
     if ( entryCounter < board.length ||board[entryCounter-1].getScore() < entry.getScore()){
        if(entryCounter < board.length){
                      entryCounter += 1;       
                    }
        int j = entryCounter -1 ;
        while(j > 0 && board[j-1].getScore() < entry.getScore()){
         board[j] = board[j-1];
         j -= 1;                    
        }
        board[j]=entry;
     }       
    }
    public void scoreCardInfo(){
    for(int counter =0 ;counter<entryCounter;counter+=1)
    System.out.println("Position: "+(counter+1)+" Name : "+board[counter].getName()+" Score : " + board[counter].getScore() );
    }
    public gameEntry removeScore(int index) throws ArrayIndexOutOfBoundsException{
        if(index < 0 ||index > entryCounter){
          throw new ArrayIndexOutOfBoundsException("Index : "+index+" is Invalid!!!");
        }
        gameEntry temp =board[index];
        for(int left_shifter = index ; left_shifter < entryCounter-1 ; left_shifter +=1){
            board[left_shifter]=board[left_shifter+1];
        }
        board[entryCounter-1]=null;
        entryCounter-=1;
        return temp;
    }
}

//Driver Testing code  
public class game {
    public static void main(String args[]){
       scoreCard Pubg_Global_Top_5 = new scoreCard(5);
       Pubg_Global_Top_5.addScore(new gameEntry("Umit",4700));
       Pubg_Global_Top_5.addScore(new gameEntry("Rishav",4000));
       Pubg_Global_Top_5.addScore(new gameEntry("Shivam",4300));
       Pubg_Global_Top_5.addScore(new gameEntry("Alena",4500));
       Pubg_Global_Top_5.addScore(new gameEntry("Rakesh",4501));
       Pubg_Global_Top_5.addScore(new gameEntry("Ananya",4404));
       Pubg_Global_Top_5.removeScore(0);
       Pubg_Global_Top_5.scoreCardInfo();

    }
}