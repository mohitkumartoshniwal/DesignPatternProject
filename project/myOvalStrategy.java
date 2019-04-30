package designpatternProject;

public class myOvalStrategy implements Strategy {

	Oval arc = new Oval();
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		arc.drawOval();
	}

}
