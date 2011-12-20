package com.rahulauto.ui.composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;

import com.rahulauto.hibernate.dao.PartDAO;
import com.rahulauto.hibernate.entities.Part;

public class AddPartController extends GenericForwardComposer {

	private static final long serialVersionUID = -1655398794634515964L;

	private Button addButton;

	private Textbox companyName;
	private Textbox localName;
	private Textbox vehicleType;
	private Textbox bodyType;
	private Textbox companyPrice;
	private Textbox localPrice;

	private PartDAO partDao;

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);
	}

	public void onClick$addButton() {

		try {
		Part part = new Part();
		part.setCompanyPartName(companyName.getValue());
		part.setLocalPartName(localName.getValue());
		part.setVehicleType(vehicleType.getValue());
		part.setBodyType(bodyType.getValue());
		part.setCompanyPrice(Double.valueOf(companyPrice.getValue()));
		part.setLocalPrice(Double.valueOf(localPrice.getValue()));

		partDao = new PartDAO();
		partDao.saveOrUpdate(part);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
