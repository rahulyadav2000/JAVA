class RelationalandConditionalProgram
{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = 20;
        int value;
        boolean result = x == y;
 
        System.out.println("x == y? " + result);
 
        result = x != y;
 
        System.out.println("x != y? " + result);
 
        result = x > y;
 
        System.out.println("x > y? " + result);
 
        result = x >= y;
 
        System.out.println("x >= y? " + result);
 
        result = x < y;
 
        System.out.println("x < y? " + result);
 
        result = x <= y;
 
        System.out.println("x <= y? " + result);
        
        if ((x > 8) && (y > 8)) {
            System.out.println("Both x and y are greater than 8");
        }
 
        if ((x > 10) || (y > 10)) {
            System.out.println("Either x or y is greater than 10");
            
        value = (x > 10) ? x : y;
 
        System.out.println("value 1 is: " + value);
 
        value = (y > 10) ? x : y;
        System.out.println("value 2 is: " + value);
                    
    }
}
}