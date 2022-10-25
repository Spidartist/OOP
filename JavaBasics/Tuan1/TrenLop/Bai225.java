import javax.swing.JOptionPane;

public class Bai225 {
	public static void main(String[] args) {
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null, "Input the first number",
				  JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Input the second number",
				  JOptionPane.INFORMATION_MESSAGE);
		double dNum1 = Double.parseDouble(strNum1);
		double dNum2 = Double.parseDouble(strNum2);
		double dSum = dNum1 + dNum2;
		double dDiff = dNum1 - dNum2;
		double dMul = dNum1 * dNum2;
		String strAlert = "";
		double dDiv;
		if (dNum2 == 0.0) {
			strAlert = "Second number equal zero, division failed";
		}else {
			dDiv = dNum1 / dNum2;
			strAlert = "Division: " + Double.toString(dDiv) + "\n";
		};
		 
		
		JOptionPane.showMessageDialog(null, "Sum: " +  Double.toString(dSum) + "\n" +
											"Difference: " + Double.toString(dDiff) + "\n" +
											"Multiple: " + Double.toString(dMul) + "\n" +
											strAlert);
		System.exit(0);
	}
}
