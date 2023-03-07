import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;

public class Hauptfenster extends JFrame
		implements ActionListener, FocusListener
{

	private JPanel contentPane;
	private JLabel lblZahl1;
	private JLabel lblZahl2;
	private JLabel lblErg;
	private JTextField txtZahl1;
	private JTextField txtZahl2;
	private JTextField txtErg;
	private JPanel panel;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JPanel panel_1;
	private JButton btnEmpty;
	private JButton btnBeenden;
	private JMenuBar menuBar;
	private JMenu mnDatei;
	private JMenuItem mntmBeenden;
	private JMenu mnBearbeiten;
	private JMenuItem mntmAddieren;
	private JMenuItem mntmSubtrahieren;
	private JMenuItem mntmMultiplizieren;
	private JMenuItem mntmDividieren;
	private JMenuItem mntmLeeren;
	private JMenu mnQuestion;
	private JMenuItem mntmInfo;
	
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Hauptfenster frame = new Hauptfenster();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}


	public Hauptfenster()
	{
		initGUI();
	}

	private void initGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 240);

		this.menuBar = new JMenuBar();
		setJMenuBar(this.menuBar);

		this.mnDatei = new JMenu("Datei");
		this.menuBar.add(this.mnDatei);

		this.mntmBeenden = new JMenuItem("Beenden");
		this.mnDatei.add(this.mntmBeenden);
		this.mntmBeenden.addActionListener(this);

		this.mnBearbeiten = new JMenu("Bearbeiten");
		this.menuBar.add(this.mnBearbeiten);

		this.mntmAddieren = new JMenuItem("Addieren");
		this.mntmAddieren.setActionCommand("+");
		this.mntmAddieren.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
				InputEvent.ALT_DOWN_MASK));
		this.mnBearbeiten.add(this.mntmAddieren);
		this.mntmAddieren.addActionListener(this);

		this.mntmSubtrahieren = new JMenuItem("Subtrahieren");
		this.mntmSubtrahieren.setActionCommand("-");
		this.mntmSubtrahieren.setAccelerator(KeyStroke
				.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_DOWN_MASK));
		this.mnBearbeiten.add(this.mntmSubtrahieren);
		this.mntmSubtrahieren.addActionListener(this);

		this.mntmMultiplizieren = new JMenuItem("Multiplizieren");
		this.mntmMultiplizieren.setActionCommand("*");
		this.mntmMultiplizieren.setAccelerator(KeyStroke
				.getKeyStroke(KeyEvent.VK_M, InputEvent.ALT_DOWN_MASK));
		this.mnBearbeiten.add(this.mntmMultiplizieren);
		this.mntmMultiplizieren.addActionListener(this);

		this.mntmDividieren = new JMenuItem("Dividieren");
		this.mntmDividieren.setActionCommand("/");
		this.mntmDividieren.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,
				InputEvent.ALT_DOWN_MASK));
		this.mnBearbeiten.add(this.mntmDividieren);
		this.mntmDividieren.addActionListener(this);

		this.mntmLeeren = new JMenuItem("Felder leeren");
		this.mntmLeeren.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,
				InputEvent.ALT_DOWN_MASK));
		this.mnBearbeiten.add(this.mntmLeeren);
		this.mntmLeeren.addActionListener(this);

		this.mnQuestion = new JMenu("?");
		this.menuBar.add(this.mnQuestion);

		this.mntmInfo = new JMenuItem("Info \u00FCber");
		this.mnQuestion.add(this.mntmInfo);
		this.mntmInfo.addActionListener(this);

		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(this.contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 30, 30, 30, 60, 60, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0,
				Double.MIN_VALUE };
		this.contentPane.setLayout(gbl_contentPane);

		this.lblZahl1 = new JLabel("Zahl 1:");
		GridBagConstraints gbc_lblZahl1 = new GridBagConstraints();
		gbc_lblZahl1.anchor = GridBagConstraints.WEST;
		gbc_lblZahl1.insets = new Insets(0, 0, 5, 5);
		gbc_lblZahl1.gridx = 0;
		gbc_lblZahl1.gridy = 0;
		this.contentPane.add(this.lblZahl1, gbc_lblZahl1);

		this.txtZahl1 = new JTextField();
		GridBagConstraints gbc_txtZahl1 = new GridBagConstraints();
		gbc_txtZahl1.insets = new Insets(0, 0, 5, 0);
		gbc_txtZahl1.fill = GridBagConstraints.BOTH;
		gbc_txtZahl1.gridx = 1;
		gbc_txtZahl1.gridy = 0;
		this.contentPane.add(this.txtZahl1, gbc_txtZahl1);
		this.txtZahl1.setColumns(10);
		this.txtZahl1.addFocusListener(this);

		this.lblZahl2 = new JLabel("Zahl 2:");
		GridBagConstraints gbc_lblZahl2 = new GridBagConstraints();
		gbc_lblZahl2.anchor = GridBagConstraints.WEST;
		gbc_lblZahl2.insets = new Insets(0, 0, 5, 5);
		gbc_lblZahl2.gridx = 0;
		gbc_lblZahl2.gridy = 1;
		this.contentPane.add(this.lblZahl2, gbc_lblZahl2);

		this.txtZahl2 = new JTextField();
		GridBagConstraints gbc_txtZahl2 = new GridBagConstraints();
		gbc_txtZahl2.insets = new Insets(0, 0, 5, 0);
		gbc_txtZahl2.fill = GridBagConstraints.BOTH;
		gbc_txtZahl2.gridx = 1;
		gbc_txtZahl2.gridy = 1;
		this.contentPane.add(this.txtZahl2, gbc_txtZahl2);
		this.txtZahl2.setColumns(10);
		this.txtZahl2.addFocusListener(this);

		this.lblErg = new JLabel("Ergebnis:");
		GridBagConstraints gbc_lblErg = new GridBagConstraints();
		gbc_lblErg.anchor = GridBagConstraints.WEST;
		gbc_lblErg.insets = new Insets(0, 0, 5, 5);
		gbc_lblErg.gridx = 0;
		gbc_lblErg.gridy = 2;
		this.contentPane.add(this.lblErg, gbc_lblErg);

		this.txtErg = new JTextField();
		this.txtErg.setEditable(false);
		GridBagConstraints gbc_txtErg = new GridBagConstraints();
		gbc_txtErg.insets = new Insets(0, 0, 5, 0);
		gbc_txtErg.fill = GridBagConstraints.BOTH;
		gbc_txtErg.gridx = 1;
		gbc_txtErg.gridy = 2;
		this.contentPane.add(this.txtErg, gbc_txtErg);
		this.txtErg.setColumns(10);

		this.panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		this.contentPane.add(this.panel, gbc_panel);
		this.panel.setLayout(new GridLayout(1, 0, 0, 0));

		this.btnPlus = new JButton("+");
		this.panel.add(this.btnPlus);
		this.btnPlus.addActionListener(this);

		this.btnMinus = new JButton("-");
		this.panel.add(this.btnMinus);
		this.btnMinus.addActionListener(this);

		this.btnMultiply = new JButton("*");
		this.panel.add(this.btnMultiply);
		this.btnMultiply.addActionListener(this);

		this.btnDivide = new JButton("/");
		this.panel.add(this.btnDivide);
		this.btnDivide.addActionListener(this);

		this.panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 4;
		this.contentPane.add(this.panel_1, gbc_panel_1);
		this.panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		this.btnEmpty = new JButton("Felder leeren");
		this.panel_1.add(this.btnEmpty);
		this.btnEmpty.addActionListener(this);

		this.btnBeenden = new JButton("Beenden");
		this.panel_1.add(this.btnBeenden);
		this.btnBeenden.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Felder leeren"))
		{
			this.txtErg.setText("");
			this.txtZahl1.setText("0");
			this.txtZahl2.setText("0");
		}
		else if (e.getActionCommand().equals("Beenden"))
		{
			System.exit(1);
		}
		else if (e.getActionCommand().equals(this.mntmInfo.getActionCommand()))
		{
			
		}
		else if (e.getActionCommand().equals("+"))
		{
			if (this.txtZahl1.getText().trim().isEmpty() || this.txtZahl2.getText().trim().isEmpty())
			{
				this.txtErg.setText("Die Zahlen dürfen nicht leer sein");
				return;
			}
			
			try
			{
				double erg = Double.parseDouble(this.txtZahl1.getText()) + Double.parseDouble(this.txtZahl2.getText());
				this.txtErg.setText(Double.toString(erg));
			}
			catch (Exception ex)
			{
				this.txtErg.setText("Fehler bei Eingabe der Zahlen");
			}
		}
		else if (e.getActionCommand().equals("-"))
		{
			if (this.txtZahl1.getText().trim().isEmpty() || this.txtZahl2.getText().trim().isEmpty())
			{
				this.txtErg.setText("Die Zahlen dürfen nicht leer sein");
				return;
			}

			try
			{
				double erg = Double.parseDouble(this.txtZahl1.getText()) - Double.parseDouble(this.txtZahl2.getText());
				this.txtErg.setText(Double.toString(erg));
			}
			catch (Exception ex)
			{
				this.txtErg.setText("Fehler bei Eingabe der Zahlen");
			}
		}
		else if (e.getActionCommand().equals("*"))
		{
			if (this.txtZahl1.getText().trim().isEmpty() || this.txtZahl2.getText().trim().isEmpty())
			{
				this.txtErg.setText("Die Zahlen dürfen nicht leer sein");
				return;
			}

			try
			{
				double erg = Double.parseDouble(this.txtZahl1.getText()) * Double.parseDouble(this.txtZahl2.getText());
				this.txtErg.setText(Double.toString(erg));
			}
			catch (Exception ex)
			{
				this.txtErg.setText("Fehler bei Eingabe der Zahlen");
			}
		}
		else if (e.getActionCommand().equals("/"))
		{
			if (this.txtZahl1.getText().trim().isEmpty() || this.txtZahl2.getText().trim().isEmpty())
			{
				this.txtErg.setText("Die Zahlen dürfen nicht leer sein");
				return;
			}

			try
			{
				if (Double.parseDouble(this.txtZahl2.getText().trim()) == 0)
				{
					this.txtErg.setText("Division durch 0 nicht möglich");
					return;
				}

				double erg = Double.parseDouble(this.txtZahl1.getText()) / Double.parseDouble(this.txtZahl2.getText());
				this.txtErg.setText(Double.toString(erg));
			}
			catch (Exception ex)
			{
				this.txtErg.setText("Fehler bei Eingabe der Zahlen");
			}
		}
	}

	@Override
	public void focusGained(FocusEvent e)
	{
		if( e.getSource() instanceof JTextComponent)
		{
			((JTextComponent)e.getSource()).selectAll();
		}
	}

	@Override
	public void focusLost(FocusEvent e)
	{
		if(e.getSource() instanceof JTextComponent)
		{
			JTextField tf = (JTextField)e.getSource();
			tf.setText(tf.getText().trim());
			
			if(tf.getText().trim().length() == 0)
			{
				tf.setText("0");
			}
		}
	}
}
