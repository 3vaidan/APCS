import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class NamesArray
{
  public static String[] convertToArray(String names)
  {
    String [] alphaNames = new String [20];
    int next = 0;
    int space = 0;
    int nextSpace = names.indexOf(" ");
    
    while(nextSpace != -1)
    {
      String nextName = names.substring(space,nextSpace);
      alphaNames[next] = nextName;
      //addNameToArray(alphaNames,nextName,next); //finds pos for nextWord and inserts
      next++;
      space = nextSpace+1;
      nextSpace = names.indexOf(" ",space+1);
    } 
    return alphaNames;
  }
  public static void addNameToArray(String [] alphaNames, String nextName, int lastPosWithWord)
  {
    int pos=0;
    for(int c = 1; c<lastPosWithWord; c++)
    {
      if(nextName.compareToIgnoreCase(alphaNames[c])<0)
    {
      pos = c;
      break;
    }
    }
    for(int i = alphaNames.length-1; i > pos; i--)
        {
            alphaNames[i] = alphaNames[i-1];
        }
        //replace the initial pos with the new name
        alphaNames[pos] = nextName;
    
    
     for (String nam : alphaNames)
      if(nam != null) System.out.print(nam+" ");
     System.out.println();
    }
        
  public static void main(String[] args) throws IOException
  {
    Scanner keyboard = new Scanner(System.in);
    String fileName;

    // Open input file:
    if (args.length > 0)
      fileName = args[0];
    else
    {
      System.out.print("\nEnter input file name: ");
      fileName = keyboard.nextLine().trim();
    }

    BufferedReader inputFile =
                 new BufferedReader(new FileReader(fileName), 1024);
    String names = inputFile.readLine();
    System.out.println("Original String: "+names);
    
    String [] alphaNames = convertToArray(names);//passes back an array
    
    for (String nam : alphaNames)
      System.out.print(nam+" ");

    // Finish:
    inputFile.close();
    keyboard.close();
    System.out.println("\nDone.");
  }
}
