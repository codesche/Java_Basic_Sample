import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Exercise518 implements Iterable<Stock> {

    Map<String, Stock> portfolio = new HashMap<>();

    public void add(Stock stock) {
        portfolio.put(stock.getSymbol(), stock);
    }

    public void add(List<Stock> stocks) {
        for (Stock s : stocks) {
            portfolio.put(s.getSymbol(), s);
        }
    }

    @Override
    public Iterator<Stock> iterator() {
        return portfolio.values().iterator();
    }

    public static void main(String[] args) {
        Exercise518 myPortfolio = new Exercise518();
        myPortfolio.add(new Stock("ORCL", "Oracle", 5010.0));
        myPortfolio.add(new Stock("AAPL", "Apple", 2010.0));
        myPortfolio.add(new Stock("GOOG", "Google", 1100.0));
        myPortfolio.add(new Stock("IBM", "IBM", 510.0));
        myPortfolio.add(new Stock("MCD", "McDonalds", 3010.0));

        System.out.println("legacy for-each loop");
        for (Stock stock : myPortfolio) {
            System.out.println(stock);
        }

        System.out.println("using Java 8 foreach implementation");
        myPortfolio.forEach(s -> System.out.println(s));
    }
}

class UnmodifiableIterator {
    public static <E> Iterator<E> wrap(final Iterator<E> iter) {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public E next() {
                return iter.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove not supported");
            }
        };
    }
}

class Stock {

    private String symbol;
    private String name;
    private double shares;

    public Stock(String symbol, String name, double shares) {
        this.symbol = symbol;
        this.name = name;
        this.shares = shares;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getShares() {
        return shares;
    }

    public String toString() {
        return shares + " shares of " + symbol + " (" + name + ")";
    }
}