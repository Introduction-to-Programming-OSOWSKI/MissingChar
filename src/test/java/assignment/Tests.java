package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void test(){
       App.main(null);
       assertEquals("inter", App.missingChar("Winter", 0), "INCORRECT");
       assertEquals("Sumer", App.missingChar("Summer", 2), "INCORRECT");
       assertEquals("Sprin", App.missingChar("Spring", 5), "INCORRECT");
   }

}
