package vehiculos;

public class PruebaVehiculos {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("1234 FCD", "Opel", "Astra", 0, false);
        Vehiculo v2 = new Vehiculo("2345 GDT", "BMW", "S1", 80, false);
        Vehiculo v3 = new Vehiculo("3456 HVF", "Audi", "A3", 100, true);
        
        v1.setVelocidad(50);
        v1.setLuces(true);
        
        System.out.println(v1.toString());
        
        v2.setModelo("X1");
        
        System.out.println(v2.toString());
        
        v3.setLuces(false);
        
        System.out.println(v3.toString());
    }
}
