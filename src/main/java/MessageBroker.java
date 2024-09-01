import java.util.*;

public class MessageBroker {
    private String name;

    public String getName() {
        return name;
    }
    public MessageBroker(String name) {
        this.name = name;
    }
    private Map<String, List<ISubscriber>> topics = new HashMap<>();

    public void subscribe(String topic, ISubscriber sub) {
        topics.putIfAbsent(topic, new ArrayList<>());
        topics.get(topic).add(sub);
    }

    public void unsubscribe(String topic, ISubscriber sub) {
        if (topics.containsKey(topic)) {
            topics.get(topic).remove(sub);
        }
    }

    public void facilitate(String topic, String msg) {
        if (topics.containsKey(topic)) {
            for (ISubscriber sub : topics.get(topic)) {
                sub.receive(topic, msg);
            }
        }
    }
}
