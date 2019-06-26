/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 26/06/2019 16:56:11
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.ruleengineservices.rao;

import de.hybris.platform.ruleengineservices.rao.AbstractRuleActionRAO;
import de.hybris.platform.ruleengineservices.rao.DeliveryModeRAO;

public  class ShipmentRAO extends AbstractRuleActionRAO 
{

 

	/** <i>Generated property</i> for <code>ShipmentRAO.mode</code> property defined at extension <code>ruleengineservices</code>. */
		
	private DeliveryModeRAO mode;
	
	public ShipmentRAO()
	{
		// default constructor
	}
	
		
	
	public void setMode(final DeliveryModeRAO mode)
	{
		this.mode = mode;
	}

		
	
	public DeliveryModeRAO getMode() 
	{
		return mode;
	}
	


}