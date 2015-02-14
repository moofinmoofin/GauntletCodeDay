import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class Frame extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		new Frame().setVisible(true);
	}
	private Frame(){
		super("Gauntlet 2");
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		JMenu firstItem = new JMenu("Scroll");
		JMenuItem save = new JMenuItem("Rest(Save)");
		JMenuItem exit = new JMenuItem("Screem Uncle(Exit Game)");
		exit.addActionListener(this);
	
		bar.add(firstItem);
		
		firstItem.add(save);
		firstItem.add(exit);
		
		setJMenuBar(bar);
	}
	
	public void actionPerformed(ActionEvent a) {
	String name = a.getActionCommand();
		
		if(name.equals("Screem Uncle(Exit Game)")){
			System.out.println();
			System.exit(0);
		}
		else if(name.equals("Rest(Save)")){
			System.out.println();
			
		}
	}
		
	}


