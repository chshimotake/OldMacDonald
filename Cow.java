class Cow implements Animal//implements Animal 
{
	String sou="";
	String typ="";
    public Cow()
    {
    	sou="moo";
    	typ="cow";
    }
    public Cow(String beef, String steak)
    {
    	sou=steak;
    	typ=beef;
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
