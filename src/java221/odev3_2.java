package java221;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;

public class odev3_2 extends JFrame {

	private JPanel Jpanel;
	private JTextField txtvize;
	private JSlider sliderf;
	private JTextField txtfinal;
	private JTextField textort;

	int v, f;
	float ortalama;
	private JLabel lblNewLabel;
	private JLabel lblFinal;
	private JLabel lblOrtalama;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev3_2 frame = new odev3_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public odev3_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Jpanel = new JPanel();
		Jpanel.setBackground(new Color(51, 153, 153));
		Jpanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(Jpanel);
		Jpanel.setLayout(null);

		sliderf = new JSlider();
		sliderf.setBackground(new Color(47, 79, 79));
		sliderf.setValue(0);

		sliderf.setPaintLabels(true);
		sliderf.setMajorTickSpacing(20);
		sliderf.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sliderf.setPaintTicks(true);
		sliderf.setMinorTickSpacing(5);
		sliderf.setToolTipText("");
		sliderf.setBounds(77, 114, 357, 45);
		Jpanel.add(sliderf);

		JSlider sliderv = new JSlider();
		sliderv.setBackground(new Color(47, 79, 79));
		sliderv.setPaintTicks(true);
		sliderv.setValue(0);

		sliderv.setToolTipText("");
		sliderv.setPaintLabels(true);
		sliderv.setMinorTickSpacing(5);
		sliderv.setMajorTickSpacing(20);
		sliderv.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sliderv.setBounds(77, 41, 357, 45);
		Jpanel.add(sliderv);

		JSlider sliderort = new JSlider();
		sliderort.setBackground(Color.RED);
		sliderort.setSnapToTicks(true);
		sliderort.setValue(0);

		JLabel drmlbl = new JLabel("DURUM");
		drmlbl.setBackground(new Color(153, 153, 153));
		drmlbl.setFont(new Font("Dialog", Font.BOLD, 14));

		drmlbl.setBounds(208, 234, 55, 27);
		Jpanel.add(drmlbl);

		txtfinal = new JTextField();
		txtfinal.setBackground(new Color(0, 102, 102));
		txtfinal.setText("0");
		txtfinal.setFont(new Font("Dialog", Font.BOLD, 17));
		txtfinal.setToolTipText("");
		txtfinal.setColumns(10);
		txtfinal.setBounds(10, 114, 55, 45);
		Jpanel.add(txtfinal);

		textort = new JTextField();
		textort.setBackground(new Color(255, 0, 0));
		textort.setFont(new Font("Dialog", Font.BOLD, 17));
		textort.setToolTipText("");
		textort.setText("0");
		textort.setColumns(10);
		textort.setBounds(10, 186, 55, 45);
		Jpanel.add(textort);

		v = f = 0;

		sliderv.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				v = sliderv.getValue();
				f = sliderf.getValue();
				
				ortalama = (float) (v * 0.4 + f * 0.6);

				// txtvize.setBackground(new Color(r,g,b));

				int yeniort = (int) ortalama;
				sliderort.setValue(yeniort);

				if (yeniort >= 60) {
					sliderort.setBackground(Color.GREEN);
					textort.setBackground(Color.green);
					txtvize.setBackground(Color.yellow);
					txtfinal.setBackground(Color.yellow);
					drmlbl.setText("GEÇTÝ");
					drmlbl.setForeground(Color.green);
				} else {
					sliderort.setBackground(Color.red);
					textort.setBackground(Color.red);
					txtvize.setBackground(new Color(0, 102, 102));
					txtfinal.setBackground(new Color(0, 102, 102));
					drmlbl.setText("KALDI");
					drmlbl.setForeground(Color.RED);
				}

				txtvize.setText(String.valueOf(v));
				txtfinal.setText(String.valueOf(f));
				textort.setText(String.valueOf(ortalama));

			}
		});

		sliderf.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				f = sliderf.getValue();
				v = sliderv.getValue();
				ortalama = (float) (v * 0.4 + f * 0.6);

				int yeniort = (int) ortalama;
				sliderort.setValue(yeniort);

				if (yeniort >= 60) {
					sliderort.setBackground(Color.GREEN);
					drmlbl.setText("GEÇTÝ");
					textort.setBackground(Color.green);
					txtvize.setBackground(Color.yellow);
					txtfinal.setBackground(Color.yellow);
					drmlbl.setForeground(Color.green);

				} else {
					sliderort.setBackground(Color.red);
					drmlbl.setText("KALDI");
					textort.setBackground(Color.red);
					txtfinal.setBackground(new Color(0, 102, 102));
					txtvize.setBackground(new Color(0, 102, 102));
					drmlbl.setForeground(Color.RED);

				}

				txtvize.setText(String.valueOf(v));
				txtfinal.setText(String.valueOf(f));
				textort.setText(String.valueOf(ortalama));

			}
		});

		sliderort.setToolTipText("");
		sliderort.setPaintTicks(true);
		sliderort.setPaintLabels(true);
		sliderort.setMinorTickSpacing(5);
		sliderort.setMajorTickSpacing(20);
		sliderort.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sliderort.setBounds(77, 186, 357, 45);
		Jpanel.add(sliderort);

		txtvize = new JTextField();
		txtvize.setBackground(new Color(0, 102, 102));
		txtvize.setText("0");
		txtvize.setFont(new Font("Dialog", Font.BOLD, 17));
		txtvize.setToolTipText("");
		txtvize.setBounds(10, 41, 55, 45);
		Jpanel.add(txtvize);
		txtvize.setColumns(10);

		lblNewLabel = new JLabel("Vize");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(206, 14, 75, 26);
		Jpanel.add(lblNewLabel);

		lblFinal = new JLabel("Final");
		lblFinal.setFont(new Font("Dialog", Font.BOLD, 20));
		lblFinal.setBounds(203, 87, 75, 26);
		Jpanel.add(lblFinal);

		lblOrtalama = new JLabel("Ortalama");
		lblOrtalama.setFont(new Font("Dialog", Font.BOLD, 20));
		lblOrtalama.setBounds(188, 158, 138, 26);
		Jpanel.add(lblOrtalama);

		JLabel lblYusufEmreKaranfil = new JLabel("Yusuf Emre Karanfil");
		lblYusufEmreKaranfil.setBackground(new Color(32, 178, 170));
		lblYusufEmreKaranfil.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblYusufEmreKaranfil.setBounds(-1, 235, 156, 34);
		Jpanel.add(lblYusufEmreKaranfil);

	}

	protected boolean getSlidervPaintLabels() {
		return sliderf.getPaintLabels();
	}

	protected void setSlidervPaintLabels(boolean paintLabels) {
		sliderf.setPaintLabels(paintLabels);
	}
}
