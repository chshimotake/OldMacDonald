class Chick implements Animal//implements Animal 
{
	String sou="";
	String typ="";
    public Chick()
    {
    	if((int)(Math.random()*2)==0)
    	{
    		sou="cluck";
    	}else{
    		sou="cheep";
    	}
    	typ="chick";
    }
    public Chick(String wings, String thighs, String breasts)
    {
    	typ=wings;
    	if((int)(Math.random()*2)==0)
    	{
    		sou=thighs;
    	}else{
    		sou=breasts;
    	}
    }
    public String getSound()
    {
    	return sou;
    }
    public String getType()
    {
    	return typ;
    }
    //your code here
}
