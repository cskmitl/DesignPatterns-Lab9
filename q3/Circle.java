// Concrete Elements
class Circle implements Shape {
	private double radius;
	private int xPos, yPos;

	public Circle(double radius, int x, int y) {
		this.radius = radius;
		this.xPos = x;
		this.yPos = y;
	}

	public double getRadius() {
		return radius;
	}

	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}

	@Override
	public void accept(ShapeSaveVisitor visitor) {
		visitor.saveCircle(this);
	}
}
