// Concrete Elements
class Triangle implements Shape {
	private int base, height;
	private int xPos, yPos;

	public Triangle(int base, int height, int x, int y) {
		this.base = base;
		this.height = height;
		this.xPos = x;
		this.yPos = y;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}

	@Override
	public void accept(ShapeSaveVisitor visitor) {
		visitor.saveTriangle(this);
	}
}
