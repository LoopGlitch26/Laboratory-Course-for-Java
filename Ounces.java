// Application Ounces converts ounces to cups, quarts, and gallons

/* 1 */ public class Ounces
/* 2 */ {

/* 3 */   public static void main(String[] args)
/* 4 */   {
/* 5 */     final int OUNCES = 9946;
/* 6 */     int cups;
/* 7 */     int quarts;
/* 8 */     int gallons;

/* 9 */     cups = OUNCES / 8;
/* 10 */    System.out.println(OUNCES + " ounces is "  + cups
		           + " cups and "  + OUNCES % 8  + " ounces.");
/* 11 */    quarts = OUNCES / 32;
/* 12 */    System.out.println(OUNCES + " ounces is " + quarts 
		          + " quarts and " + (OUNCES % 32)/8 + " cups "
              + (OUNCES % 32)%8 + " ounces.");
/* 13 */    gallons = OUNCES / 64
/* 14 */    System.out.println(OUNCES + " ounces is "  + gallons 
              + " gallons "  + (OUNCES % 128) % 8 + " cups "
              + (OUNCES / 128 )%8 + " ounces.");
/* 15 */
/* 16 */  }
/* 17 */
