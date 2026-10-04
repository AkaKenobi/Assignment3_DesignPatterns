public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape vectorCircle = new Circle(vectorRenderer, 5.0f);
        Shape rasterSquare = new Square(rasterRenderer, 10.0f);

        vectorCircle.draw();
        rasterSquare.draw();

        Shape rasterCircle = new Circle(rasterRenderer, 5.0f);
        rasterCircle.draw();
    }
}