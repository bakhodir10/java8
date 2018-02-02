package interfac.interface_interface;

public class Main implements Interface1, Interface2 {
    // interface vs interface, the class must implements default method of interfaces
    @Override
    public void method() {
        System.out.println("");
    }
}
