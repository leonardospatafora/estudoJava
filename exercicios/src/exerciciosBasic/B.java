package exerciciosBasic;

import javax.swing.JOptionPane;

public class B {

	
	
	
	
//	private A first = new A();
//	private A second = new A();
	
	public void runUpTheCount() {
		A.counter ++;  // Noncompliant
		A.counter ++;  // Noncompliant. A.counter is now 2, which is perhaps contrary to expectations
		System.out.println(A.counter);
	}
	
	
	public static void main(String[] args) {
		B b = new B();
		b.runUpTheCount();
		JOptionPane.showMessageDialog(null, "Olá, Mundo!");
		String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
		System.out.println(nome);
	}
	
}


