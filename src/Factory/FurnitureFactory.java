package Factory;


import Chair.Chair;
import Sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
