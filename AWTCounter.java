import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
 
// An AWT program inherits from the top-level container java.awt.Frame
public class AWTCounter extends Frame implements ActionListener {
   private Label lblCount;    // Declare a Label component 
   private TextField tfCount; // Declare a TextField component 
   private Button but1;  
   private Button but2;       // Declare a Button component
   private int count = 0;     // Counter's value
   private Label lblCount2;
   // Constructor to setup GUI components and event handlers
   public AWTCounter () {
      setLayout(new FlowLayout());
         // "super" Frame (a Container) sets its layout to FlowLayout, which arranges
         // the components from left-to-right, and flow to next row from top-to-bottom.
 
      lblCount = new Label("Counter");  // construct the Label component
      add(lblCount);                    // "super" Frame adds Label
 
	  lblCount2 = new Label("2nd Label");
	  add(lblCount2);
 
      tfCount = new TextField("0", 10); // construct the TextField component
      tfCount.setEditable(false);       // set to read-only
      add(tfCount);                     // "super" Frame adds TextField
 
      but1 = new Button("Count");   // construct the Button component
      add(but1);                    // "super" Frame adds Button
	  
      but1.addActionListener(this);
	  
	  but2 = new Button("2nd Button");
	  add(but2);
	  
	  but2.addActionListener(this);
         // but1 is the source object that fires ActionEvent when clicked.
         // The source add "this" instance as an ActionEvent listener, which provides
         //  an ActionEvent handler called actionPerformed().
         // Clicking but1 invokes actionPerformed().
 
      setTitle("Caesar Cipher GUI");  // "super" Frame sets its title
      setSize(500, 500);        // "super" Frame sets its initial window size
 
      // For inspecting the components/container objects
      // System.out.println(this);
      // System.out.println(lblCount);
      // System.out.println(tfCount);
      // System.out.println(but1);
 
      setVisible(true);         // "super" Frame shows
 
      // System.out.println(this);
      // System.out.println(lblCount);
      // System.out.println(tfCount);
      // System.out.println(but1);
   }
 
   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor to setup the GUI, by allocating an instance
      AWTCounter app = new AWTCounter();
         // or simply "new AWTCounter();" for an anonymous instance
   }
 
   // ActionEvent handler - Called back upon button-click.
   @Override
   public void actionPerformed(ActionEvent evt) {
	   ++count;
	  for(;;){
	  
	  tfCount.setText(count + "");
	  
		 if(count == 10){
		  System.exit(0);
		  }
	  }
       // convert int to String
	 // }
   
   }
}