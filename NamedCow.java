class NamedCow extends Cow
{
	String nem="";
	public NamedCow()
    {
    	nem="Cowlvin";
    	sou="moo";
    	typ="cow";
    }
    public NamedCow(String beef, String kobe, String steak)
    {
    	typ=beef;
    	sou=steak;
    	nem=kobe;
    }
    public String getName()
    {
    	return nem;
    }
}