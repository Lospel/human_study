package exam03_2;

public class Tv {
	String company;
	String name;
	int maxChannel;
	boolean isVoiceRecogition;  //음성인식 여부
	public Tv(String company, String name, int maxChannel, boolean isVoiceRecogition) {
		this.company = company;
		this.name = name;
		this.maxChannel = maxChannel;
		this.isVoiceRecogition = isVoiceRecogition;
	}
}
