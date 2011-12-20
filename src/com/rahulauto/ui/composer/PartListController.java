package com.rahulauto.ui.composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

public class PartListController extends GenericForwardComposer {

	private static final long serialVersionUID = -2635636472443599553L;
	
	private Button addPartButton;
	private Window partList;

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);

	}

	public void onClick$addPartButton() {
		Window window = (Window) Executions.createComponents("/admin/part/AddPart.zul", partList, null);
		window.doPopup();
	}

}
