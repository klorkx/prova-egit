import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;









public class calcula {
	private static Text pantalla;
	public static String valorActual;
	public static char operacio;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btn9 = new Button(shell, SWT.NONE);
		btn9.setBounds(166, 101, 39, 25);
		btn9.setText("9");
		btn9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("9");
				}
				else
				{
					pantalla.setText(pant + "9");
				}
			}
		});
		
		Button btn8 = new Button(shell, SWT.NONE);
		btn8.setText("8");
		btn8.setBounds(109, 101, 39, 25);
		btn8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("8");
				}
				else
				{
					pantalla.setText(pant + "8");
				}
			}
		});
		
		
		Button btn7 = new Button(shell, SWT.NONE);
		btn7.setText("7");
		btn7.setBounds(47, 101, 39, 25);
		btn7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("7");
				}
				else
				{
					pantalla.setText(pant + "7");
				}
			}
		});
		
		Button btn6 = new Button(shell, SWT.NONE);
		btn6.setText("6");
		btn6.setBounds(166, 143, 39, 25);
		btn6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("6");
				}
				else
				{
					pantalla.setText(pant + "6");
				}
			}
		});
		
		
		Button btn5 = new Button(shell, SWT.NONE);
		btn5.setText("5");
		btn5.setBounds(109, 143, 39, 25);
		btn5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("5");
				}
				else
				{
					pantalla.setText(pant + "5");
				}
			}
		});
		
		
		Button btn4 = new Button(shell, SWT.NONE);
		btn4.setText("4");
		btn4.setBounds(47, 143, 39, 25);
		btn4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("4");
				}
				else
				{
					pantalla.setText(pant + "4");
				}
			}
		});
		
		Button btn3 = new Button(shell, SWT.NONE);
		btn3.setText("3");
		btn3.setBounds(166, 185, 39, 25);
		btn3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("3");
				}
				else
				{
					pantalla.setText(pant + "3");
				}
			}
		});
		
		
		Button btn2 = new Button(shell, SWT.NONE);
		btn2.setText("2");
		btn2.setBounds(109, 185, 39, 25);
		btn2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("2");
				}
				else
				{
					pantalla.setText(pant + "2");
				}
			}
		});
		
		
		Button btn1 = new Button(shell, SWT.NONE);
		btn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("1");
				}
				else
				{
					pantalla.setText(pant + "1");
				}
			}
		});
		btn1.setText("1");
		btn1.setBounds(47, 185, 39, 25);
		
		Button btn0 = new Button(shell, SWT.NONE);
		btn0.setText("0");
		btn0.setBounds(109, 226, 39, 25);
		btn0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("0");
				}
				else
				{
					pantalla.setText(pant + "0");
				}
			}
		});
		
		
		Button btnpunt = new Button(shell, SWT.NONE);
		btnpunt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("0.");
				}
				else
				{
					pantalla.setText(pant + ".");
				}
			}
		});
		btnpunt.setText(",");
		btnpunt.setBounds(166, 226, 39, 25);
		
		Button btndiv = new Button(shell, SWT.NONE);
		btndiv.setText("/");
		btndiv.setBounds(271, 101, 39, 25);
		
		Button btnmul = new Button(shell, SWT.NONE);
		btnmul.setText("*");
		btnmul.setBounds(271, 143, 39, 25);
	
		Button btnres = new Button(shell, SWT.NONE);
		btnres.setText("-");
		btnres.setBounds(316, 101, 39, 25);
	
		Button btnsum = new Button(shell, SWT.NONE);
		btnsum.setText("+");
		btnsum.setBounds(316, 143, 39, 25);
		
		
		btnsum.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				valorActual=pantalla.getText();
				operacio='+';
				pantalla.setText("");
				btnsum.setEnabled(false);
				btnres.setEnabled(false);
				btnmul.setEnabled(false);
				btndiv.setEnabled(false);
			}
		});		
		btnres.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				valorActual=pantalla.getText();
				operacio='-';
				pantalla.setText("");
				btnsum.setEnabled(false);
				btnres.setEnabled(false);
				btnmul.setEnabled(false);
				btndiv.setEnabled(false);
				
			}
		});			
				
		btnmul.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				valorActual=pantalla.getText();
				operacio='*';
				pantalla.setText("");
				btnsum.setEnabled(false);
				btnres.setEnabled(false);
				btnmul.setEnabled(false);
				btndiv.setEnabled(false);
			}
		});			
		btndiv.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				valorActual=pantalla.getText();
				operacio='/';
				pantalla.setText("");
				btnsum.setEnabled(false);
				btnres.setEnabled(false);
				btnmul.setEnabled(false);
				btndiv.setEnabled(false);
			}
		});	
		
		
		
		pantalla = new Text(shell, SWT.BORDER);
		pantalla.setBounds(47, 37, 158, 21);
		
		Button btnigual = new Button(shell, SWT.NONE);
		btnigual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(operacio=='+')
				{
					pantalla.setText(Float.toString(Float.parseFloat(valorActual)+Float.parseFloat(pantalla.getText())));
				}
				else if(operacio=='-')
				{
					pantalla.setText(Float.toString(Float.parseFloat(valorActual)-Float.parseFloat(pantalla.getText())));
				}
				else if(operacio=='*')
				{
					pantalla.setText(Float.toString(Float.parseFloat(valorActual)*Float.parseFloat(pantalla.getText())));
				}
				else if(operacio=='/')
				{
					if(Float.parseFloat(pantalla.getText())!=0)
					{
						pantalla.setText(Float.toString(Float.parseFloat(valorActual)/Float.parseFloat(pantalla.getText())));
					}
					else
					{
						pantalla.setText("No dividir de 0");
					}
				}
				btn9.setEnabled(false);
				btn8.setEnabled(false);
				btn7.setEnabled(false);
				btn6.setEnabled(false);
				btn5.setEnabled(false);
				btn4.setEnabled(false);
				btn3.setEnabled(false);
				btn2.setEnabled(false);
				btn1.setEnabled(false);
				btn0.setEnabled(false);
				btnpunt.setEnabled(false);
				btnigual.setEnabled(false);				
			}
		});
		btnigual.setText("=");
		btnigual.setBounds(316, 226, 39, 25);
		
		Button btnC = new Button(shell, SWT.NONE);
		btnC.setBounds(233, 33, 75, 25);
		btnC.setText("C");
		
		Button btnnegatiu = new Button(shell, SWT.NONE);
		btnnegatiu.setText("-");
		btnnegatiu.setBounds(47, 226, 39, 25);
		btnnegatiu.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String pant="";
				pant=pantalla.getText();
				if (pant=="")
				{
					pantalla.setText("-");
				}
			}
		});			
		
		
		
		
		
		btnC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText("");
				valorActual="";
				btn9.setEnabled(true);
				btn8.setEnabled(true);
				btn7.setEnabled(true);
				btn6.setEnabled(true);
				btn5.setEnabled(true);
				btn4.setEnabled(true);
				btn3.setEnabled(true);
				btn2.setEnabled(true);
				btn1.setEnabled(true);
				btnigual.setEnabled(true);
				btn0.setEnabled(true);
				btnpunt.setEnabled(true);
				btnsum.setEnabled(true);
				btnres.setEnabled(true);
				btnmul.setEnabled(true);
				btndiv.setEnabled(true);				
			}
		});

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
