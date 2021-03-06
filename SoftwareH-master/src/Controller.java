
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {


	
	Model model;
	View view;
	
	public void addModel(Model m){
		model=m;
	}
	
	public void addView(View v){
		view=v;
		
		
	}

	public boolean addActionPerformed(ActionEvent evt,String s1,String s2) {
		
		if(checkText(s1)&&checkText(s2)){
			double k=model.add(getNumber(s1), getNumber(s2));
			model.setResult(k);
			return true;
		}
		else
		{
			view.doError("Input Error");
			return false;
		}
	}
	
	public boolean subActionPerformed(ActionEvent evt,String s1,String s2) {
		
		if(checkText(s1)&&checkText(s2)){
			double k=model.sub(getNumber(s1), getNumber(s2));

			model.setResult(k);
			
			return true;
		}
		else
		{
			view.doError("Input Error");
			return false;
		}
		
	}	
	
	public boolean mulActionPerformed(ActionEvent evt,String s1,String s2) {
		
		if(checkText(s1)&&checkText(s2)){
			double k=model.mul(getNumber(s1), getNumber(s2));
			model.setResult(k);
			return true;
		}
		else
		{
			view.doError("Input Error");
			return false;
		}
	}
	
	public boolean divActionPerformed(ActionEvent evt,String s1,String s2) {
		
		if(checkText(s1)&&checkText(s2)){
			try{
				if(getNumber(s2)==0){
					view.doError("Infinity");
					return false;
				}
				double k=model.div(getNumber(s1), getNumber(s2));
				model.setResult(k);
			return true;
			}
			catch(Exception hhh){
				view.doError("Infinity");
				return false;
			}
		}
		else
		{
			view.doError("Input Error");
			return false;
		}
	}
	
	public boolean modActionPerformed(ActionEvent evt,String s1,String s2) {
		
		if(checkText(s1)&&checkText(s2)){
			try{
			double k=model.mod(getNumber(s1), getNumber(s2));
			model.setResult(k);
			return true;
			}
			catch(Exception f){
				view.doError(" Div by zero");
				return false;
			}
		}
		else{
			view.doError("Input Error");
			return false;
		}
		
	}
	
	public boolean sqrtActionPerformed(ActionEvent evt,String s1) {
		
		if(checkText(s1)){
			try {
				if(getNumber(s1)<0){
					view.doError("Error Value -ve");
					return false;
				}
				double k=model.sqr(getNumber(s1));
				model.setResult(k);
				return true;
			} 
			catch (Exception e) {
				view.doError("Error Value -ve");
				return false;
			}
		}
		else
		{
			view.doError("Input Error");
			return false;
		}
		
	}
	
	public boolean checkText(String h){
		try{
		Double.valueOf(h);
		return true;
		}
		catch(Exception g){
			return false;
		}
	}
	
	public double getNumber(String h){
		return Double.valueOf(h);
	}
	
	public double getResult(){
		return model.getResult();
	}

	


	
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
		if (evt.getSource()==view.add){
			
			if(addActionPerformed(evt,view.Text1.getText(),view.Text2.getText())){
        		view.Update(""+getResult());
        	}
			
		}
		
		else if(evt.getSource()==view.sub){
			if(subActionPerformed(evt,view.Text1.getText(),view.Text2.getText())){
				view.Update(""+getResult());
        	}
		}
		
		else if (evt.getSource()==view.mul){
			if(mulActionPerformed(evt,view.Text1.getText(),view.Text2.getText())){
				view.Update(""+getResult());
        	}	
		}
		
		else if( evt.getSource()==view.div){
			if(divActionPerformed(evt,view.Text1.getText(),view.Text2.getText())){
				view.Update(""+getResult());
        	}
		}
		
		else if(evt.getSource()==view.sqrt){
			if(sqrtActionPerformed(evt,view.Text1.getText())){
				view.Update(""+getResult());
        	}
			
		}
		
		else if (evt.getSource()==view.mod){
			if(modActionPerformed(evt,view.Text1.getText(),view.Text2.getText())){
				view.Update(""+getResult());
        	}
		}
		
		
		
	}
	

}
