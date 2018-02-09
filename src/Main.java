
public class Main {

	public static void main(String[] args) {
		View v=new View();
		Controller c=new Controller();
		Model m=new Model();
		c.addModel(m);
		c.addView(v);
		v.addController(c);
	}

}
