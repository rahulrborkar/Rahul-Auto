package com.rahulauto.ui.composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Include;

public class MainComposer extends GenericForwardComposer {

	private static final long serialVersionUID = 72604379476908925L;

	private Include contents;
	
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}

	private void displayPage(String sourceZul){		
		contents.setSrc(sourceZul);
	}

	public void onClick$listPart() {
		displayPage("/admin/part/partList.zul");
	}
}
