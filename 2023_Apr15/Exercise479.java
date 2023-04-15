import java.util.*;

public class Exercise479 {
    /**
     * Gets a {@code Map} containing all of the entries from the maps provided.
     *
     * @param map1 the first {@code Map} instance to combine
     * @param map2 the second {@code Map} instance to combine
     *
     * @return a new {@code Map} containing all of the entries
     */
    static Map<String, String> union(final Map<String, String> map1,
                                     final Map<String, String> map2) {
        final List<Map<String, String>> maps = new ArrayList<Map<String, String>>();
        maps.add(map1);
        maps.add(map2);
        return unionMaps(maps);
    }

    /**
     * Gets a {@code Map} containing all of the entries from the maps provided.
     *
     * @param map1 the first {@code Map} instance to combine
     * @param map2 the second {@code Map} instance to combine
     * @param map3 the third {@code Map} instance to combine
     *
     * @return a new {@code Map} containing all of the entries
     */
    static Map<String, String> union(final Map<String, String> map1,
                                     final Map<String, String> map2, final Map<String, String> map3) {
        final List<Map<String, String>> maps = new ArrayList<Map<String, String>>();
        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        return unionMaps(maps);
    }

    /**
     * Gets a {@code Set} containing all of the elements from the sets provided
     *
     * @param set1 the first {@code Set} instance to combine
     * @param set2 the second {@code Set} instance to combine
     *
     * @return a new {@code Set} containing all of the elements
     */
    static Set<String> union(final Set<String> set1, final Set<String> set2) {
        final List<Set<String>> sets = new ArrayList<Set<String>>();
        sets.add(set1);
        sets.add(set2);
        return unionSets(sets);
    }

    /**
     * Gets a {@code Map} containing all of the entries from the maps provided.
     *
     * @param maps the {@code Map} instances to combine
     *
     * @return a new {@code Map} containing all of the entries
     */
    private static Map<String, String> unionMaps(
            final List<Map<String, String>> maps) {
        final Map<String, String> union = new HashMap<String, String>();
        for (Map<String, String> map : maps) {
            union.putAll(map);
        }
        return union;
    }

    /**
     * Gets a {@code Set} containing all of the entries from the sets provided.
     *
     * @param sets the {@code Set} instances to combine
     *
     * @return a new {@code Set} containing all of the elements
     */
    private static Set<String> unionSets(final List<Set<String>> sets) {
        final Set<String> union = new HashSet<String>();
        for (final Set<String> set : sets) {
            union.addAll(set);
        }
        return union;
    }
}
