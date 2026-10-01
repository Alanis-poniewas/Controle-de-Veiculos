package br.dev.alanis.controledeveiculos;

/**
 *
 * @author sesi2dia
 */
public class Veiculo {
    
    String placa;
    String marca;
    String modelo;
    int status;
    String motorista;
    
    public Veiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.status = 0;
        this.motorista = "";
    }
    
    public String getPlaca() {
        return placa;
}
    
    public void setPlaca(String placa) {
        this.placa = placa;
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
    
    public int getSatus() {
        return status;
    }
    
    public String getMotorista() {
        return motorista;
    }
    
    public void setMotorista(String motorist) {
        this.motorista = motorista;
    }
    
    public void changeStatus() {
        if(this.status == 0) {
            System.out.println("O motorista está no Pátio!");
        } else if (this.status == 1) {
        System.out.println("O motorista está na Linha(rua)!");
        } else {
            System.out.println("Status não informado!!");
        }
    }
    
    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", status=" + status + ", motorista=" + motorista + '}';
    }
    
}
