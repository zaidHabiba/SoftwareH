
public class Main {

	public static void main(String[] args) {
		View v=new View();
		Controller c=new Controller();
		Model m=new Model();
		c.add(m);
		c.add(v);
		v.add(c);
	}

}
