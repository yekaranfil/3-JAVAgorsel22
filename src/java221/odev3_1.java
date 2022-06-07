package java221;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JComboBox;

public class odev3_1 extends JFrame {

	int r, g, b;
	int w, h;
	int x, y;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev3_1 frame = new odev3_1();
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
	public odev3_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSpinner spinw = new JSpinner();

		spinw.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinw.setModel(new SpinnerNumberModel(new Integer(50), null, null, new Integer(1)));
		spinw.setBounds(10, 0, 73, 39);
		contentPane.add(spinw);

		JSpinner spinh = new JSpinner();

		spinh.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinh.setModel(new SpinnerNumberModel(new Integer(50), null, null, new Integer(1)));
		spinh.setBounds(93, 0, 73, 39);
		contentPane.add(spinh);

		JSpinner spinx = new JSpinner();

		spinx.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinx.setModel(new SpinnerNumberModel(new Integer(75), null, null, new Integer(1)));
		spinx.setBounds(242, 61, 73, 39);
		contentPane.add(spinx);

		JSpinner spiny = new JSpinner();

		spiny.setFont(new Font("Tahoma", Font.BOLD, 17));
		spiny.setModel(new SpinnerNumberModel(new Integer(75), null, null, new Integer(1)));
		spiny.setBounds(242, 134, 73, 39);
		contentPane.add(spiny);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 61, 222, 189);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btn = new JButton("");
		btn.setBounds(75, 75, 50, 50);
		panel.add(btn);

		JSpinner spinr = new JSpinner();
		spinr.setForeground(Color.RED);
		spinr.setBackground(Color.RED);

		spinr.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinr.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		spinr.setBounds(351, 61, 73, 39);
		contentPane.add(spinr);

		JSpinner sping = new JSpinner();
		sping.setForeground(Color.GREEN);
		sping.setBackground(Color.GREEN);

		sping.setFont(new Font("Tahoma", Font.BOLD, 17));
		sping.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		sping.setBounds(351, 119, 73, 39);
		contentPane.add(sping);

		JSpinner spinb = new JSpinner();
		spinb.setForeground(Color.BLUE);
		spinb.setBackground(Color.BLUE);

		spinb.setFont(new Font("Tahoma", Font.BOLD, 17));
		spinb.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		spinb.setBounds(351, 181, 73, 39);
		contentPane.add(spinb);

		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(269, 47, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblY.setBounds(269, 111, 46, 25);
		contentPane.add(lblY);

		JLabel lblW = new JLabel("W");
		lblW.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblW.setBounds(10, 47, 46, 14);
		contentPane.add(lblW);

		JLabel lblH = new JLabel("H");
		lblH.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblH.setBounds(93, 47, 46, 14);
		contentPane.add(lblH);

		JLabel lblR = new JLabel("R");
		lblR.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblR.setBounds(351, 44, 46, 19);
		contentPane.add(lblR);

		JLabel lblG = new JLabel("G");
		lblG.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblG.setBounds(351, 102, 46, 18);
		contentPane.add(lblG);

		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblB.setBounds(351, 165, 46, 18);
		contentPane.add(lblB);

		JLabel lblNewLabel_1 = new JLabel("Yusuf Emre Karanfil");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(269, 236, 155, 25);
		contentPane.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(339, 44, 95, 58);
		contentPane.add(panel_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.GREEN);
		panel_1_1.setBounds(339, 102, 95, 58);
		contentPane.add(panel_1_1);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.BLUE);
		panel_1_2.setBounds(339, 160, 95, 61);
		contentPane.add(panel_1_2);

		r = g = b = 0;
		w = h = 50;
		x = y = 75;

		spinw.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				w = (int) spinw.getValue();

				btn.setBounds(75, 75, w, h);

			}
		});

		spinh.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				h = (int) spinh.getValue();
				btn.setBounds(75, 75, w, h);

			}
		});
		spinx.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				x = (int) spinx.getValue();

				btn.setBounds(x, y, w, h);

			}
		});
		spiny.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				y = (int) spiny.getValue();

				btn.setBounds(x, y, w, h);
			}
		});
		spinr.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r = (int) spinr.getValue();
				btn.setBackground(new Color(r, g, b));
			}
		});
		sping.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				g = (int) sping.getValue();
				btn.setBackground(new Color(r, g, b));
			}
		});
		spinb.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				b = (int) spinb.getValue();
				btn.setBackground(new Color(r, g, b));
			}
		});

	}
}
