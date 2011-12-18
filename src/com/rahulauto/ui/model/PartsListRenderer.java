package com.rahulauto.ui.model;

import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Button;
import org.zkoss.zul.Image;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Row;
import org.zkoss.zul.RowRenderer;

import com.rahulauto.hibernate.dao.PartDAO;
import com.rahulauto.hibernate.entities.Part;

public class PartsListRenderer implements RowRenderer {

	private PartDAO partDao;

	@Override
	public void render(final Row row, final java.lang.Object part) {
		String[] ary = (String[]) part;
		row.appendChild(new Image(""));
		new Label(ary[0]).setParent(row);
		new Label(ary[1]).setParent(row);
		new Label(ary[2]).setParent(row);
		new Label(ary[3]).setParent(row);
		new Label(ary[4]).setParent(row);
		new Label(ary[5]).setParent(row);

		final Button updateButton = new Button("Update");
		updateButton.addEventListener(Events.ON_CLICK, new EventListener() {
			public void onEvent(Event event) throws Exception {
				partDao.delete((Part) part);
				row.getGrid().setModel(new ListModelList(partDao.findAll()));
			}
		});
		row.appendChild(updateButton);

		final Button deleteButton = new Button("Delete");
		deleteButton.addEventListener(Events.ON_CLICK, new EventListener() {
			public void onEvent(Event event) throws Exception {
				partDao.delete((Part) part);
				row.getGrid().setModel(new ListModelList(partDao.findAll()));
			}
		});
		row.appendChild(deleteButton);
	}
}
