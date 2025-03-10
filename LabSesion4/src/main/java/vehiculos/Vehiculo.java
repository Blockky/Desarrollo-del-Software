package vehiculos;

public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean luces;
    
    public Vehiculo(String matricula, String marca, String modelo, int velocidad, boolean luces) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.luces = luces;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public boolean isLunces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    @Override
    public String toString() {
        String lucestxt;
        if (this.luces) {
            lucestxt = "luces encendidas";
        } else {
            lucestxt = "luces apagadas";
        }
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", luces=" + lucestxt + '}';
    }    
}
