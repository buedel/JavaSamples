import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 8596532078932398450L;
	
	private DetailsPanel detailsPanel;
	
	public MainFrame(String title) {
		super(title);
		
		// set the layout manager
		setLayout(new BorderLayout());
		
		// Create Swing Components
		final JTextArea textArea = new JTextArea();
		detailsPanel = new DetailsPanel();
		
		detailsPanel.addDetailListener(new DetailListener() {
			public void detailEventOccurred(DetailEvent event) {
				String text = event.getText();
				textArea.append(text);
			}
		});
		
		// Add Swing components to the content pane
		Container c = getContentPane();
		c.add(textArea, BorderLayout.CENTER);
		c.add(detailsPanel, BorderLayout.WEST);
	}

}

// TODO:  Google windows builder pro.  there's an eclipse program for visually creating frames
// There are also some layout managers
// TODO:  google "Swing visual guide" and there's good references to all the various components
