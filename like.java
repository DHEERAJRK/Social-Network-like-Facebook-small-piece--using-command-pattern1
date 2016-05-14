public class like implements Command 
{
 
    private facebook  fb;
     
    public like (facebook  fb)
    {
        this.fb=fb;
    }

    public void execute() 
    {
        this.fb.like();
    }
 	
 	public void undo() 
    {
        this.fb.like();
    }
 
}
