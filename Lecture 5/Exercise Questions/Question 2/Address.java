class Address
   
{
    String firstLine; 
    String secondLine; 
    double pincode; 

    Address()
    {
        this.firstLine = firstLine; 
        this.secondLine = secondLine; 
        this.pincode = pincode;
    }
    
    public Address(String firstLine, String secondLine, double pincode)
    {
        this.firstLine = firstLine; 
        this.secondLine = secondLine; 
        this.pincode = pincode; 
    }
    public String getFirstline()
    {
        return this.firstLine;
    }
    public String getSecondLine()
    {
        return this.secondLine;
    }
        public double getPincode()
    {
        return this.pincode;
    }
    public String Address(){
        return "First Line: " + firstLine + "Second Line: " + secondLine + "Pincode:" + pincode; 
    }

}

