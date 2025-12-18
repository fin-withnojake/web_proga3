package calculate;

import javax.ejb.Stateless;

@Stateless
public class AreaChecker {

    public boolean isHit(int x, double y, Double r) {

        // 2 четверть - треугольник под y = x + r
        if (x <= 0 && y >= 0) {
            return x >= -r && y <= r && y <= x + r;
        }

        // 4 четверть - прямоугольник
        if (x >= 0 && y <= 0) {
            return x <= r && y >= -r;
        }

        // 1 четверть - кусок круга радиусом r
        if (x >= 0 && y >= 0) {
            return (x * x + y * y) <= r * r;
        }

        return false;
    }
}
