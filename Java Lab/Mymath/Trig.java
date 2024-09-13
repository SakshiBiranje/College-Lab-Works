package MyMath;
public class Trig {
     private double angleInDegrees;
    public Trig(double angleInDegrees) 
    {
        this.angleInDegrees = angleInDegrees;
    }
 private double toRadians() 
    {
        return Math.toRadians(angleInDegrees);
    }
 public double getSine() 
   {
        return Math.sin(toRadians());
   }
  public double getCosine() 
    {
        return Math.cos(toRadians());
    }
     public double getTangent() 
     {
        return Math.tan(toRadians());
     }
     public double getSecant() 
     {
        return 1 / getCosine();
    }
     public double getCosecant()
     {
     return 1 / getSine();
     }
public double getCotangent() 
{
return 1 / getTangent();
   }
}