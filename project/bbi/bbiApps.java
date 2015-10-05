/** bbiApps.java
*  oct 5, 2015
*  calculate your ideal weights
*/
package bbi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;


class bbiApps extends JFrame implements ActionListener {
    private JLabel lblTitle,lblName,lblHeight, lblWeight,lblCm,lblKg,lblResult,lblTodo;
    private JTextField txtName,txtHeight,txtWeight,result,ideal,txtAdvice;
    private JButton btn1,btn2,btn3;
    private Double myHeight, myWeight, myResult;
    private Date todayDate = new Date();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    private String stringDate = formatter.format(todayDate);

    public bbiApps(){
        super("How's going with your diet ?");
        Container container = getContentPane();
        container.setLayout(null);

        lblTitle = new JLabel("Today: "+ stringDate);
        lblName = new JLabel("Name");
        lblHeight = new JLabel("Height");
        lblWeight = new JLabel("Weight");
        lblCm = new JLabel("Cm");
        lblKg = new JLabel("Kg");
        lblResult = new JLabel("Calculation Result");

        txtName = new JTextField();
        txtHeight = new JTextField();
        txtWeight = new JTextField();
        result = new JTextField();
        ideal = new JTextField();

        btn1 = new JButton("Ready?");
        btn2 = new JButton("Reset Fields");
        btn3 = new JButton("X");
        
        //left, top, width, height
        lblTitle.setBounds(175, 25, 250, 75); // menghitung txtWeight badan ideal
        lblName.setBounds(50, 100, 100, 25); // txtName
        lblHeight.setBounds(50, 125, 100, 25); // txtHeight badan
        lblWeight.setBounds(50, 150, 100, 25); // txtWeight badan
        lblCm.setBounds(235, 125, 50, 25); // cm
        lblKg.setBounds(235, 150, 50, 25); // kg
        lblResult.setBounds(175, 200, 150, 25); // idealkah badan anda

        txtName.setBounds(175, 100, 200, 25);
        txtHeight.setBounds(175, 125, 50, 25);
        txtWeight.setBounds(175, 150, 50, 25);
        result.setBounds(275, 137, 100, 25);
        result.setEnabled(false);
        ideal.setBounds(50, 225, 400, 25);

        btn1.setBounds(50, 350, 133, 50); // idealkah
        btn2.setBounds(183, 350, 133, 50); // coba lagi
        btn3.setBounds(400, 350, 50, 50); // keluar

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        container.add(lblTitle);
        container.add(lblName);
        container.add(lblHeight);
        container.add(lblWeight);
        container.add(lblCm);
        container.add(lblKg);
        container.add(lblResult);

        container.add(txtName);
        container.add(txtHeight);
        container.add(txtWeight);
        container.add(result);
        container.add(ideal);

        container.add(btn1);
        container.add(btn2);
        container.add(btn3);

        setSize (500, 500);
        setLocation(400, 150);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if(obj == btn1) {calculate();}
        if(obj == btn2) {clearFields();}
        if(obj == btn3) {System.exit(0);}
    }

    public void clearFields() {
        txtName.setText("");
        txtWeight.setText("");
        txtHeight.setText("");
        result.setText("");
        ideal.setText("");
        txtName.requestFocus(true);
    }

    public void calculate() {
        if(txtWeight.getText().equals("") || txtHeight.getText().equals("") || txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all fields");
            txtName.requestFocus(true);
        } else {
            myHeight = Double.parseDouble(txtHeight.getText());
            if (myHeight < 100){
               JOptionPane.showMessageDialog(null, "Only valid for height more than 100 centimeters");
               txtHeight.requestFocus(true);
            }
            else{
              myWeight = Double.parseDouble(txtWeight.getText());
              //(tinggi badan – 100) – (15% x (tinggi badan – 100))
              double myResult = (myHeight-100) - ((15/100.0) * (myHeight - 100));

              if (myResult < myWeight) {
                  ideal.setText(txtName.getText() + ", you are fat. Try to reduce "+ String.valueOf(myWeight-myResult) + "Kg");
                  result.setText(String.valueOf(myResult));
              } else if(myResult > myWeight) {
                  ideal.setText(txtName.getText() + ", kamu kuyus deh :D. Try to add " + String.valueOf(myResult-myWeight) + "Kg");
                  result.setText(String.valueOf(myResult));
              }
              else {
                  ideal.setText("Congratulations " + txtName.getText() +"!, you are ideal !");
                  result.setText(String.valueOf(myResult));
              }  
            }
           
        }
    }

   public static void main(String[] args) {
          bbiApps ui = new bbiApps();
          ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
}

