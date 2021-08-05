import java.util.Calendar;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class Likimo_skaicius extends JFrame {

	private JLayeredPane contentPane;
	private int menNr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Likimo_skaicius frame = new Likimo_skaicius();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}

	/**
	 * 
	 * @param x - skaičius, kuris turi būti išskaldytas į vienetus
	 * @return - išskaldytų vienetų suma iš duotojo skaičiaus
	 */
	public int skaldymas(int x) {
		int suma = 0;
		while (x != 0) {
			suma += x % 10;
			x /= 10;
		}
		return suma;

	}

	/**
	 * 
	 * Mėnesių pavadinimų kolekcija
	 *
	 */
	public enum Month {
		Sausis, Vasaris, Kovas, Balandis, Gegužė, Birželis, Liepa, Rugpjūtis, Rugsėjis, Spalis, Lapkritis, Gruodis;

	}

	/**
	 * 
	 * @param lb      - komponentas JLabel i kurį, keliamas tekstas
	 * @param tekstas - Failo pavadinimas iš, kurio keliama informacija
	 */
	public void skaitymas(JLabel lb, String tekstas) {
		BufferedReader in = null;
		try {
			String skaitomaLinija;
			ArrayList<String> ufff = new ArrayList<String>();
			in = new BufferedReader(new FileReader(tekstas));

			while ((skaitomaLinija = in.readLine()) != null) {
				ufff.add(skaitomaLinija);
			}
			lb.setText("<html>" + ufff.toString() + "</html>");
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {
				if (in != null)
					in.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * @param likimoNr - apskaičiuotas Nr, pagal gimimo datą
	 * @return - gražinamas failo pavadinimas, pagal likimo numerį
	 */
	public String failas(int likimoNr) {
		String failas = "";
		switch (likimoNr) {
		case 1:
			failas = "aprasas1.txt";
			break;
		case 2:
			failas = "aprasas2.txt";
			break;
		case 3:
			failas = "aprasas3.txt";
			break;
		case 4:
			failas = "aprasas4.txt";
			break;
		case 5:
			failas = "aprasas5.txt";
			break;
		case 6:
			failas = "aprasas6.txt";
			break;
		case 7:
			failas = "aprasas7.txt";
			break;
		case 8:
			failas = "aprasas8.txt";
			break;
		case 9:
			failas = "aprasas9.txt";
			break;

		}
		return failas;

	}
	public String rytuHoroskopas(int m) {
		String gyvunas="";
		m = (m-1900)%12;
		switch(m) {
		case 0:
			gyvunas = "Žiurkės metais";
			break;
		case 1:
			gyvunas = "Jaučio metais";
			break;
		case 2:
			gyvunas = "Tigro metais";
			break;
		case 3:
			gyvunas = "Triušio metais";
			break;
		case 4:
			gyvunas = "Drakono metais";
			break;
		case 5:
			gyvunas = "Gyvatės metais";
			break;
		case 6:
			gyvunas = "Arklio metais";
			break;
		case 7:
			gyvunas = "Ožkos metais";
			break;
		case 8:
			gyvunas = "Beždžionės metais";
			break;
		case 9:
			gyvunas = "Gaidžio metais";
			break;
		case 10:
			gyvunas = "Šuns metais";
			break;
		case 11:
			gyvunas = "Kiaulės metais";
			break;
		}
		return gyvunas;
	}
	public String zodiakas(int men, int d) {
		String lbZod = "";
		switch(men) {
		case 3:
			if (d>=21) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\avinas.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\zuvis.png";
			break;
		case 4:
			if (d<21) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\avinas.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\jautis.png";
			break;
		case 5:
			if (d>=22) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\dvyniai.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\jautis.png";
			break;
		case 6:
			if (d<=21) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\dvyniai.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\vezys.png";
			break;
		case 7:
			if (d>=23) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\liutas.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\vezys.png";
			break;
		case 8:
			if (d<22) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\liutas.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\mergele.png";
			break;
		case 9:
			if (d<=23) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\mergele.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\svarstykles.png";
			break;
		case 10:
			if (d<=23) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\svarstykles.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\skorpionas.png";
			break;
		case 11:
			if (d<=22) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\skorpionas.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\saulys.png";
			break;
		case 12:
			if (d<=22) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\saulys.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\oziaragis.png";
			break;
		case 1:
			if (d>=21) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\vandenis.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\oziaragis.png";
			break;
		case 2:
			if (d<=18) {
				lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\vandenis.png";
			}
			else lbZod="C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\zuvis.png";
			break;
		}
		return lbZod;
	
	}
	
	public String stichija(String zod) {
		String stichija = "";
		if (zod.equals("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\saulys.png")||
				zod.equals("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\avinas.png")||
				zod.equals("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\liutas.png")) {
					stichija = "Valdanti stichija - ugnies";
		} else if (zod.equals("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\svarstykles.png")||
				zod.equals("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\vandenis.png")||
				zod.equals("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\dvyniai.png")) {
					stichija = "Valdanti stichija - oro";
		} else if (zod.equals("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\vezys.png")||
				zod.equals("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\skorpionas.png")||
				zod.equals("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\zuvis.png")) {
					stichija = "Valdanti stichija - vandens";
		} else stichija = "Valdanti stichija - žemės";
		return stichija;
	}
	/**
	 * Create the frame.
	 */
	public Likimo_skaicius() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\Screenshot_3.png"));
		setTitle("Numerologija");

		ArrayList<String> metai = new ArrayList<String>();
		for (int years = Calendar.getInstance().get(Calendar.YEAR); years >= 1910; years--) {
			metai.add(years + "");
		}

		ArrayList<String> dienos = new ArrayList<String>();
		for (int diena = 1; diena <= 31; diena++) {
			dienos.add(diena + "");
		}

		setFont(new Font("Open Sans", Font.PLAIN, 16));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1239, 881);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnIseiti = new JButton("Išeiti ");
		btnIseiti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Išeiti");

				if (JOptionPane.showConfirmDialog(frame, "Ar tikrai norite išeiti?", "Numerologija",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}

			}
		});
		
		JLabel lbStichija = new JLabel("");
		lbStichija.setForeground(new Color(255, 204, 51));
		lbStichija.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 15));
		lbStichija.setBounds(49, 635, 359, 69);
		contentPane.add(lbStichija);
		
		JLabel lbZenklas = new JLabel("");
		lbZenklas.setHorizontalAlignment(SwingConstants.CENTER);
		lbZenklas.setForeground(new Color(255, 204, 51));
		lbZenklas.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 15));
		lbZenklas.setBounds(78, 315, 181, 37);
		contentPane.add(lbZenklas);
		
		JLabel lbRytuMetai = new JLabel("");
		lbRytuMetai.setForeground(new Color(255, 204, 51));
		lbRytuMetai.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 15));
		lbRytuMetai.setBounds(49, 567, 359, 69);
		contentPane.add(lbRytuMetai);
		
		JLabel lbZod = new JLabel("");
		lbZod.setIcon(new ImageIcon("C:\\Users\\Juste Si\\Documents\\Objektinis_programavimas\\Likimo_sk\\src\\"));
		lbZod.setBounds(75, 364, 225, 179);
		contentPane.add(lbZod);
		btnIseiti.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 15));
		btnIseiti.setBounds(1036, 770, 104, 37);
		contentPane.add(btnIseiti);

		JLabel lblNewLabel_1_1_2 = new JLabel("Diena");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("MS Gothic", Font.ITALIC, 29));
		lblNewLabel_1_1_2.setBounds(423, 131, 131, 37);
		contentPane.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_1 = new JLabel("Mėnuo");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("MS Gothic", Font.ITALIC, 29));
		lblNewLabel_1_1_1.setBounds(252, 131, 131, 37);
		contentPane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1 = new JLabel("Metai");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("MS Gothic", Font.ITALIC, 29));
		lblNewLabel_1_1.setBounds(68, 131, 131, 37);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1 = new JLabel("Numerologija: Koks tavo skaičius?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel_1.setBounds(58, 35, 822, 69);
		contentPane.add(lblNewLabel_1);

		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox cbMetai = new JComboBox(metai.toArray());
		cbMetai.setBackground(new Color(255, 250, 250));
		cbMetai.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 15));
		cbMetai.setBounds(65, 179, 148, 46);
		contentPane.add(cbMetai);

		JLabel lbPranesimas = new JLabel("");
		lbPranesimas.setHorizontalAlignment(SwingConstants.CENTER);
		lbPranesimas.setForeground(Color.WHITE);
		lbPranesimas.setBackground(new Color(224, 255, 255));
		lbPranesimas.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 30));
		lbPranesimas.setBounds(731, 188, 369, 37);
		contentPane.add(lbPranesimas);

		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox cbMenuo = new JComboBox(Month.values());
		cbMenuo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unchecked")
				Month menuo = (Month) ((JComboBox<Month>) e.getSource()).getSelectedItem();

				/**
				 * pagal mėnesio pavadinimą priskiriamas atitinkantis mėnesį skaičius
				 */
				switch (menuo) {
				case Sausis:
					menNr = 1;
					break;
				case Vasaris:
					menNr = 2;
					break;
				case Kovas:
					menNr = 3;
					break;
				case Balandis:
					menNr = 4;
					break;
				case Gegužė:
					menNr = 5;
					break;
				case Birželis:
					menNr = 6;
					break;
				case Liepa:
					menNr = 7;
					break;
				case Rugpjūtis:
					menNr = 8;
					break;
				case Rugsėjis:
					menNr = 9;
					break;
				case Spalis:
					menNr = 10;
					break;
				case Lapkritis:
					menNr = 11;
					break;
				case Gruodis:
					menNr = 12;
					break;
				default:
					menNr = 0;
					throw new IllegalArgumentException("Unexpected value: " + menuo);
				}
				System.out.println(menuo);
			}
		});
		cbMenuo.setBackground(new Color(255, 250, 250));
		cbMenuo.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 15));
		cbMenuo.setBounds(262, 179, 163, 46);
		contentPane.add(cbMenuo);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox cbDiena = new JComboBox(dienos.toArray());
		cbDiena.setBackground(new Color(255, 250, 250));
		cbDiena.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 15));
		cbDiena.setBounds(460, 179, 60, 46);
		contentPane.add(cbDiena);

		JLabel lbAprasas = new JLabel("");
		lbAprasas.setForeground(SystemColor.text);
		lbAprasas.setBackground(new Color(224, 255, 255));
		lbAprasas.setFont(new Font("Open Sans", Font.BOLD, 18));
		lbAprasas.setBounds(380, 339, 806, 365);
		contentPane.add(lbAprasas);

		JButton btnSkaiciuoti = new JButton("Skaičiuoti");
		btnSkaiciuoti.setFont(new Font("Open Sans", Font.BOLD | Font.ITALIC, 20));
		btnSkaiciuoti.setBounds(547, 179, 131, 46);
		contentPane.add(btnSkaiciuoti);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Juste Si\\Downloads\\pexels-alex-andrews-816608 (2).jpg"));
		lblNewLabel.setBackground(new Color(224, 255, 255));
		lblNewLabel.setBounds(0, 0, 1280, 852);
		contentPane.add(lblNewLabel);

		btnSkaiciuoti.addActionListener(new ActionListener() {
			/**
			 * 
			 * Apskaičiuojamas numeris pagal gimimo datą ir gražinamas tekstas
			 */
			public void actionPerformed(ActionEvent e) {
				String failas = "";
				int m = Integer.parseInt((String) cbMetai.getSelectedItem());
				int d = Integer.parseInt((String) cbDiena.getSelectedItem());
				if (menNr == 0) {
					lbPranesimas.setText("Neteisingas pasirinkimas");
				} else {
					lbPranesimas.setText("");
					int likimoSk = skaldymas(m) + skaldymas(menNr) + skaldymas(d);
					while (likimoSk > 9) {
						likimoSk = skaldymas(likimoSk);
					}
					lbPranesimas.setText("Jūsų skaičius yra: " + likimoSk);
					lbZenklas.setText("Zodiakas:");
					failas = failas(likimoSk);
					skaitymas(lbAprasas, failas);
					String zod = zodiakas(menNr, d);
					ImageIcon image = new ImageIcon(zod);
					lbZod.setIcon(image);
					lbStichija.setText(""+stichija(zod));
					String rytietiskas = rytuHoroskopas(m);
					lbRytuMetai.setText("Jūs gimėte: "+rytietiskas);
				}
			}

		});

	}
}
