public class ChatApp {
    public static void main(String[] args) {
        MessageBroker broker1 = new MessageBroker("br1");

        Agent alice = new Agent("Alice");
        Agent bob = new Agent("Bob");

        broker1.subscribe("general", alice);
        broker1.subscribe("general", bob);


        alice.publish("general", "Hi there!", broker1);
        bob.publish("general", "Hello, how can I assist you today?", broker1);
        alice.publish("general", "Tell me a joke!", broker1);
        bob.publish("general", "Why did the chicken join the band? Because it had the drumsticks!", broker1);
    }
}
