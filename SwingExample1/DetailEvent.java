import java.util.EventObject;

public class DetailEvent extends EventObject {

	private static final long serialVersionUID = 750184156993235175L;

	private String text;
	
	public DetailEvent(Object source, String text) {
		super(source);
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}

}
