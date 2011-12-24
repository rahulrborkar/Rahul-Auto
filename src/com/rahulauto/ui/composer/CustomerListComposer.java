package com.rahulauto.ui.composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.SuspendNotAllowedException;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

public class CustomerListComposer extends GenericForwardComposer {

	private static final long serialVersionUID = 1981220507251863649L;
	
	private Button addCustomerButton;

	@Override
	public void doAfterCompose(Component comp) throws Exception {

		super.doAfterCompose(comp);
	}
	
	public void onClick$addCustomerButton() throws SuspendNotAllowedException, InterruptedException {
		Window window = (Window) Executions.createComponents("/admin/customer/AddCustomer.zul", null, null);
		window.doModal();
	}

}
