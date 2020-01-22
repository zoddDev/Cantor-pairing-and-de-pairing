import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringJoiner;

public class Vector {

    private ArrayList<Integer> values;

    public Vector (int... values) {
        setValues(values);
    }

    public Vector (Vector v, int start, int end) {
        this.values = new ArrayList<>();
        for (; start < end; start++) { this.values.add(v.get(start)); }
    }

    public void setValues (int[] values) {
        this.values = new ArrayList<>();
        for (int v : values) {
            if (v >= 0) this.values.add(v);
            else throw new VectorException("Values must be natural numbers");
        }
    }

    public int last () { return get(size() - 1); }

    public int size () {
        return values.size();
    }

    public int get (int i) { return values.get(i); }

    public ArrayList<Integer> getValues () { return values; }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "(", ")");
        for (int v : values) sj.add(Integer.toString(v));

        return sj.toString();
    }
}
