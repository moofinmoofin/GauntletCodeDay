import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
		super("Gauntlet Returns: The Gauntlet is thrown");
		setSize(700,1000);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton start = new JButton("Start");
		start.setSize(350,500);
		start.addActionListener(this);
		
		JMenuBar bar = new JMenuBar();
		JMenu firstItem = new JMenu("Scroll");
		JMenu secondItem = new JMenu("Pray");
		JMenu thirdItem = new JMenu("Items");
		JMenu fourthItem = new JMenu("Help");
		JMenu fifthItem = new JMenu("Weapon");
		JMenuItem save = new JMenuItem("Rest(Save)");
		JMenuItem exit = new JMenuItem("Screem Uncle(Exit Game)");
		exit.addActionListener(this);
		
		add(start);
		bar.add(firstItem);
		bar.add(secondItem);
		bar.add(thirdItem);
		bar.add(fourthItem);
		bar.add(fifthItem);
		bar.add(fourthItem);
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
		else if(name.equals("Start")){
			System.out.println();
		}
	}
		
	}


