/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.cf.study.jee.impl;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class SampleRequestScopedBean extends AbstractManagedBean {

    @Override
    public String getState() {
        return "REQUEST SCOPED BEAN: " + super.getState();
    }
}
