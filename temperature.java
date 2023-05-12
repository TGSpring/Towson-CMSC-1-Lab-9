public class temperature
{  
  
  private double temp;
  
  public temperature(double temp)
  {
    super();
    this.temp = temp;
  }
  
  public void setFaherenheit(double temp)
  {
    this.temp = temp;
  }
  
  public double getFahrenheit()
  {
    return temp;
  }
  
  public double getCelsius()
  {
    double cel = (5.0/9) * (temp - 32);
    return cel;
  }
  public double getKelvin()
  {
    double kel = ((5/9) * (temp - 32)) + 273; 
    return kel;
  }
}