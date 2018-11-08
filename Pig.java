class Pig implements Animal//implements Animal 
{     
	String sou="";
	String typ="";
    public Pig()
    {
    	sou="oink";
    	typ="pig";
    }
    public Pig(String pork, String bacon)
    {
    	sou=bacon;
    	typ=pork;
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
