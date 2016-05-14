public class unfrnd implements Command 
{
 
    private facebook  fb;
     
    public unfrnd (facebook  fb)
    {
        this.fb=fb;
    }
    public void execute() 
    {
        this.fb.unfriend();
    }
    public void undo() 
    {
        this.fb.unfriend();
    }
 
}
