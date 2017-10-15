package event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	public KeyEventTest(){
		panel = new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("문자를 입력하시오:"));
		field = new JTextField(10);
		panel.add(field);
		area = new JTextArea(3, 30);
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		field.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyEventTest();
	}
	
	public void KeyTyped(KeyEvent e){
			display(e, "Key Typed");
		}
	
	public void KeyPressed(KeyEvent e){
			display(e, "Key Pressed");
		}
	
	public void KeyReleased(KeyEvent e){
			display(e, "Key Relaesed");
		}
	
	protected void display(KeyEvent e, String s){
			char c =e.getKeyChar();
			int KeyCode = e.getKeyCode();
			String modifiers = "Alt: "+e.isAltDown()+"Ctrl: " +e.isControlDown()+"Shift: "+e.isShiftDown();
			area.append(""+s+"문자 "+c+"(코드:" +KeyCode+")"+modifiers+"\n" );
		}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

