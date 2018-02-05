import javax.swing.JTextField;

public class View extends javax.swing.JFrame{
	

    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text2;
    private javax.swing.JLabel TextR;
    private javax.swing.JButton add;
    private javax.swing.JButton div;
    private javax.swing.JButton mod;
    private javax.swing.JButton mul;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton sub;
    private Controller control;
	 
    public void add(Controller c){
    	control=c;
    	initComponents();
    }



	    private void initComponents() {

	    	
	    	
	        Text2 = new javax.swing.JTextField();
	        Text1 = new javax.swing.JTextField();
	        add = new javax.swing.JButton();
	        sub = new javax.swing.JButton();
	        mul = new javax.swing.JButton();
	        div = new javax.swing.JButton();
	        sqrt = new javax.swing.JButton();
	        TextR = new javax.swing.JLabel();
	        mod = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setVisible(true);
	        /****************************************************************************/

	       
	        add.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	
	            	if(control.addActionPerformed(evt,Text1.getText(),Text2.getText())){
	            		Update(""+control.getResult());
	            	}
	            }
	        });
	        
	        
	        sub.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	if(control.subActionPerformed(evt,Text1.getText(),Text2.getText())){
	            		Update(""+control.getResult());
	            	}
	            }
	        });
	        
	        mul.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	if(control.mulActionPerformed(evt,Text1.getText(),Text2.getText())){
	            		Update(""+control.getResult());
	            	}
	            }
	        });
	        
	        div.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	if(control.divActionPerformed(evt,Text1.getText(),Text2.getText())){
	            		Update(""+control.getResult());
	            	}
	            }
	        });
	        
	        sqrt.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	if(control.sqrtActionPerformed(evt,Text1.getText())){
	            		Update(""+control.getResult());
	            	}
	            }
	        });
	        
	        mod.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	if(control.modActionPerformed(evt,Text1.getText(),Text2.getText())){
	            		Update(""+control.getResult());
	            	}
	            }
	        });
	        
	        /****************************************************************************/
	        
	        
	        sub.setText("sub");

	        add.setText("add");
	        
	        mul.setText("mul");

	        div.setText("div");

	        sqrt.setText("sqrt");

	        TextR.setFont(new java.awt.Font("Terminator Two", 1, 12)); // NOI18N
	        TextR.setText("558");
	        TextR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	        mod.setText("mod");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                            .addComponent(add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
	                            .addComponent(Text2, javax.swing.GroupLayout.Alignment.LEADING))
	                        .addGap(18, 18, 18)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(sub, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
	                            .addComponent(mul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addGap(18, 18, 18)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
	                            .addComponent(TextR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	                .addGap(0, 23, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addComponent(TextR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap(24, Short.MAX_VALUE))
	        );

	        JTextField j=Text1;
	        Text1=Text2;
	        Text2=j;
	        pack();
	    }                 
                                 
	    
	    public void Update(String h){
	    	TextR.setText(h);
	    }



		public void doError(String string) {
			Update(string);
		}
	                                 
              
	}

