import java.util.Collection;
import java.util.Iterator;

public class R02_XP01_J {
    public static int cardinality(Object obj, final Collection<?> col) {
        int count = 0;
        if (col == null) {
            return count;
        }
        Iterator<?> it = col.iterator();
        while (it.hasNext()) {
            Object elt = it.next();
            if ((obj == null && elt == null) || (obj != null && obj.equals(elt))) { // Null pointer dereference
                count++;
            }
        }
        return count;
    }
}
