package com.rahulauto.ui.composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Decimalbox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.rahulauto.hibernate.dao.PartDAO;
import com.rahulauto.hibernate.entities.Part;

public class AddPartController extends GenericForwardComposer {

	private static final long serialVersionUID = -1655398794634515964L;

	private Window addPartWindow;

	private Button addButton;

	private Textbox companyName;
	private Textbox localName;
	private Textbox vehicleType;
	private Textbox bodyType;
	private Decimalbox companyPrice;
	private Decimalbox localPrice;

	private PartDAO partDao;

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);
	}

	public void onClick$addButton() throws Exception {

		Messagebox.show("Are you sure to save?", "Confirm Dialog", Messagebox.OK | Messagebox.CANCEL, Messagebox.QUESTION, new org.zkoss.zk.ui.event.EventListener() {

			public void onEvent(Event evt) throws InterruptedException {

				if (evt.getName().equals("onOK")) {

					Part part = new Part();
					part.setCompanyPartName(companyName.getValue());
					part.setLocalPartName(localName.getValue());
					part.setVehicleType(vehicleType.getValue());
					part.setBodyType(bodyType.getValue());
					part.setCompanyPrice(companyPrice.getValue().doubleValue());
					part.setLocalPrice(localPrice.getValue().doubleValue());

					partDao = new PartDAO();
					partDao.saveOrUpdate(part);

					alert("Data Saved !");

					addPartWindow.detach();

				}
			}
		});
	}
}