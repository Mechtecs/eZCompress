package tk.mechtecs.ezcompress;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JWindow;
import javax.swing.JSeparator;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class maingui extends JFrame implements ActionListener{

	public static JDialog jw;
	public static JMenuBar jmenubar;
	public static JMenu jfile;
	public static JSeparator jsep;
	public static JMenuItem jopen;
	public static JMenuItem jsave;
	public static JMenuItem jexit;
	public static JPanel jpencode;
	public static JPanel jpdecode;

	public maingui(){
		jw = new JDialog();
		jw.setTitle("eZCompress by Mechtecs / Zelenka");
		jw.setSize(800, 600);
		
		//Border bo = new LineBorder(Color.yellow);
		//jmenubar.setBorder(bo);
		jmenubar = new JMenuBar();
		jfile = new JMenu("File");
		jsep = new JSeparator();
		jopen = new JMenuItem("Open");
		jsave = new JMenuItem("Save");
		jexit = new JMenuItem("Exit");
		jfile.add(jopen);
		jfile.add(jsave);
		jfile.add(jsep);
		jfile.add(jexit);
		jopen.addActionListener(this);
		jsave.addActionListener(this);
		jexit.addActionListener(this);
		jmenubar.add(jfile);
		jw.setJMenuBar(jmenubar);
		jmenubar.setSize(800, 64);
		
		jpencode = new JPanel();
		jpdecode = new JPanel();
		
		JTabbedPane tabpane = new JTabbedPane
	            (JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT );
		tabpane.addTab("Encode", jpencode);
		tabpane.addTab("Decode", jpdecode);
		
		jw.add(tabpane);
		tabpane.setVisible(true);
		
		jw.setVisible(true);
	}
	
	public static void main(String[] args) {
		maingui mg = new maingui();
		
	}
	
	public void actionPerformed (ActionEvent ae){
        // Die Quelle wird mit getSource() abgefragt und mit den
        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
        // der Buttons ist, wird der Text des JLabels entsprechend geändert
        if(ae.getSource() == this.jopen){
            System.out.println(("Button 1 wurde betätigt"));
        }
        else if(ae.getSource() == this.jsave){
        	System.out.println("Button 2 wurde betätigt");
        }
        else if (ae.getSource() == this.jexit){
        	System.exit(0);
        }
    }
	

}
