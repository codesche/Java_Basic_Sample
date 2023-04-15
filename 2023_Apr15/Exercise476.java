import java.util.*;

public class Exercise476 {
    public static void main(String[] args) {
        Collection list1 = java.util.Arrays.asList("asdf", "java2s.com");
        Collection list2 = java.util.Arrays.asList("asdf", "java2s.com");
        System.out.println(conjunctCollections(list1, list2));
    }

    public static <T> List<T> conjunctCollections(
            final Collection<T> list1, final Collection<T> list2) {
        final HashSet<T> s1 = new HashSet<T>(list1);
        s1.retainAll(list2);
        return new ArrayList<T>(s1);
    }

    public static <T> List<T> asList(final Iterable<? extends T> iterable) {
        return (iterable instanceof Collection) ? new LinkedList<T>(
                (Collection<? extends T>) iterable) : new LinkedList<T>() {
            private static final long serialVersionUID = 3109256773218160485L;
            {
                if (iterable != null) {
                    for (final T t : iterable) {
                        add(t);
                    }
                }
            }
        };
    }

    public static <T> List<T> asList(final T t, final T... ts) {
        final ArrayList<T> list = new ArrayList<T>(ts.length + 1);
        list.add(t);
        Collections.addAll(list, ts);
        return list;
    }

}
