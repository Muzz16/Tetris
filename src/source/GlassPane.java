package source;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class GlassPane extends JComponent {

	private BufferedImage border;
	private BufferedImage nexts;
	private BufferedImage hold;
	private JLabel next;
	private Board board;

	public GlassPane() {

		try {
			border = ImageIO.read(GlassPane.class.getResource("/Sprites/border.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			nexts = ImageIO.read(GlassPane.class.getResource("/Sprites/nextText.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			hold = ImageIO.read(GlassPane.class.getResource("/Sprites/holdText.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.getHSBColor((float) 0.53358333, (float) 0.5697, (float) 0.9569));
		g.fillRect(25, 50, 250, 100);
		g.drawImage(border.getScaledInstance(border.getWidth(), border.getHeight(), Image.SCALE_SMOOTH), 0, 117, null);
		g.drawImage(hold.getScaledInstance(hold.getWidth(), hold.getHeight(), Image.SCALE_SMOOTH), 540, 175, null);
		g.drawImage(nexts.getScaledInstance(nexts.getWidth(), nexts.getHeight(), Image.SCALE_SMOOTH), 350, 70, null);

	}

	public static void main(String[] args) {
		new GlassPane();
	}

}
