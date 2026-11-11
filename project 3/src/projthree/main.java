//name: Jordan Schmidt
//CIDS 161
//date: 12/16/21
//this program calculates your planet ages

package projthree;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		
		//variables
		String name;
		float age;
		float myMercuryAge;
		float myVenusAge;
		float myJupiterAge;
		float mySaturnAge;
		final int mercuryAge = 88;
		final int venusAge = 225;
		final int jupiterAge = 4380;
		final int saturnAge = 10767;
		//variables end
		
		name = JOptionPane.showInputDialog("Enter your name");
		age = Float.parseFloat(JOptionPane.showInputDialog("Enter your Earth age"));
		myMercuryAge = (age * 365) / mercuryAge;
		myVenusAge = (age * 365)/ venusAge;
		myJupiterAge = (age * 365)/ jupiterAge;
		mySaturnAge = (age * 365)/ saturnAge;
		
		JOptionPane.showMessageDialog(null, "I am " + age + " years old on earth but I would be very old on Mercury with " + String.format("%.2f", myMercuryAge) + "\n"
				+ "years. Not so old on Venus with " + String.format("%.2f", myVenusAge) + " years, very young on Jupiter with \n"
				+ String.format("%.2f", myJupiterAge) + " years and really young on Saturn with " + String.format("%.2f", mySaturnAge) +" years");
		
	}

}
