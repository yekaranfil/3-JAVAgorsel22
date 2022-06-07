package java221;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class odev3_3 extends JFrame {
	int i = 0;
	int cevap = 0;
	int dogrusayac = 0;
	int yanlýssayac = 0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odev3_3 frame = new odev3_3();
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
	public odev3_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 429);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(123, 104, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton rada = new JRadioButton("");
		rada.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		rada.setBounds(10, 129, 316, 54);
		rada.setOpaque(false);
		contentPane.add(rada);

		JRadioButton radd = new JRadioButton("");
		radd.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		radd.setBounds(10, 300, 316, 54);
		radd.setOpaque(false);
		contentPane.add(radd);

		JRadioButton radc = new JRadioButton("");
		radc.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		radc.setBounds(10, 243, 316, 54);
		radc.setOpaque(false);
		contentPane.add(radc);

		JRadioButton radb = new JRadioButton("");
		radb.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		radb.setBounds(10, 186, 316, 54);
		radb.setOpaque(false);
		contentPane.add(radb);

		JButton kntrl = new JButton("CEVAPLA");
		kntrl.setBounds(267, 356, 89, 23);
		contentPane.add(kntrl);

		JButton geri = new JButton("Geri");
		geri.setBounds(10, 356, 89, 23);
		contentPane.add(geri);

		JButton ileri = new JButton("\u0130leri");
		ileri.setBounds(528, 356, 89, 23);
		contentPane.add(ileri);

		JLabel sorutxt = new JLabel("");
		sorutxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		sorutxt.setBounds(10, 11, 511, 134);
		contentPane.add(sorutxt);

		i = 0;
		Sorular s = new Sorular();
		ButtonGroup bg = new ButtonGroup();
		bg.add(rada);
		bg.add(radb);
		bg.add(radc);
		bg.add(radd);

		sorutxt.setText(s.sorular[i]);
		rada.setText(s.sorular[i + 1]);
		radb.setText(s.sorular[i + 2]);
		radc.setText(s.sorular[i + 3]);
		radd.setText(s.sorular[i + 4]);

		JLabel lblNewLabel = new JLabel("Yusuf Emre Karanfil");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(500, 323, 144, 34);
		contentPane.add(lblNewLabel);

		JLabel uyarýlbl = new JLabel("L\u00FCtfen bir \u015F\u0131k se\u00E7iniz!");
		uyarýlbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		uyarýlbl.setBounds(240, 316, 228, 45);
		uyarýlbl.setVisible(false);
		contentPane.add(uyarýlbl);

		JLabel dgrlbl = new JLabel("Do\u011Fru  :");
		dgrlbl.setBounds(514, 11, 103, 14);
		contentPane.add(dgrlbl);

		JLabel ynlslbl = new JLabel("Yanl\u0131\u015F  :");
		ynlslbl.setBounds(514, 31, 116, 14);
		contentPane.add(ynlslbl);

		// cevap kontrol
		kntrl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (rada.isSelected()) {
					uyarýlbl.setVisible(false);
					cevap = 1;
				}

				else if (radb.isSelected()) {
					cevap = 2;
					uyarýlbl.setVisible(false);
				}

				else if (radc.isSelected()) {
					cevap = 3;
					uyarýlbl.setVisible(false);
				}

				else if (radd.isSelected()) {
					cevap = 4;
					uyarýlbl.setVisible(false);
				}

				// cevap kontrol + sayac
				if (cevap == s.cevaplar[i]) {
					kntrl.setText("DOÐRU");
					kntrl.setForeground(Color.green);
					contentPane.setBackground(Color.green);
					dogrusayac++;
					if (dogrusayac < 7-yanlýssayac) {
						dgrlbl.setText("Doðru :" + " " + dogrusayac);

					}

				} else {
					kntrl.setText("YANLIÞ");
					kntrl.setForeground(Color.red);
					contentPane.setBackground(Color.red);
					yanlýssayac++;
					if (yanlýssayac < 7-dogrusayac) {
						ynlslbl.setText("Yanlýþ :" + " " + yanlýssayac);
						;

					}

				}

			}

		});

		// sonraki soru ve cevaplar
		ileri.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (rada.isSelected() || radb.isSelected() || radc.isSelected() || radd.isSelected()) {

					if (i < 5) {
						i++;
						sorutxt.setText(s.sorular[i * 5]);
						rada.setText(s.sorular[i * 5 + 1]);
						radb.setText(s.sorular[i * 5 + 2]);
						radc.setText(s.sorular[i * 5 + 3]);
						radd.setText(s.sorular[i * 5 + 4]);
						kntrl.setText("CEVAPLA");
						contentPane.setBackground(new Color(123, 104, 238));
						kntrl.setForeground(Color.black);
						uyarýlbl.setVisible(false);

						if (dogrusayac < 5) {
							dgrlbl.setText("Doðru :" + " " + dogrusayac);
							ynlslbl.setText("Yanlýþ :" + " " + yanlýssayac);

						}

					}

				} else {
					uyarýlbl.setVisible(true);
					uyarýlbl.setForeground(Color.red);

				}

			}
		});

		// bi önceki soru ve cevaplar
		geri.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i > 0) {
					i--;
					sorutxt.setText(s.sorular[i * 5]);
					rada.setText(s.sorular[i * 5 + 1]);
					radb.setText(s.sorular[i * 5 + 2]);
					radc.setText(s.sorular[i * 5 + 3]);
					radd.setText(s.sorular[i * 5 + 4]);
					kntrl.setText("CEVAPLA");
					kntrl.setForeground(Color.black);

				}

			}
		});

	}
}
