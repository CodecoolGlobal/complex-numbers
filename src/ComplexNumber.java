import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

class ComplexNumber {
    private final double real;
    private final double img;

    public ComplexNumber(double r, double i){
        this.real = r;
        this.img = i;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;

        // HERE --->
        return Double.compare(that.real, real) == 0 && Double.compare(that.img, img) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, img);
    }
}
