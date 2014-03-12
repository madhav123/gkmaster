/*
 * Copyright (c) 2005-2011 Grameen Foundation USA
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * See also http://www.apache.org/licenses/LICENSE-2.0.html for an
 * explanation of the license and how it is applied.
 */

package org.mifos.customers.business;

import java.util.Date;

import org.mifos.framework.business.AbstractEntity;

/**
 * A class that represents a row in the 'customer flag' table. A customer may
 * have several of these flags (rows).
 */
public class CustomerFlagDetailEntity extends AbstractEntity {

    @SuppressWarnings("unused")
    private final Integer customerFlagId;

    private final CustomerStatusFlagEntity statusFlag;

    private Date createdDate;
    private Short createdBy;

    /*
     * Adding a default constructor is hibernate's requirement and should not be
     * used to create a valid Object.
     */
    protected CustomerFlagDetailEntity() {
        this.customerFlagId = null;
        this.statusFlag = null;
    }

    protected CustomerFlagDetailEntity(CustomerBO customer, CustomerStatusFlagEntity statusFlag, Short createdBy,
            Date createdDate) {
        this.statusFlag = statusFlag;
        this.customerFlagId = null;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public CustomerStatusFlagEntity getStatusFlag() {
        return statusFlag;
    }


    public Short getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Short createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
