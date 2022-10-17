package week3Homework3.core.logging;

public class FileLogger implements Logger {

	@Override
	public void Log(String data) {
		System.out.println("Dosyaya loglandi : " + data);

	}

}
