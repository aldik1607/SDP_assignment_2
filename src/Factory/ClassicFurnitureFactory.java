package Factory;

import Chair.Chair;
import Chair.ClassicChair;
import Sofa.Sofa;
import Sofa.ClassicSofa;


public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(){
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa(){
        return new ClassicSofa();
    }
}
