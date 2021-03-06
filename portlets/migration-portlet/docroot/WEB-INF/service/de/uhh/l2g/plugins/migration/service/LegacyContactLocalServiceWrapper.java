/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package de.uhh.l2g.plugins.migration.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LegacyContactLocalService}.
 *
 * @author unihh
 * @see LegacyContactLocalService
 * @generated
 */
public class LegacyContactLocalServiceWrapper
	implements LegacyContactLocalService,
		ServiceWrapper<LegacyContactLocalService> {
	public LegacyContactLocalServiceWrapper(
		LegacyContactLocalService legacyContactLocalService) {
		_legacyContactLocalService = legacyContactLocalService;
	}

	/**
	* Adds the legacy contact to the database. Also notifies the appropriate model listeners.
	*
	* @param legacyContact the legacy contact
	* @return the legacy contact that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyContact addLegacyContact(
		de.uhh.l2g.plugins.migration.model.LegacyContact legacyContact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.addLegacyContact(legacyContact);
	}

	/**
	* Creates a new legacy contact with the primary key. Does not add the legacy contact to the database.
	*
	* @param contactId the primary key for the new legacy contact
	* @return the new legacy contact
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyContact createLegacyContact(
		long contactId) {
		return _legacyContactLocalService.createLegacyContact(contactId);
	}

	/**
	* Deletes the legacy contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the legacy contact
	* @return the legacy contact that was removed
	* @throws PortalException if a legacy contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyContact deleteLegacyContact(
		long contactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.deleteLegacyContact(contactId);
	}

	/**
	* Deletes the legacy contact from the database. Also notifies the appropriate model listeners.
	*
	* @param legacyContact the legacy contact
	* @return the legacy contact that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyContact deleteLegacyContact(
		de.uhh.l2g.plugins.migration.model.LegacyContact legacyContact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.deleteLegacyContact(legacyContact);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _legacyContactLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.migration.model.impl.LegacyContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.migration.model.impl.LegacyContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyContact fetchLegacyContact(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.fetchLegacyContact(contactId);
	}

	/**
	* Returns the legacy contact with the primary key.
	*
	* @param contactId the primary key of the legacy contact
	* @return the legacy contact
	* @throws PortalException if a legacy contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyContact getLegacyContact(
		long contactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.getLegacyContact(contactId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the legacy contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.migration.model.impl.LegacyContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of legacy contacts
	* @param end the upper bound of the range of legacy contacts (not inclusive)
	* @return the range of legacy contacts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<de.uhh.l2g.plugins.migration.model.LegacyContact> getLegacyContacts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.getLegacyContacts(start, end);
	}

	/**
	* Returns the number of legacy contacts.
	*
	* @return the number of legacy contacts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLegacyContactsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.getLegacyContactsCount();
	}

	/**
	* Updates the legacy contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param legacyContact the legacy contact
	* @return the legacy contact that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.migration.model.LegacyContact updateLegacyContact(
		de.uhh.l2g.plugins.migration.model.LegacyContact legacyContact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _legacyContactLocalService.updateLegacyContact(legacyContact);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _legacyContactLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_legacyContactLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _legacyContactLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LegacyContactLocalService getWrappedLegacyContactLocalService() {
		return _legacyContactLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLegacyContactLocalService(
		LegacyContactLocalService legacyContactLocalService) {
		_legacyContactLocalService = legacyContactLocalService;
	}

	@Override
	public LegacyContactLocalService getWrappedService() {
		return _legacyContactLocalService;
	}

	@Override
	public void setWrappedService(
		LegacyContactLocalService legacyContactLocalService) {
		_legacyContactLocalService = legacyContactLocalService;
	}

	private LegacyContactLocalService _legacyContactLocalService;
}