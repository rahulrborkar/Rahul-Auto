package com.rahulauto.ui.composer;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Combobox;

public class VehicleComposer extends GenericForwardComposer {

	private static final long serialVersionUID = -5612393926632237222L;

	private Combobox yearBox;
	private Combobox editYearBox;
	private Combobox fuelEconomyUnitBox;
	private Combobox fuelCapacityUnitBox;
	private Combobox fuelReserveUnitBox;
	private Combobox fuelTypeBox;
	private Combobox exShowPriceUnitBox;
	private Combobox onRoadPriceUnitBox;

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);

		yearBox.setSelectedIndex(0);
		editYearBox.setSelectedIndex(0);
		fuelEconomyUnitBox.setSelectedIndex(0);
		fuelCapacityUnitBox.setSelectedIndex(0);
		fuelReserveUnitBox.setSelectedIndex(0);
		fuelTypeBox.setSelectedIndex(0);
		exShowPriceUnitBox.setSelectedIndex(0);
		onRoadPriceUnitBox.setSelectedIndex(0);

	}

}