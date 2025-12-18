package validation;

import javax.ejb.Stateless;

@Stateless
public class PointValidator {

    public void validate(Integer x, Double y, Double r) {
        if (x == null || y == null || r == null) {
            throw new IllegalArgumentException("Координаты не заданы");
        }
        if (x < -3 || x > 3) {
            throw new IllegalArgumentException("Некорректное X");
        }
        if (y < -3.0 || y > 3.0) {
            throw new IllegalArgumentException("Некорректное Y");
        }
        if (r < 2 || r > 5) {
            throw new IllegalArgumentException("Некорректное R");
        }
    }
}
