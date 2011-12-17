package com.rahulauto.ui.composer;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.hibernate.HibernateUtil;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;


public class LoginController extends GenericForwardComposer {
	private Textbox nameTxb;
    private Textbox passwordTxb;
    private Label mesgLbl;
    
    public void onClick$confirmBtn() {   	
    	
    	if(nameTxb.getText().equalsIgnoreCase("root")){
    		if(passwordTxb.getText().equalsIgnoreCase("admin")){
    			//TODO : Redirect to actual page
    			execution.sendRedirect("index.zul");
    		}else{
    			mesgLbl.setValue("Invalid Password!!!");
    		}
    	} else {
    		mesgLbl.setValue("Invalid User Name!!!");
    	}
    }
}
