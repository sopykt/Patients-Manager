/*
 * Patients Manager is a software which allows doctors to manage their
 * patients: they can be registered, edited, deleted and easy-searched
 * thanks to some filters options. A nice summary patient-information
 * panel is also provided.
 * 
 * Copyright (C) 2017 - Giulio Biagini - giulio.biagini90@gmail.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */



package it.biagio.patientsmanager.view.panel.info.personal;



import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;

import it.biagio.patientsmanager.model.entities.info.personal.APersonalInfo;
import it.biagio.patientsmanager.model.entities.info.personal.DoctorPersonalInfo;
import it.biagio.patientsmanager.view.Const;



@SuppressWarnings("serial")
public class UneditableDoctorPersonalInfo extends AUneditablePersonalInfo
{
	private JLabel specializationLabel;
	
	private JLabel specializationValue;
	
	
	
	public UneditableDoctorPersonalInfo() {
		super();
		
		specializationLabel = new JLabel(Const.PERSONAL_INFO_SPECIALIZATION);
		specializationLabel.setFont(Const.PLAIN_FONT);
		specializationValue = new JLabel();
		specializationValue.setFont(Const.BOLD_FONT);
		
		add(specializationLabel, new GridBagConstraints(2, 2, 1, 1, 0.2, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 0, 5), 0, 0));
		add(specializationValue, new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 0, 0), 0, 0));
	}
	
	
	
	@Override
	public void setPersonalInfo(APersonalInfo doctorPersonalInfo) {
		super.setPersonalInfo(doctorPersonalInfo);
		if (doctorPersonalInfo != null)
			specializationValue.setText(((DoctorPersonalInfo) doctorPersonalInfo).getSpecialization());
	}
}