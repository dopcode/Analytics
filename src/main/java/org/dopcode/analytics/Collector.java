package org.dopcode.analytics;

import java.io.File;
import java.util.List;

/**
 * @author dospluto
 */
public class Collector extends Thread {
    private Repository repository = null;

    public Collector( Repository repository, Connection connection) {
    }

    public void run() {
        File collected = collect();
        List<String> parsed = new Parser().parse(collected);
        repository.append(parsed);
    }

    private File collect() {
        return null;
    }
}
