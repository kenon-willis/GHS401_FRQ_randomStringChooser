package P5E_Project_RandomStringChooser_Template;

public class RandomStringChooser
   {
       
   public String toString()
      {
      String output = new String();
      
      for( String word : wordList )
         {
         output += word + ", ";    
         } // end for
         
      return output;
      } // end method toString
   } // end RandomStringChooser