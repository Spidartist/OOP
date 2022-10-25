import javax.swing.JOptionPane;

public class Bai226 {
	public static void main(String[] args) {
		String option = JOptionPane.showInputDialog(null,
				"Choose equation to solve\n"
				+ "1. The first-degree equation (linear equation) with one variable\n"
				+ "2. The system of first-degree equations (linear system) with two variables\n"
				+ "3. The second-degree equation with one variable");
		int IntOption = (int)Double.parseDouble(option);
		switch (IntOption) {
			case 1:
				String a = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double da = Double.parseDouble(a);
				while (da == 0d) {
					a = JOptionPane.showInputDialog(null, "Input the a",
							  JOptionPane.INFORMATION_MESSAGE);
					da = Double.parseDouble(a);
				};
				String b = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double db = Double.parseDouble(b);
				double result = -db/da;
				JOptionPane.showMessageDialog(null, "Result x: " + Double.toString(result));
				break;
			case 2:
				String a11 = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double da11 = Double.parseDouble(a11);
				String a12 = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double da12 = Double.parseDouble(a12);
				String a21 = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double da21 = Double.parseDouble(a21);
				String a22 = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double da22 = Double.parseDouble(a22);
				String b1 = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double db1 = Double.parseDouble(b1);
				String b2 = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double db2 = Double.parseDouble(b2);
		        Double D = da11 * da22 - da12 * da21;
		        Double D1 = db1 * da22 - db2 * da12;
		        Double D2 = da11 * db2 - da21 * db1;
		        JOptionPane.showMessageDialog(null, "Solution: " + " x1 = " + (D1 / D) + " x2 = " + (D2 / D));
				break;
			case 3:
				String a3 = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double da3 = Double.parseDouble(a3);
				while (da3 == 0d) {
					a3 = JOptionPane.showInputDialog(null, "Input the a",
							  JOptionPane.INFORMATION_MESSAGE);
					da3 = Double.parseDouble(a3);
				};
				String b3 = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double db3 = Double.parseDouble(b3);
				String c3 = JOptionPane.showInputDialog(null, "Input the a",
						  JOptionPane.INFORMATION_MESSAGE);
				double dc3 = Double.parseDouble(c3);
				double delta = db3*db3 - 4*da3*dc3;
				double x1 = (-db3 + Math.sqrt(delta))/(2*da3); 
				double x2 = (-db3 - Math.sqrt(delta))/(2*da3); 
				JOptionPane.showMessageDialog(null, "Result x1: " + Double.toString(x1) + "\n" +
													"Result x2: " + Double.toString(x2) + "\n");
				break;
		   	default:
		   		System.out.println("Thoat");
		   		break;
       }
		System.exit(0);
	}
}
