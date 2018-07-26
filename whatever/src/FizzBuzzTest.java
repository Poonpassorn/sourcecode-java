import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void เลขหนึ่งต้องได้ค่าเป็นหนึ่ง (   ) {
       FizzBuzz fz = new FizzBuzz();
       String result = fz.sendAndReturn(1);
       assertEquals("1", result);
       
    }
    
    @Test
   public void เลขสองได้สองได้สอง () {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(2);
        assertEquals("2", result);
   }
    
    @Test
    public void เลขสองได้สามได้fizz() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(3);
         assertEquals("Fizz", result);
    }
    
    @Test
    public void fouroffour() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(4);
         assertEquals("4", result);
    }
    
    @Test
    public void fiveofffive() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(5);
         assertEquals("Buzz", result);
    }

    @Test
    public void sixoffsix() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(6);
         assertEquals("Fizz", result);
    }

    @Test
    public void sevenoffseven() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(7);
         assertEquals("7", result);
    }
    @Test
    public void eightofeight() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(8);
         assertEquals("8", result);
    }

    @Test
    public void nineoffnine() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(9);
         assertEquals("Fizz", result);
    }
    
    @Test
    public void tenofften() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(10);
         assertEquals("Buzz", result);
    }
    
    @Test
    public void num11off11() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(11);
         assertEquals("11", result);
    }
    
    @Test
    public void num12off12() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(12);
         assertEquals("Fizz", result);
    }
    @Test
    public void num13off13() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(13);
         assertEquals("13", result);
    }
    
    @Test
    public void num14off14() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(14);
         assertEquals("14", result);
    }
    @Test
    public void num15off15() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(15);
         assertEquals("FizzBuzz", result);
    }
    
    @Test
    public void num16off16() {
         FizzBuzz fz = new FizzBuzz();
         String result = fz.sendAndReturn(16);
         assertEquals("16", result);
    }
}
