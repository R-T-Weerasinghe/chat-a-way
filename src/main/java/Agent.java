public class Agent implements IPublisher, ISubscriber {
    private String name;

    public Agent(String name) {
        this.name = name;
    }

    @Override
    public void publish(String topic, String msg, MessageBroker broker) {
        System.out.println(name + " publishing through " + broker.getName() + " | " + topic + " <-- " + msg);
        broker.facilitate(topic, msg);
    }

    @Override
    public void receive(String topic, String msg) {
        System.out.println(name + " received " + topic + " <-- " + msg);
    }
}
