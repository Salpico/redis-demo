package de.fhl.datenmanagement;

import redis.clients.jedis.Jedis;

/**
 * An example class to show, how to use
 * a Java library ("Jedis") with Redis.
 *
 * @author Bengt Claas Rhodgeß, Marc-Niclas Harm
 *
 */
public class RedisDemo {

    public static void main(String[] args) throws InterruptedException {
        singleRedisServer();
        //clusterRedisInstances();
    }

    private static void singleRedisServer() throws InterruptedException {
        /*
            Prerequisites:
         */
        // `docker run --name redis-demo -p 6379:6379 -d redis`
        // `docker exec -it redis-demo bash`
        // `redis-cli`

        // Create a "Jedis" instance, which connects to localhost.
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        // CMD: Show key "datenmanagement" is not set (nil).
        // `get datenmanagement`

        // Set key "datenmanangement" to value "aufgabe-6".
        jedis.set("datenmanagement", "aufgabe-6");

        // CMD: Show key "datenmanagement" is set to "aufgabe-6".
        // `get datenmanagement`

        // Get value of key via Jedis.
        String datenmanagement = jedis.get("datenmanagement");
        System.out.printf("Value is: %s\n", datenmanagement);

        // Set expiration to 3 seconds.
        jedis.expire("datenmanagement", 3);

        // Check if value of key exists.
        boolean datenmanagementExists = jedis.exists("datenmanagement");
        System.out.printf("Value exists: %s\n", datenmanagementExists);

        // Sleep 3 seconds.
        System.out.println("Waiting 3 seconds...");
        Thread.sleep(3000);

        // Check if value of key doesn't exist anymore.
        datenmanagementExists = !jedis.exists("datenmanagement");
        System.out.printf("Value was removed: %s\n", datenmanagementExists);
    }

    private static void clusterRedisInstances() {

    }

}
