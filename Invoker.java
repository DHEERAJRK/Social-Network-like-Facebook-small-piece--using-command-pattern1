public class Invoker 
{
 	private Command lastcommand;
    public Command command;
     
    public Invoker(Command c){
        this.command=c;
        lastcommand =c;
    }
     
    public void execute(){
        this.command.execute();
    }

}
