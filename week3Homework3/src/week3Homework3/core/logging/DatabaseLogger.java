package week3Homework3.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void Log(String data) {
		System.out.println("Database loglandi : " + data);

	}

}
