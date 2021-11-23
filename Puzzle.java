import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    private String word;
    private String guessMade;
    
    public Puzzle(){
        word="MYTH";
        guessMade="____";
    }

    public boolean isUnsolved(){
        if(guessMade.equals(word))
        return false;
        else
        return true;
    }
    
    public void show(){
        System.out.println(guessMade);
    }
    
    public String getWord(){
        return word;
    }
    
    public boolean makeGuess(String str){
        str=str.toUpperCase();
        for(int i=0;i<word.length();i++){
            if(guessMade.substring(i,i+1).equals("_")&&word.substring(i,i+1).equals(str)){
                guessMade=guessMade.substring(0,i)+str+guessMade.substring(i+1,word.length());
                return true;
            }
        }
        return false;
    }
}
