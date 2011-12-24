package com.rahulauto.ui.model;

import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Row;
import org.zkoss.zul.RowRenderer;

import com.rahulauto.hibernate.dao.PartDAO;
import com.rahulauto.hibernate.entities.Part;

public class PartsListRenderer implements RowRenderer {

	private PartDAO partDao;
	
	private int id = 1;

	@Override
	public void render(final Row row, final java.lang.Object part) {
		Part newPart = (Part) part;
		row.appendChild(new Label(id + ""));
		new Label(newPart.getCompanyPartName()).setParent(row);
		new Label(newPart.getLocalPartName()).setParent(row);
		new Label(newPart.getVehicleType()).setParent(row);
		new Label(newPart.getBodyType()).setParent(row);
		new Label(newPart.getCompanyPrice().toString()).setParent(row);
		new Label(newPart.getLocalPrice().toString()).setParent(row);

		final Button updateButton = new Button(null, "/images/edit-icon.png");
		updateButton.setWidth("25px");
		updateButton.setHeight("25px");
		updateButton.addEventListener(Events.ON_CLICK, new EventListener() {
			public void onEvent(Event event) throws Exception {
				partDao.saveOrUpdate((Part) part);
				row.getGrid().setModel(new ListModelList(partDao.findAll()));
			}
		});
		row.appendChild(updateButton);

		final Button deleteButton = new Button(null, "/images/delete-icon.png");
		deleteButton.setWidth("25px");
		deleteButton.setHeight("25px");
		deleteButton.addEventListener(Events.ON_CLICK, new EventListener() {
			public void onEvent(Event event) throws Exception {
				partDao.delete((Part) part);
				row.getGrid().setModel(new ListModelList(partDao.findAll()));
			}
		});
		row.appendChild(deleteButton);
		id += 1;
	}
}
