package com.rahulauto.ui.composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.SuspendNotAllowedException;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Grid;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Window;

import com.rahulauto.hibernate.dao.PartDAO;
import com.rahulauto.ui.model.PartsListRenderer;

public class PartListComposer extends GenericForwardComposer {

	private static final long serialVersionUID = -2635636472443599553L;

	private Button addPartButton;
	private Window partListWindow;

	private Grid partsListGrid;

	private PartDAO partDao;

	@Override
	public void doAfterCompose(Component comp) throws Exception {

		super.doAfterCompose(comp);

		partDao = new PartDAO();

		partsListGrid.setModel(new ListModelList(partDao.findAll()));
		partsListGrid.setRowRenderer(new PartsListRenderer());

	}

	public void onClick$addPartButton() throws SuspendNotAllowedException, InterruptedException {
		Window window = (Window) Executions.createComponents("/admin/part/AddPart.zul", null, null);
		window.doModal();
	}

}
