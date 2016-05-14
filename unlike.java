public class unlike implements Command 
{
 
    private facebook  fb;
     
    public unlike (facebook  fb)
    {
        this.fb=fb;
    }

    public void execute() 
    {
        this.fb.unlike();
    }
     	public void undo() 
    {
        this.fb.unlike();
    }
 
}
