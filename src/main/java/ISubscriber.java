public interface ISubscriber {
    void receive(String topic, String msg);
}
