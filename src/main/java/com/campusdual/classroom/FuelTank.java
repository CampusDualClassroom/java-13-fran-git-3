package com.campusdual.classroom;

public class FuelTank {

  // Propiedad encapsulada, ahora privada
  private int actualFuel;

  // Constructor para inicializar el tanque
  public FuelTank() {
    this.actualFuel = 0; // Comienza vacío
  }

  // Método para mostrar los detalles del tanque
  public void showDetails() {
    System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
  }

  // Getter para actualFuel
  public int getActualFuel() {
    return this.actualFuel;
  }

  // Setter para actualFuel
  public void setActualFuel(int fuel) {
    if (fuel < 0) {
      System.out.println("No se puede establecer un valor negativo para el combustible.");
    } else {
      this.actualFuel = fuel;
    }
  }
}
