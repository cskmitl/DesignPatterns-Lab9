// Abstract Visitor
interface ShapeSaveVisitor {
    void saveCircle(Circle circle);

    void saveRectangle(Rectangle rectangle);

    void saveTriangle(Triangle triangle);
}
