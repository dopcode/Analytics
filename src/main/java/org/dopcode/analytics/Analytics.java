package org.dopcode.analytics;

/**
 * @author dospluto
 */
public class Analytics {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Connection connection = new Connection();
        new Collector(repository, connection).start();
        new Indexer(repository).start();
    }
}
