public interface IPublisher {
    void publish(String topic, String msg, MessageBroker broker);
}
