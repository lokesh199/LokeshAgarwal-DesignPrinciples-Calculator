package graphicalUserInterface;

import java.awt.TextField;

public class CustomTextField extends TextField {
	public CustomTextField(int x,int y,int w,int h,String t) {
		this.setBounds(x, y, w, h);
		this.setText(t);
		this.setVisible(true);
	}
}
