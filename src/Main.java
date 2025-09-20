import Factory.ClassicFurnitureFactory;
import Factory.FurnitureFactory;
import Chair.Chair;
import Factory.ModernFurnitureFactory;
import Sofa.Sofa;
public class Main {
    public static void main(String[] args) {
        FurnitureFactory classic = new ClassicFurnitureFactory();
        Chair Cchair = classic.createChair();
        Cchair.sitOn();

        Sofa Csofa = classic.createSofa();
        Csofa.lieOn();

        FurnitureFactory modern = new ModernFurnitureFactory();
        Chair Mchair = modern.createChair();
        Mchair.sitOn();

        Sofa Msofa = modern.createSofa();
        Msofa.lieOn();
    }
}