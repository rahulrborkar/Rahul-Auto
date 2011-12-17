package com.rahulauto.ui.composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Include;

public class MainComposer extends GenericForwardComposer {
	
	private Include contents;
	public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
	}
	
	private void displayPage(String sourceZul){		
		contents.setSrc(null);
		contents.setSrc(sourceZul);
	}
	
	public void onClick$listPart() {
		displayPage("/admin/part/partList.zul");
    }
}
