
public class Model {
	
	private double result;
	
	public double getResult(){
		return result;
	}
	
	public void setResult(double g){
		result=g;	
	}
	
    public double add(double x,double y){      
        return x+y;
    }
    
    
    public double sub(double x,double y){      
        return x-y;
    }
     
    
    public double mul(double x,double y){      
        return x*y;
    }
    
    
    public double div(double x,double y) throws Exception{      
           return x/y;
    }
    
    
    public double sqr(double x)  throws Exception{
           return Math.sqrt(x);
          
    }
       
    
    public int mod(double x,double y)  throws Exception{
           return (int)x%(int)y;               
    }
    
    
    
	
}
