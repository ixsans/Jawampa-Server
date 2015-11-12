package ws.wamp.jawampa.examples;

public class Constants {
	public static final String CHAT_SERVER_URL = "ws://192.168.10.64:8080/ws1";
    public static final String REALM = "realm1";

    public static final String EVENT_BASE = "com.jawampadroid.topic";
    public static final String EVENT_LOGIN = EVENT_BASE + ".login";
    public static final String EVENT_NEW_MESSAGE = EVENT_BASE + ".message";
    public static final String EVENT_TYPING = EVENT_BASE + ".typing";
}
