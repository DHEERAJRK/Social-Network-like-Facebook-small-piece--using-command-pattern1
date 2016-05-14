public class frndreq implements Command 
{
 
    private facebook  fb;
     
    public frndreq (facebook  fb)
    {
        this.fb=fb;
    }

    public void execute() 
    {
        this.fb.friend();
    }
 	
 	public void undo() 
    {
        this.fb.friend();
    }
}
