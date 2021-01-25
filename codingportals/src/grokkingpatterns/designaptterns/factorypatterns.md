A factory produces goods, and a software factory produces objects. Usually, object creation in Java takes place like so:

SomeClass someClassObject = new SomeClass();

The problem with the above approach is that the code using the SomeClass's object, suddenly now becomes dependent on the concrete implementation of SomeClass. There's nothing wrong with using new to create objects but it comes with the baggage of tightly coupling our code to the concrete implementation class, which is a violation of code to an interface and not to an implementation.

Formally, the factory method is defined as providing an interface for object creation but delegating the actual instantiation of objects to subclasses.

Example

Continuing with our aircraft example scenario, let's assume we are trying to model the F-16 fighter jet. The client code needs to construct the engine object for the fighter jet and fly it. The naive implementation for the class would be something like below:


public class F16 {

    F16Engine engine;
    F16Cockpit cockpit;

    protected void makeF16() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();
    }

    public void fly() {
        makeF16();
        System.out.println("F16 with bad design flying");
    }
}

public class Client {

    public void main() {

        // We instantiate from a concrete class, thus tying
        // ourselves to it
        F16 f16 = new F16();
        f16.fly();
    }
}

--- factory to give objects based upon variants

public class F16SimpleFactory {

    public F16 makeF16(String variant) {

        switch (variant) {
        case "A":
            return new F16A();
        case "B":
            return new F16B();
        default:
            return new F16();
        }
    }
}

---------------------------------------------------

public class F16 {

    IEngine engine;
    ICockpit cockpit;

    protected F16 makeF16() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();
        return this;
    }

    public void taxi() {
        System.out.println("F16 is taxing on the runway !");
    }

    public void fly() {
        // Note here carefully, the superclass F16 doesn't know
        // what type of F-16 variant it was returned.
        F16 f16 = makeF16();
        f16.taxi();
        System.out.println("F16 is in the air !");
    }
}

public class F16A extends F16 {

    @Override
    public F16 makeF16() {
        super.makeF16();
        engine = new F16AEngine();
        return this;
    }
}

public class F16B extends F16 {

    @Override
    public F16 makeF16() {
        super.makeF16();
        engine = new F16BEngine();
        return this;
    }
}

public class Client {
    public void main() {
        Collection<F16> myAirForce = new ArrayList<F16>();
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        myAirForce.add(f16A);
        myAirForce.add(f16B);

        for (F16 f16 : myAirForce) {
            f16.fly();
        }
    }
}


In the previous lesson, we learned the factory method pattern. We saw how we were able to model the variants of the F-16 using the factory method. But there are numerous airplanes other than F-16 that we'll need to represent. Say the client buys a Boeing-747 for the CEO to travel and now wants your software to provide support for this new type of aircraft.

 For instance, F-16 needs an engine, a cockpit, and wings. The Boeing-747 would require the same set of parts but they would be specific to Boeing. Any airplane would require these three related parts but the parts will be plane and vendor specific. Can you see a pattern emerge here? We need a framework for creating the related parts for each airplane, a family of parts for the F-16, a family of parts for the Boeing-747 so on and so forth.
 
 
    public void main() {
 
         F16Cockpit f16Cockpit = new F16Cockpit();
         F16Engine f16Engine = new F16Engine();
         F16Wings f16Wings = new F16Wings();
     
         List<F16Engine> engines = new ArrayList<>();
         engines.add(f16Engine);
         for (F16Engine engine : engines) {
             engine.start();
         }
     }
     
     
 One of the fundamental principles of good object orientated design is to hide the concrete classes and expose interfaces to clients. An object responds to a set of requests, these requests can be captured by an interface which the object's class implements. The client should know what requests an object responds to rather than the implementation.
     
 In our example, we can create an interface IEngine, which exposes the method start(). The F16Engine class would then change like so:
 
    public interface IEngine {

    void start();
    }

    public class F16Engine implements IEngine {

    @Override
    public void start() {
        System.out.println("F16 engine on");
    }
    }     
    
    public void main() {
         IEngine f16Engine = new F16Engine();
         List<IEngine> engines = new ArrayList<>();
         engines.add(f16Engine);
         for (IEngine engine : engines) {
             engine.start();
         }
     }   
 
    public class F16Factory {
 
     public IEngine createEngine() {
         return new F16Engine();
     }
 
     public IWings createWings() {
         return new F16Wings();
     }
 
     public ICockpit createCockpit() {
         return new F16Cockpit();
     }
    }    
    
    
    public void main(F16Factory f16Factory) {
            IEngine f16Engine = f16Factory.createEngine();
            List<IEngine> engines = new ArrayList<>();
            engines.add(f16Engine);
            for (IEngine engine : engines) {
                engine.start();
            }
        }
        
 Factory of Factories

Wouldn't it be great if we could use the same client snippet for other aircraft such as Boeing747 or a Russian MiG-29? If we could have all the factories being passed into the client agree to implement the createEngine() method, then the client code will keep working for all kinds of aircraft factories. But all the factories must commit to a common interface whose methods they'll implement and this common interface will be the abstract factory.

    public interface IAircraftFactory {

    IEngine createEngine();

    IWings createWings();

    ICockpit createCockpit();
    }    
    
Note that we mean a Java abstract class or a Java interface when referring to "interface". 

    public class F16Factory implements IAircraftFactory {

    @Override
    public IEngine createEngine() {
        return new F16Engine();
    }

    @Override
    public IWings createWings() {
        return new F16Wings();
    }

    @Override
    public ICockpit createCockpit() {
        return new F16Cockpit();
    }
    }

    public class Boeing747Factory implements IAircraftFactory {

    @Override
    public IEngine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public IWings createWings() {
        return new Boeing747Wings();
    }

    @Override
    public ICockpit createCockpit() {
        return new Boeing747Cockpit();
    }
    
    
    }        
     
     public class Client {
     
         public void main() {
     
             // Instantiate a concrete factory for F-16
             F16Factory f16Factory = new F16Factory();
             
             // Instantiate a concrete factory for Boeing-747
             Boeing747Factory boeing747Factory = new Boeing747Factory();
             
             // Lets create a list of all our airplanes
             Collection<Aircraft> myPlanes = new ArrayList<>();
             
             // Create a new F-16 by passing in the f16 factory
             myPlanes.add(new Aircraft(f16Factory));
     
             // Create a new Boeing-747 by passing in the boeing factory
             myPlanes.add(new Aircraft(boeing747Factory));
     
             // Fly all your planes
             for (Aircraft aircraft : myPlanes) {
                 aircraft.fly();
             }
     
         }
     }
     
    public class Aircraft {
    
        IEngine engine;
        ICockpit cockpit;
        IWings wings;
        IAircraftFactory factory;
    
        public Aircraft(IAircraftFactory factory) {
            this.factory = factory;
        }
    
        protected Aircraft makeAircraft() {
            engine = factory.createEngine();
            cockpit = factory.createCockpit();
            wings = factory.createWings();
            return this;
        }
    
        private void taxi() {
            System.out.println("Taxing on runway");
        }
    
        public void fly() {
            Aircraft aircraft = makeAircraft();
            aircraft.taxi();
            System.out.println("Flying");
        }
    }     
     
     
