// Concrete Elements
class Rectangle implements Shape {
    private int width, height;
    private int xPos, yPos;

    public Rectangle(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.xPos = x;
        this.yPos = y;
    }

    public int getWidth() {
        return width;
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
        visitor.saveRectangle(this);
    }
}
