public class App {
    public static void main(String[] args) {
        Mediator mediator = new AlarmMediator();

        Sprinkler sprinkler = new Sprinkler(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);

        mediator.addDevice(sprinkler);
        mediator.addDevice(coffeePot);

        mediator.doAlarm();
    }}

    

    
    
    
        
    

    

    
    
    
    

