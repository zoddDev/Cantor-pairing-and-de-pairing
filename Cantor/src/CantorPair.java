public abstract class CantorPair {
    public static int pair2N (Vector v) {
        if (v.size() == 2) {
            int x = v.get(0);
            int y = v.get(1);
            return  (((x + y)*(x + y + 1)) / 2) + y;
        } else throw new CantorException("Vector must be a pair of 2 natural numbers");
    }

    public static Vector N2pair (int z) {
        if (z >= 0) {

            int secondComponent = z  - pair2N(new Vector(d(z), 0));
            int firstComponent = d(z) - secondComponent;

            return new Vector(firstComponent, secondComponent);
        } else throw new CantorException("Number must be a natural number");
    }

    private static int d (int z) {
        int t = 0;
        while (pair2N(new Vector(t, 0)) <= z) { t++; }
        return t - 1;
    }
}
