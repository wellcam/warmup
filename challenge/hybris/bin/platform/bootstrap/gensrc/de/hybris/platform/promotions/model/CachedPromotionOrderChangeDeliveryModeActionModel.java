/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26/06/2019 16:55:50                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.promotions.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.promotions.model.PromotionOrderChangeDeliveryModeActionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CachedPromotionOrderChangeDeliveryModeAction first defined at extension promotions.
 */
@SuppressWarnings("all")
public class CachedPromotionOrderChangeDeliveryModeActionModel extends PromotionOrderChangeDeliveryModeActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "CachedPromotionOrderChangeDeliveryModeAction";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CachedPromotionOrderChangeDeliveryModeActionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CachedPromotionOrderChangeDeliveryModeActionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _deliveryMode initial attribute declared by type <code>PromotionOrderChangeDeliveryModeAction</code> at extension <code>promotions</code>
	 */
	@Deprecated
	public CachedPromotionOrderChangeDeliveryModeActionModel(final DeliveryModeModel _deliveryMode)
	{
		super();
		setDeliveryMode(_deliveryMode);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _deliveryMode initial attribute declared by type <code>PromotionOrderChangeDeliveryModeAction</code> at extension <code>promotions</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public CachedPromotionOrderChangeDeliveryModeActionModel(final DeliveryModeModel _deliveryMode, final ItemModel _owner)
	{
		super();
		setDeliveryMode(_deliveryMode);
		setOwner(_owner);
	}
	
	
}