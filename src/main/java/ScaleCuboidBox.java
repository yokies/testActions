public class ScaleCuboidBox {
    private double length;
    private double width;
    private double height;

    ScaleCuboidBox(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getLength() {
        return this.length;
    }

    double getWidth() {
        return this.width;
    }

    double getHeight() {
        return this.height;
    }

    double getVolume() {
        return this.height * this.length * this.width;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }
}
