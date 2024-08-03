// This program demonstrates the use of marker interfaces in Java

// Marker interface (no methods)
interface MyMarkerInterface {}

// Class implementing the marker interface
class MarkerInterfaceImpl implements MyMarkerInterface {
    void display() {
        System.out.println("Class implementing a marker interface.");
    }
}

public class MarkerInterfaceExample {
    public static void main(String[] args) {
        MarkerInterfaceImpl obj = new MarkerInterfaceImpl();
        if (obj instanceof MyMarkerInterface) {
            System.out.println("Object is an instance of MyMarkerInterface.");
        }
        obj.display();
    }
}
