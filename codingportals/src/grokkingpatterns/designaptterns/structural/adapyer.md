Let's take our aircraft example again. Your software only deals with fancy jets but suddenly you are required to adapt your software to cater to a local hot air balloon company. Rewriting your software from scratch is not feasible. To complicate matters the balloon company already provides you with classes that represent hot air balloons which are incompatible with your IAircraft interface, which you use to represent modern aircraft. We'll use the adapter pattern to make the hot air balloon classes work with our existing infrastructure for aircraft. Let's see what the balloon class looks like:

    public class HotAirBalloon {

    String gasUsed = "Helium";

    void fly(String gasUsed) {
        // Take-off sequence based on the kind of feul
        // Followed by more code.  
    }

    // Function returns the gas used by the balloon for flight
    String inflateWithGas() {
        return gasUsed;
    }
    }

    
    public interface IAircraft {
     void fly();
    }
 
public class Adapter implements IAircraft {

    HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon hotAirBalloon) {
        this.hotAirBalloon = hotAirBalloon;
    }

    @Override
    public void fly() {
        String feulUsed = hotAirBalloon.inflateWithGas();
        hotAirBalloon.fly(feulUsed);
    }
}  

 public void main() {

        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Adapter hotAirBalloonAdapter = new Adapter(hotAirBalloon);
        
        hotAirBalloonAdapter.fly();
    }  
    
Bridge Pattern :-

A physical bridge provides connectivity between two points. The bridge pattern describes how to pull apart two software layers fused together in a single class hierarchy and change them into parallel class hierarchies connected by a bridge.



    