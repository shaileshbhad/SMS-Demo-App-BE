package smsdemoapp.utility;

public enum SmsDemoEnum {
	SELDOM("Seldom"),
	YEARLY("Yearly"),
	OFTEN("Often"),
	NEVER("Never"),
	ONCE("Once"),
	WEEKLY("Weekly"),
	MONTHLY("Monthly"),
	DAILY("Daily");
	
	public final String label;
	 
    private SmsDemoEnum(String label) {
        this.label = label;
    }

}
