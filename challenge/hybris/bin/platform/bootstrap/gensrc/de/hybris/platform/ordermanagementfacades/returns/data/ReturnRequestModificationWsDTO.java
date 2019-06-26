/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 26/06/2019 16:56:12
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
package de.hybris.platform.ordermanagementfacades.returns.data;

import java.io.Serializable;
import de.hybris.platform.ordermanagementfacades.returns.data.ReturnEntryModificationWsDTO;
import java.util.List;

public  class ReturnRequestModificationWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ReturnRequestModificationWsDTO.returnEntries</code> property defined at extension <code>ordermanagementwebservices</code>. */
		
	private List<ReturnEntryModificationWsDTO> returnEntries;

	/** <i>Generated property</i> for <code>ReturnRequestModificationWsDTO.refundDeliveryCost</code> property defined at extension <code>ordermanagementwebservices</code>. */
		
	private Boolean refundDeliveryCost;
	
	public ReturnRequestModificationWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setReturnEntries(final List<ReturnEntryModificationWsDTO> returnEntries)
	{
		this.returnEntries = returnEntries;
	}

		
	
	public List<ReturnEntryModificationWsDTO> getReturnEntries() 
	{
		return returnEntries;
	}
	
		
	
	public void setRefundDeliveryCost(final Boolean refundDeliveryCost)
	{
		this.refundDeliveryCost = refundDeliveryCost;
	}

		
	
	public Boolean getRefundDeliveryCost() 
	{
		return refundDeliveryCost;
	}
	


}